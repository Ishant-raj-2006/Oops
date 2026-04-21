
// polymorphism

public class Q3 {
    public static class Lion{
        void Speak(){
            System.out.println("Grrrrrrrrr");
        }
    }
    public static class Cat{
        void Speak(){
            System.out.println("meow Meow");
        }
    }
    public static class Dog{
        void Speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Human{
        void Speak(){
            System.out.println("Hello");
        }
    }
    public static class Cow{
        void Speak(){
            System.out.println("Maaaaaaaaaa");
        }
    }
    public static void main(String[] args) {
        Lion L = new Lion();
        Cat c = new Cat();
        Human h = new Human();
        Cow Co = new  Cow();
        Dog D = new Dog();
        D.Speak();
        L.Speak();
        c.Speak();
        h.Speak();
        Co.Speak();
    

    }
}
