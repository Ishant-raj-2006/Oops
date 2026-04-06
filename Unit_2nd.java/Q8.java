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
        System.out.println("File name:"+ file.getName());
        System.out.println("path:"+ file.getPath());
        System.out.println("Absolute path: "+file.getAbsolutePath());
        System.out.println("File is a directory? "+ file.isFile());
        System.out.println("Fileis a file?"+ file.length() +"bytes");
        if(file.delete()){
            System.out.println("File deleted Successfully.");
        }
        else{
            System.out.println("Failed to delete file.");
        }
    }
}