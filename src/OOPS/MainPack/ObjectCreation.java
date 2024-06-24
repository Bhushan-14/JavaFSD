package OOPS.MainPack;

import java.util.Random;

public class ObjectCreation {
    public static void main(String[] args) {
        ObjectCreation obj = new ObjectCreation();
        obj.greet();
    }
    public void greet(){
        System.out.println("Hello World");
    }

    Random r = new Random();
}
