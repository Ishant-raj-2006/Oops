record Person(String name, int age) {}

public class Q11 {
    public static void main(String[] args) {
        Person p = new Person("Krishan", 22);

        System.out.println("Name: " + p.name());
        System.out.println("Age: " + p.age());
        System.out.println(p.hashCode());
        System.out.println(p);
    }
}