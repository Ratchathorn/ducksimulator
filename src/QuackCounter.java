// design pattern - decorator
// ตกแต่ง Quackable เพื่อให้นับจำนวนครั้งที่ quack ได้
public class QuackCounter implements Quackable{

    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    // นับจำนวนครั้งที่ quack
    @Override
    public void quack() {
        // เพิ่มเข้าไปเพื่อให้การมองเห็นการนับง่ายขึ้น
        System.out.print("(counted) ");

        // นับปกติ
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
