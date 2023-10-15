package ClassesAndObjects;

class Addition {
    int a;
    int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumNum() {
        return this.a + this.b;
    }
}

public class AdditionImpl {
    public static void main(String[] args) {
        Addition addition = new Addition(4, 6);
        System.out.println(addition.sumNum());
    }
}
