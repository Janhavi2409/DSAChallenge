package Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //2D array
        int[][] arr = new int[2][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        //3D array
        int[][][] arr2 = new int[2][3][4];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                for (int k = 0; k < arr2[i][j].length; k++) {
                    arr2[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int[][] i : arr2) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
