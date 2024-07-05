package array_1d;

//Find second last element in given array(op:4)
public class SecondLastElement {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int count=1;
        for (int i= arr.length-1; i>=0; i--) {
            if (count==2){
                System.out.println(arr[i] + " is the second last element in given array");
                return;
            }
            count++;

        }
    }
}
