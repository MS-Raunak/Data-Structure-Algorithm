package array_1d;

public class IndexEle {
    //Print odd index elements
    public static void printOddInexElement(int[]arr){
        for (int i=0; i< arr.length; i++) {
            if (i%2==0)
                System.out.print(arr[i] + ", ");
        }
    }

    //Print even index elements
    public static void printEvenInexElement(int[]arr){
        for (int i=0; i< arr.length; i++) {
            if (i%2!=0)
                System.out.print(arr[i] + ", ");
        }
    }

    //main method
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printOddInexElement(arr);
        System.out.println("\n=================");
        printEvenInexElement(arr);
    }
}
