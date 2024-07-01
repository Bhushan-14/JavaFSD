package Exception;
import java.util.Scanner;
public class Voting {
        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter your Age: ");

            int age = sc1.nextInt();

            if(age<18)
            {
                throw new Demo8("Not Eligible...!!!");
            }
            else
            {
                System.out.println("You are eligible for Vote");
            }
        }
    }
