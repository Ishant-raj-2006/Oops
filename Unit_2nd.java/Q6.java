import java.io.FileInputStream;

public class Q6 {
public static void main(String[] aa) throws Exception {
    FileInputStream fin  = new FileInputStream("p1.txt");
    int  a1 = fin.read();
    int  a2 = fin.read();
    int  a3 = fin.read();
    fin.skip(12);
    byte[] b = new byte[3];
    fin.read(b);
    int  a4= fin.available();
    fin.close();
}
}