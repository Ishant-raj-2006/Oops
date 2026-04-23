interface InterfaceA {
    default void defaultMethod() {
        System.out.println("InterfaceA default Method");
    }
}
interface InterfaceB {
    default void defaultMethod() {
        System.out.println("InterfaceB default method");
    }
}
public class Q4 implements InterfaceA, InterfaceB {
    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
        InterfaceB.super.defaultMethod();
    }

    public static void main(String[] args) {
        Q4 myClass = new Q4();
        myClass.defaultMethod();
    }
} 