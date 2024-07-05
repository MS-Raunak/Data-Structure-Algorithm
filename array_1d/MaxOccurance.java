package array_1d;

/**
 * Program to find max repeated element
 * arr = [12,22,35,22,54,12,22]
 * op: 22 is max repeated element(3 times)
 */

public class MaxOccurance {
    public static void main(String[] args) {
        int[]arr = {12,22,35,22,54,12,22};
        int max = 0;
        int max_occur_ele = arr[0];

        for (int i=0; i< arr.length; i++) {
            int count=1;

            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > max) {
                max = count;
                max_occur_ele = arr[i];
            }

        }
        System.out.println(max_occur_ele + " is the max occured(repeated) element which is occured " + max + " times");
    }
}
