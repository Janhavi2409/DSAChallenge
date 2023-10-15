package ClassesAndObjects;

class MyClass {
    public void display() {
        System.out.println("Hello World");
    }
}

public class CreatingClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();
    }
}
