@FunctionalInterface
interface MyFunctionalInterface{
    void  myMethod();
}
public class FunctionalInterfaceExample{
    public static void main(String[] args){
        MyFunctionalInterface instance = () -> System.out.println("Hello, Ishant");
        instance.myMethod();
    }
}
