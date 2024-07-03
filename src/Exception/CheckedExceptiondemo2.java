package Exception;

import java.io.*;

public class CheckedExceptiondemo2 {
    public static void writeFile(String content) throws IOException {
        FileWriter fw = new FileWriter("C:/Users/hplap/OneDrive/Desktop/abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.newLine();
        bw.close();  }

    public static void readFile() throws IOException {
        String line;
        FileReader fr = new FileReader("C:/Users/hplap/OneDrive/Desktop/abc.txt");
        BufferedReader fileInput = new BufferedReader(fr);
        while ((line = fileInput.readLine()) != null) {
            System.out.println(line);
        }
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            writeFile("Hello I am Tony Stark.");
            System.out.println("File written successfully.");

            System.out.println("Reading file content:");
            readFile();
            System.out.println("File read successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Normal workflow.");
    }
}
