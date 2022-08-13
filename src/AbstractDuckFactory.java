// design pattern - abstract factory pattern
// เป็นการสร้าง abstract class เพื่อใช้กับ factory pattern
// เพราะอาจสร้าง factory นี้หลายรอบ
public abstract class AbstractDuckFactory {

    // มีคำสั่งในการสร้าง Quackable แต่ละประเภทแยกกันไป
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
