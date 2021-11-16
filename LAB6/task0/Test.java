package LAB6.task0;

interface Engine {
    public int getFuelCapacity();
}

class Car {
    class OttoEngine implements Engine {
        private int fuelCapacity;

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }

    public OttoEngine getEngine() {
        OttoEngine engine = new OttoEngine(11);
        return engine;
//    public Engine getEngine() {
//        return new Engine() {
//            private int fuelCapacity = 11;
//
//            public int getFuelCapacity() {
//                return fuelCapacity;
//            }
    };
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        Car.OttoEngine firstEngine = car.getEngine();
        Car.OttoEngine secondEngine = car.new OttoEngine(10);

        System.out.println(firstEngine.getFuelCapacity()); // should print 11
        System.out.println(secondEngine.getFuelCapacity()); // should print 10
    }
}
