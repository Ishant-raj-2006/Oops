// PrivateKeyword
class Student{
        String name = "Raj";
        private int roll = 31;
        double cgpa = 4.67;
       void print() {
            System.out.println(name+" "+roll+" "+cgpa+"%");
        }
        // void p(){
        //     print();
        // }
        int getroll(){
            // System.out.println(roll);
            return roll;
        }
        void setroll(int x){ // Setter
            roll =x;
        }

    }
public class Q4 {
  
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.cgpa =8.9;
        s1.name ="Ishant Raj";
        s1.print();
         Student s2 = new Student();
        s2.print();
        System.out.println(s1.getroll());
        
        s1.setroll(337);
        System.out.println(s1.getroll());
    }
}

