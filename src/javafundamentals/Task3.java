package javafundamentals;
public class Task3 {
    public int a = 100; 
    public static int b = 20; 
    public void display() {
        int x = 10; 
        //static int y = 19; 
        System.out.println("Local variable x: " + x);
    }

    public static void main(String[] args) {
        int y = 100; 
        System.out.println("Local variable y: " + y);
    }
}
