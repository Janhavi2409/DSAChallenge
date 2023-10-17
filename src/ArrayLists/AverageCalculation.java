package ArrayLists;

import java.util.*;

public class AverageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        double sum = 0;
        System.out.print("Enter size of array list: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            int x = sc.nextInt();
            al.add(x);
        }
        for (Integer integer : al) {
            sum += integer;
        }
        System.out.println("ArrayList = " + al);
        System.out.println("Average  = " + sum / al.size());
    }
}
