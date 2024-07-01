package Exception;

public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException h) {
            System.out.println("Arithmetic Exception"+h);
            try {
                String name = null;
                System.out.println(name.length() );
            }catch (NullPointerException g){
                System.out.println("Caught NullPointerException: " + g);
            }
        }
    }
}
