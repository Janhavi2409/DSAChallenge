package SearchingAlgorithms;

public class OrderAgnosticBS {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }

                if (isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-12, -9, 0, 34, 67, 78, 95, 99};
        int target = 78;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
