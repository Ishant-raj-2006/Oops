// WAP for find even or odd 


import java.util.Scanner;


public class Q11 {
    public static void main(String[] args) {
        int num ;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        if(num%2 == 0){
            System.out.print("Even number ");
        }
        else{
            System.out.println("odd number ");
        }
    }
}
