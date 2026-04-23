public class Q8{
    public static void main(String[] args) {
        int day = 2;
        String result = switch (day){
            case 1 -> "This is day 1 Sunday";
            case 2 -> {
                System.out.println("This is 2nd day of the Week ");
                yield "Monday";
            }
            case 3 -> {
                int length = "Tuesday".length();
                yield "Tuesday ("+ length +" Letters)";
            }
        default -> "noday";
        };
        System.out.println(result);
    }
}