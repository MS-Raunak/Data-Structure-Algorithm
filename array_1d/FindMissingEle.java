package array_1d;

import java.util.Arrays;

/**
 * find missing element
 * Example:
 * Given Array: [1, 2, 3, 5, 7]
 * OUTPUT:
 * 4 is the missing element
 * 6 is the missing element
 */
public class FindMissingEle {

    public static void missingEle(int[]arr) {
        for (int i=0; i< arr.length-1; i++){
            if (arr[i+1] != arr[i]+1){
                System.out.println(arr[i]+1 +" is the missing element");
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,5,7};
        System.out.println("Given Array: " + Arrays.toString(arr));

        missingEle(arr);
    }
}
