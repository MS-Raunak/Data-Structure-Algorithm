package array_1d;

import java.util.Arrays;
import java.util.Scanner;

//Count given element in an array
public class CountGivenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = {1,2,3,0,1,3,1,4,5};
        System.out.print("enter element: ");
        int ele = sc.nextInt();

        countEle(arr, ele);
    }

    private static void countEle(int[] arr, int ele) {
        int count = 0;

        for (int i=0; i< arr.length; i++) {

            if (arr[i]==ele)
                count++;
        }
        if (count>0)
            System.out.println("Total number of element " + ele + " is " + count );
        else
            System.out.println("Given element is not found in " + Arrays.toString(arr));

    }
}
