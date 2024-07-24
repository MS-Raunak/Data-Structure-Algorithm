package number_program;

import java.util.Scanner;

public class P6_PerfactInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range a: ");
        int range_a = sc.nextInt();
        System.out.print("enter range b: ");
        int range_b = sc.nextInt();

        palindromeInRange(range_a, range_b);
    }
}
