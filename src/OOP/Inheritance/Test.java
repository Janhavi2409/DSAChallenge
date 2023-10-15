package OOP.Inheritance;

class Base {
    void print() {
        System.out.println("In base class");
    }
}

class Derived extends Base {
    @Override
    void print() {
        System.out.println("In derived class");
    }
}

public class Test {
    public static void main(String[] args) {
        Base base = new Derived();
        base.print();
    }
}
