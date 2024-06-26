package InheritanceTask.MultilevelInheritance;

import java.util.Scanner;

public class Manager {
    public void instruction(){
        System.out.println("Manager's instruction");
    }
    public void salary(int salary){
        System.out.println("Salary is: "+salary);
    }
    public static void assignTask(){
        System.out.println("Assign task to Executive");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        manager.instruction();
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();
        manager.salary(salary);
    }
}
