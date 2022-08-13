// echo เสียงของ Quackable
public class QuackEcho implements Quackable{

    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        // quack ธรรมดา
        duck.quack();

        // เสียง echo ที่ตามมา
        System.out.print("Echo: ");
        duck.quack();
    }
}
