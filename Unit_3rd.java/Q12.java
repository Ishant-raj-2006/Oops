abstract class Calculator<T> {
    abstract T add(T a, T b);
}

public class Q12 {
    public static void main(String[] args) {

        Calculator<Integer> obj1 = new Calculator<Integer>() {
            @Override
            Integer add(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println(obj1.add(12, 23));
    }
}