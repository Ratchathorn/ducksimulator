// design pattern - adapter
// ปรับ Goose ให้ใช้กับ Quackable ได้
public class GooseAdapter implements Quackable{
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    // เปลี่ยน honk() ของ Goose ให้เรียกผ่าน quack() ของ Quackable
    @Override
    public void quack() {
        goose.honk();
    }
}
