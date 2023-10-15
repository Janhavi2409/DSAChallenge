package OOP.DataAbstraction;

abstract class CarFun {
    abstract void move();

    abstract void stop();
}

class CarFunImpl extends CarFun {
    @Override
    void move() {
        System.out.println("Car is moving");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");
    }
}

public class CarFunction {
    public static void main(String[] args) {
        CarFunImpl c1 = new CarFunImpl();
        c1.move();
        c1.stop();
    }
}