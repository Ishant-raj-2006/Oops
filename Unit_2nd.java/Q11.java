

// WAP for make selfe data type 
public class Q11{
  
        public static class Student{
            String name;
            int rno;
            double cgpa;
        }
    
public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Ishant Raj";
    s1.rno = 31;
    s1.cgpa = 4.67;

    Student s2 = new Student();
    s2.name = "Ishant Raj";
    s2.rno = 31;
    s2.cgpa = 4.67;

    Student s3 = new Student();
    s3.name = "Ishant Raj";
    s3.rno = 31;
    s3.cgpa = 4.67;

    System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
}
}
