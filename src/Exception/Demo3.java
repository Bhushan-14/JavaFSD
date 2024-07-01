package Exception;

public class Demo3 {
    public static void main(String[] args) {
        String a = null;
        try {
            try {
                int b = 10;
                System.out.println(b/0);

            }catch (ArithmeticException f){
                System.out.println(f);
            };
            System.out.println(a.length());
        }catch (Exception e){
            System.out.println(e);
        };
    }
}
