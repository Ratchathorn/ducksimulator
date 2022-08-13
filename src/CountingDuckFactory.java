// ใส่ QuackCounter เพื่อมั่นใจว่าเมื่อ Quackable quack()
// จะถูกนับอย่างแน่นอน เพราะกำหนดตั้งแต่ตอนสร้าง object
// ไม่ได้กำหนดข้างนอก
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(
                new MallardDuck()
        );
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(
                new RedheadDuck()
        );
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(
                new DuckCall()
        );
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(
                new RubberDuck()
        );
    }
}
