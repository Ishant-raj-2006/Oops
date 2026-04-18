@FunctionalInterface
interface MyInterface{
     void abrst();
      static void myMethod(){
          System.out.println("Hello Ishant");
      }
}
// public class Q1{
//     public static void main(String[] args){
//         MyInterface ref = () -> System.out.println("Hello");
//         ref.myMethod();
//     }
// }   