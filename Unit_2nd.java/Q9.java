
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.nio.Buffer;

// public class Q9 {
//     public static void main(String[] args) {
//         FileReader fr = new FileReader("file.txt");
//         BufferedReader bfr= new BufferedReader(fr);
//         string line = bfr.readLine();
//         while(line!=null){
//             System.out.println(line);
//             line= bfr.readLine();
//         }
//     }
//     fr.close();
// }

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q9 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("file.txt");
             BufferedReader bfr = new BufferedReader(fr)) {
            String line = bfr.readLine();
            while (line != null) {
                System.out.println(line);
                line = bfr.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}