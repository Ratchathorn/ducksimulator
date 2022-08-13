public class FlockSimulator {

    void simulate(AbstractDuckFactory duckFactory) {

        // สร้าง Quackable ที่สามารถเรียก quack() ได้
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        // สร้าง Flock ที่มีแต่ Quackable
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        // สร้าง Flock ที่มีแต่ MallardDuck
        Flock flockOfMallards = new Flock();

        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        // เพิ่ม Flock ที่มีแต่ MallardDuck
        // เข้าไปใน Flock ของ Quackable
        flockOfDucks.add(flockOfMallards);

        // simulate flock ของ quackable
        System.out.println("\nWhole Flock Simulation");
        simulate(flockOfDucks);

        // simulate flock ของ mallard
        System.out.println("\nMallard Flock Simulation");
        simulate(flockOfMallards);





        System.out.println("\nThe ducks quacked "
                + QuackCounter.getQuacks()
                + " times");

        /**
         * ถ้า simulate ฝูงที่มี Quackable ทั้งหมด จะเห็นว่า
         * จะมีจ่าฝูงทั้งในฝูง quackable และฝูง mallard
         * เพราะว่าทั้งคู่ใช้คลาส Flock เหมือนกัน ซึ่งเวลากำหนด
         * จ่าฝูงใน Flock จะทำให้กำหนดจ่าฝูงของฝูง mallard ไปด้วย
         * ถึงแม้ว่าฝูง mallard จะอยู่ในฝูงของ Quackable ก็ตาม
         */
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
