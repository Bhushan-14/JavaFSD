package Exception;

public class Demo5 {
    public static void marksValidation(double marks) {
        if(marks < 40){
            throw new ArithmeticException("You are Failed...Please try Again...!!!");
        } else {
            System.out.println("You Have Passed the Exam...!!!");
        }
    }
    public static void main(String[] args) {
        marksValidation(39.5);
    }
}