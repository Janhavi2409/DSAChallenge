public class DiwaliPattern {
    public static void main(String[] args) {

//            *
//          * * *
//        * * * * *
//          * * *
//            *
//            * * * * * * * * * * * * * * * * *
//             * * * * * * * * * * * * * * * *
//              * * * * * * * * * * * * * * *
//               * * * * * * * * * * * * * *
//                * * * * * * * * * * * * *
//                 * * * * * * * * * * * *

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 2 * (i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 3 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 2 * (i - 1); j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 19; j++) {
                if (j < 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 19; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 18 - i; k++) {
                if (i > 4) {
                    break;
                } else {
                    if (k < 2) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
