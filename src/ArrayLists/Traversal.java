package ArrayLists;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        //Method 1
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        //Method 2
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //Method 3
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //we can easily remove any element from the arraylist using iterator while we are traversing
        //which we can't do by using for each, enhanced for and for loop.

        //Method 4
        al.forEach(x -> System.out.print(x + " "));
    }
}