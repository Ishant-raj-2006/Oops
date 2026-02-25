// WAP for print day of week by  using Switch case ststement .
import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num ;
        System.out.print("Enter the number of day of week = ");
        num = sb.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("WednesDay");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" Please enter valid number");
                throw new AssertionError();
        }
    }
}
