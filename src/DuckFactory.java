// design pattern - factory pattern
// เป็นการสร้าง object ภายในคลาสเดียว
// โดยที่ไม่ต้องเรียก object โดยตรง
// ทำให้สามารถเพิ่ม decorator หรือการทำงานอื่นๆ ได้
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
