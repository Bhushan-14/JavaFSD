package Exception;

public class AssertionError {
    public static void main(String args[])
    {
        int value = 15;
        assert value >= 20 : " Underweight";
        System.out.println("value is " + value);

        int age = 14;
        assert age <= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}