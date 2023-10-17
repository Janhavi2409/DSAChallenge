package ArrayLists;

import java.util.ArrayList;

public class MethodReference {
    public static void printSquare(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.forEach(System.out::println);
        System.out.println();
        al.forEach(MethodReference::printSquare);
    }
}
