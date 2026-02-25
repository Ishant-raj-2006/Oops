// WAP for number gassing game but in this Code Number three define The print define number is 0 Make it do while loop.

import java.util.Scanner;



public class Q5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
       
        do { 
         System.out.print("Enter Number = ");
        num = sb.nextInt();
        } while (num!=0);
        System.out.println("End");
    }
}
