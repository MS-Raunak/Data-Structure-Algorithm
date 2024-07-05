package array_1d;

/**
 * Min Repeated element in given array
 *  54 is the min occurrence element in {12,22,22,54,12,22}
 */

public class MinOccuranceElement {
    public static void main(String[] args) {
        int[]arr = {12,22,22,54,12,22};

        int minCount = arr.length;
        int minRepeatedEle = arr[0];

        for (int i=0; i< arr.length; i++) {
            int count = 1;

            for (int j=i+1; j< arr.length; j++ ){
                if (arr[i]==arr[j])
                    count++;
            }

            if (count < minCount) {
                 minRepeatedEle = arr[i];
                minCount = count;
            }
        }

        System.out.println(minRepeatedEle + " is the min repeated element, which is repeated " + minCount + " times");
    }
}
