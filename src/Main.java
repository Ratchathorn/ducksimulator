public class Main {

    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
        FlockSimulator simulator = new FlockSimulator();

        // เลือก factory ที่ผลิต Quackable
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        // run simulation
        simulator.simulate(duckFactory);
    }
}
