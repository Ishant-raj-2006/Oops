public class Q6 {
    public static class Student_data{
        String name;
        int roll;
        int[] marks;

        Student_data(int x) {
            marks = new int[x];
        }

        void print(){
            System.out.println("Name: " + name);
            System.out.println("Roll: " + roll);
            System.out.print("Marks: ");
            
            for(int i = 0; i < marks.length; i++){
                System.out.print(marks[i] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Student_data S1 = new Student_data(5);
        Student_data S2 = new Student_data(2);

        S1.marks[0] = 81;
        S1.marks[1] = 68;
        S1.marks[2] = 68;
        S1.marks[3] = 76;
        S1.marks[4] = 80;

        S2.marks[0] = 75;
        S2.marks[1] = 65;

        S1.name = "Ishant";
        S2.name = "Raj";

        S1.roll = 31;
        S2.roll = 30;

        S1.print();
        S2.print();
    }
}

// 1:50