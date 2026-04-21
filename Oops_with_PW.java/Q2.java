public class Q2 {
    public static class Car{
            int seats;
            String name;
            double length;
            String type;
            void print() {
                System.out.println(seats+" "+name+" "+length+" "+type+" ");
            }
        }
    public static void main(String[] args) {
        Car c = new Car();
        c.seats = 5;
        c.name ="Tata punch";
        c.length = 5.5;
        c.type = "SUV"; 
        c.print();
        change(c);
        System.out.println(c.seats);
    }
    private static void change(Car c){
        c.seats =7;
    }
}
