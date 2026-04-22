// constructors

public class Q5 {
    public static class Car{
        int seats;
        String name;
        double length;

        // car() { // Default Constructors

        // }
        Car(int x , String s , double d){
            seats =x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" Seater "+name+"  (Brand) "+length+" M");
        }
        
    }
    public static void main(String[] args) {
        Car c = new Car(5,"Kia Sonet",3.99);
        c.print();
        Car c1 = new Car(5,"EcoSport",6.99);
        c1.print();

    }
}
