public class DuckSimulator {

    // simulate โดยสร้าง object เอง
    void simulate() {
        // สร้าง Quackable ที่สามารถเรียก quack() ได้
        // ใช้ QuackCounter ครอบ Quackable ที่เป็นเป็ดเท่านั้น
        // ใช้ QuackEcho เพื่อสมมติเสียงสะท้อนของ Quackable บางอย่าง

        // decorate QuackEcho ใน QuackCounter
        // จะทำให้นับ quack 1 ครั้ง
        Quackable mallardDuck = new QuackCounter(
                new QuackEcho(
                        new MallardDuck()
                )
        );
        // decorate QuackCounter ใน QuackEcho
        // จะทำให้ QuackCounter นับ quack ที่ echo ด้วย
        // กลายเป็นนับ quack 2 ครั้ง
        Quackable redheadDuck = new QuackEcho(
                new QuackCounter(
                        new RedheadDuck()
                )
        );
        Quackable duckCall = new QuackCounter(
                new DuckCall()
        );
        Quackable rubberDuck = new QuackCounter(
                new RubberDuck()
        );

        // Goose กับ Pigeon ไม่สามารถ quack() ได้โดยปกติ
        // จึงต้องมี adapter มาแปลงให้สามารถเรียก
        // ผ่าน quack() ได้
        Quackable goose = new QuackEcho(
                new GooseAdapter(
                        new Goose()
                )
        );
        Quackable pigeon = new PigeonAdapter(
                new Pigeon()
        );


        System.out.println("\nDuck Simulator");

        // เรียกให้ร้องทีละตัว
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);

        System.out.println("\nThe ducks quacked "
                + QuackCounter.getQuacks()
                + " times");

        /**
         * จะเห็นได้ว่า Adapter Pattern นั้นเพียงแค่เปลี่ยน object
         * ให้นำไปใช้กับ Interface ได้ แต่ Decorator Pattern
         * จะเป็นการนำ Interface นั้นมาตกแต่งเพื่อใช้งานเพิ่ม
         */
    }

    // simulate โดยให้ Factory สร้างให้
    void simulate(AbstractDuckFactory duckFactory) {

        // สร้าง Quackable ที่สามารถเรียก quack() ได้
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        // เรียกให้ร้องทีละตัว
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("\nThe ducks quacked "
                + QuackCounter.getQuacks()
                + " times");

        /**
         * ถ้าใช้ DuckFactory สร้าง Quackable จะไม่มีการนับ quack()
         * ถ้าใช้ CountingFactory จะนับ quack() แต่ไม่มี echo
         * ถ้าใช้ CountingEchoFactory จะนับ quack()
         * แต่ไม่นับเสียง echo เป็น quack() 1อีกครั้ง
         * ถ้าใช้ EchoCountingFactory จะนับ quack()
         * และนับเสียง echo เป็น quack() 1 ครั้ง
         */
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
