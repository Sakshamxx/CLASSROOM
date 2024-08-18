package Lecture03;

public class UpperBound {
    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 8, 10};
        int target = 4;

        int result = upperBound(arr, target);
        System.out.println("The upper bound index for target " + target + " is: " + result);
    }
}