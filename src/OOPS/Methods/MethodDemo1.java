package OOPS.Methods;

import java.util.Scanner;

public class MethodDemo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodDemo1 s1 = new MethodDemo1();
        System.out.println("Enter Roll no: ");
        int roll_no = sc.nextInt();
        System.out.println("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        s1.placement(roll_no, name);
        s1.admission(name);
    }
    void admission(String name1){
        System.out.println("Admission Department: ");
        System.out.println(name1);
    }
    void placement(int roll_no,String name1){
        System.out.println("Placement Department: ");
        System.out.println(roll_no+": "+name1);
    }
    int placement(int roll_no){
        return roll_no;
    }
}
