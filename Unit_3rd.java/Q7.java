
public class Q7 {
    public static void main(String[] args) {
         int day =3;
         String dayName = switch (day){
            case 1 -> "This is Day 1";
            case 2 -> "This is Day 2";
            case 3 -> "This is Day 3";
            case 4 -> "This is Day 4";
            case 5 -> "This is Day 5";
            case 6 -> "This is Day 6";
            default -> "Invalid Day";
         };
         System.out.println(dayName);
    }
    
}
