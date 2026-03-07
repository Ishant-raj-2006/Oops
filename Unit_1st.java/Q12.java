// WAP for find prime number or note 


import java.util.Scanner;


public class Q12 {
    public static void main(String[] args) {
        int num ,count = 0;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for(int i= 1; i<=num; i++){
            if(num%i==0){
                count ++;
            }
        }
        if(count ==2){
            System.out.println("This is prime numebr ");
        }
        else{
            System.out.println("This is  note prime numebr ");
        }

        
    }
}
