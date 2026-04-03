// Using muntipal cath 

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {21,5,67,9,90,45,23};
        int idx, a, ans = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index and value :- ");

        try {
            idx = sc.nextInt();
            a = sc.nextInt();

            ans = arr[idx] / a;
            System.out.println("Ans = " + ans);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }
         catch(ArithmeticException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("Ans " + ans);
    }
}