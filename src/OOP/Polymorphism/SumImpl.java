package OOP.Polymorphism;


class Sum {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}

public class SumImpl {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println(s1.sum(4, 6));
        System.out.println(s1.sum(3, 5, 7));
        System.out.println(s1.sum(3.4, 7.9));
    }
}

