package array_1d;

import java.util.Arrays;
import java.util.Scanner;

//Program to find given element in given array
public class FindGivenEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        System.out.println("enter element that you want to find in " + Arrays.toString(arr));
        int key = sc.nextInt();

        findElement(arr, key);
    }

    private static void findElement(int[] arr, int key) {
        for (int i=0; i< arr.length; i++) {
            if (key==arr[i]){
                System.out.println(key + " is found on index number " + i);
                return;
            }
        }
        System.out.println(key + " is not found in given array");

    }
}
