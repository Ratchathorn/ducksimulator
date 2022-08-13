import java.util.ArrayList;
//import java.util.Iterator;

// design pattern - composite pattern
// เป็นการใช้ collection ของ class ที่ใช้ interface
// แต่ตัวเองก็ใช้ interface ตัวเดียวกัน

// Flock implements Quackable ทั้งๆ ที่มี
// Quackable Collection เป็น attribute
public class Flock implements Quackable{

    ArrayList<Quackable> quackers = new ArrayList<>();

    @Override
    public void quack() {
//        Iterator iterator = quackers.iterator();
//        while (iterator.hasNext()) {
//            Quackable quacker = (Quackable) iterator.next();
//            quacker.quack();
//        }

        for (Quackable quacker : quackers) {
            // จ่าฝูงจะ quack 3 ครั้ง
            // จ่าฝูงคือ Quackable ตัวแรก
            if (quackers.get(0) == quacker) {
                quacker.quack();
                quacker.quack();
                quacker.quack();
            }
            // Quackable ตัวที่เหลือ quack 1 ครั้ง
            else {
                quacker.quack();
            }
        }
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
}
