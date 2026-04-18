@FunctionalInterface
interface MyInterface{
     void abrst();
      static void myMethod(){
          System.out.println("Hello Ishant");
      };
      default void felo(){
          System.out.println("This is default ");
      }
}

