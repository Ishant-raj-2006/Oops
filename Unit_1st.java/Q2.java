// WAP for find Gratest number of two number .

import java.util.Scanner;


public class Q2{
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int a,b;
    System.out.print("Enter 1st number = ");
    a = sb.nextInt();
    System.out.print("Enter 2nd number = ");
    b = sb.nextInt();
    if(a>b){
      System.out.print("1st number is Greatest");
    }
    else{
       System.out.print("2nd number is Greatest" );
    }
   } 
}