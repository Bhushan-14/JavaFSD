package Exception;

public class Demo6 {
    public static void ageValidation(int age) {
        String s = null;
        if (age < 40) {
            System.out.println(s.length());
            throw new NullPointerException("Your age is low for the Creterion...Please try Again...!!!");
        } else {
            System.out.println("You Have valid age to Go...!!!");
        }
    }
    public static void main(String[] args) {
        ageValidation(25);
    }
}

