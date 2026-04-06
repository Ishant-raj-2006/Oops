import java.io.File;
import java.io.IOException;

public class Q8 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist. Creating new file..");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created Successfully.");
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
    }
}