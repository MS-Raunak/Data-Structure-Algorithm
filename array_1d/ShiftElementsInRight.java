package array_1d;

import java.util.Arrays;

/**
 * Shift half elements in right side
 * EX: 10,11,6,19,7,1
 *     ------^shifting in right
 *     op: 19,7,1,10,11,6
 */
public class ShiftElementsInRight {
    public static void main(String[]arrrgs) {
        int[]arr = {10,11,6,19,7,1};
        System.out.println(Arrays.toString(shiftElementRight(arr)));
    }

    public static int[] shiftElementRight(int[]arr) {
        int i=0;
        int j= (arr.length/2);

        while (i< arr.length/2 && j< arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        return arr;
    }
}
/**
 * Explanation:
 * Take two pointer i and j
 * i should starts with 0th index and iterate till arr.lenght/2th index
 * j should starts with arr.lenght/2th index and iterate till arr.lenght-1th index
 * swap the elements whcih is present on ith and jth index
 * after each iteration increase the value of i and j by 1
 *
 * NOTE: Make sure this program will work for only even length of array
 * If you want to do with odd length then modify this program accordingly
 *
 */