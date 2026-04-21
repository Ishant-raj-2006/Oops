// PrivateKeyword
class Student{
        String name = "Raj";
        private int roll = 31;
        double cgpa = 4.67;
        private void print() {
            System.out.println(name+" "+roll+" "+cgpa+"%");
        }
        void p(){
            print();
        }

    }
public class Q4 {
  
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.cgpa =8.9;
        s1.name ="Ishant Raj";
        s1.p();
         Student s2 = new Student();
        s2.p();
    }
}
