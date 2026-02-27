// WAP for find the length of any string


import java.util.Scanner;
import java.util.stream.Stream;


public class Q10 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        String ch ;
        System.out.print("Enter something for find length = ");
        ch=sb.nextLine();
        int n = ch.length();
        System.out.print("This is your String length = "+n);
    }
}
