// ทำให้ Pigeon สามารถใช้กับ Quackable ได้
public class PigeonAdapter implements Quackable{
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        // coo 2 ตรั้ง = quack 1 ครั้ง
        pigeon.coo();
        pigeon.coo();
    }
}
