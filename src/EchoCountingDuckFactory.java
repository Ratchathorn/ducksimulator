// เป็น DuckFactory ที่นับเสียง echo ของ quack เป็น 1 ครั้ง
// QuackEcho -> QuackCounter -> Quackable
// new QuackEcho( new QuackCounter( new MallardDuck()));
public class EchoCountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(
                new QuackCounter(
                        new MallardDuck()
                )
        );
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(
                new QuackCounter(
                        new RedheadDuck()
                )
        );
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(
                new QuackCounter(
                        new DuckCall()
                )
        );
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(
                new QuackCounter(
                        new RubberDuck()
                )
        );
    }
}
