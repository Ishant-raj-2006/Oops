public class Q10 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Q10 t1 = new Q10();
        Q10 t2 = new Q10();

        // Start threads
        t1.start();
        t2.start();
    }
}