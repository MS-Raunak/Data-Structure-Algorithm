package array_1d;

/**
 * Program to find Largest Element in given array
 * arr = [12,4,23,65,21, 48]
 * op: 65
 */

public class LargestElement {
    public static void main(String[] args) {
        int[]arr = {12,4,23,65,21, 48};
        int max = 0;

        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max + " is the largest element in given array");
    }
}
