package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo1 {
    public static void readFile() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:/Users/hplap/OneDrive/Desktop/abc.txt");
        BufferedReader fileInput = new BufferedReader(fr);
        String line;
        while ((line = fileInput.readLine()) != null) {
            System.out.println(line);
        }
        fileInput.close();
    }
    public static void main(String[] args) {
        try {
            readFile();
            System.out.println("File found and read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e);
        }
        System.out.println("Normal workflow.");
    }
}
