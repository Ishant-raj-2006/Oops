

public class Q1 {
    public static class Student{ // khud ka data type 
        String name;
        int Roll;
        double sgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student(); // Decleration
        s1.name = "Ishant";
        s1.Roll = 100031;
        s1.sgpa = 4.67;
        
        Student s2 = new Student();
        s2.name = "Raj";
        s2.Roll = 100032;
        s2.sgpa = 5.67;
        Student s3 = new Student();
        s3.name = "Raju";
        s3.Roll = 100033;
        s3.sgpa = 6.67;

    System.out.println(s1.name +" "+s1.Roll+" "+s1.sgpa);
    }
}
