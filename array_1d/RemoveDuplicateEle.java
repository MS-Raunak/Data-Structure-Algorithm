package array_1d;

import java.util.Arrays;

public class RemoveDuplicateEle {

    //In this case, deleting duplicates from unsorted array and also size will be decreased
    private static int[] removeDuplicates(int[] arr) {
      int count = countDuplicates(arr);

      int[] newArr = new int[arr.length-count];
      int idx=0;
      for (int ele : arr) {
          if (ele!=0)
              newArr[idx++] = ele;
      }

      return newArr;
    }

    //Return total duplicate elements
    private static int countDuplicates(int[] arr) {
        int count = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==0) continue;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[j]=0;
                    count++;
                }
            }
        }
        return count;
    }

    //Deleting duplicates from sorted array but size will be same only element will get deleted
    private  static void removeduplicateEle(int[]arr) {
        Arrays.sort(arr); //now array is sorted

        int[]temp = new int[arr.length];
        int idx=0;

        //copy arr array's unique elements into the temp array
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]!=arr[i+1])
                temp[idx++] = arr[i];
            temp[idx] = arr[arr.length-1];
        }

        System.out.println("Modified Array(after removing duplicates): " + Arrays.toString(temp));

    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,2,4,5,2};
        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.println("=====================================");

        removeduplicateEle(arr);

        System.out.println("Modified Array(after removing duplicates): " + Arrays.toString(removeDuplicates(arr)));


    }
}
