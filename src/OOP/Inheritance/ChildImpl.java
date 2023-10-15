package OOP.Inheritance;

interface Mother {
    void printMother();
}

interface Father {
    void printFather();
}

class Child implements Mother, Father {

    @Override
    public void printMother() {
        System.out.println("In mother interface");
    }

    @Override
    public void printFather() {
        System.out.println("In father interface");
    }
}

public class ChildImpl {
    public static void main(String[] args) {
        Child child = new Child();
        child.printMother();
        child.printFather();
    }
}
