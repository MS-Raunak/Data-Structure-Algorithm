package array_1d;

import java.util.Arrays;

//Print all elements in reverse order
public class ReverseArray {
    //Print all elements in reverse order
    private static void printArrInReverseOrder(int[] arr) {
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + ", ");
        }
    }

    //Reverse an array
    private static void reverseArray(int[] arr) {
        int newArr[] = new int[arr.length];
        int index=0;
        for (int i= arr.length-1; i>=0; i--){
            newArr[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }


    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        reverseArray(arr);
        //printArrInReverseOrder(arr);
    }
}
