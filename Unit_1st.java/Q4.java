// WAP for print 'n times ' natural numbers when 'n' is taken from user .


import java.util.Scanner;
public class Q4 {
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int n;
    System.out.print("Enter the value of n =");
    n = sb.nextInt();
    for(int i=1; i<=n; i++){
        System.out.print(i+" ");
    }
   } 
}
