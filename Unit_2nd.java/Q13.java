// WAP for make selfe data type and take it's input from user and print it by using Method. 

public class Q13 {

    public static class  Car{
        int seats;
        String name;
        double length ;
        String type;
        int torqe;
        void print(){
            System.out.println(seats+" Siter"+name+" "+type+" "+torqe+"NM");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.77;
        c.name = "TATA punch";
        c.seats = 5;
        c.torqe = 1000;
        c.type = "SUV";
        c.print();
    }
}
