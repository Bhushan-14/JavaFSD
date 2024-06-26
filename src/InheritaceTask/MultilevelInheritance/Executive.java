package InheritaceTask.MultilevelInheritance;

import java.util.Scanner;

public class Executive extends Manager {
    static void sortTask(){
        assignTask();
        System.out.println("Sort the task to developer");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        Executive executive = new Executive();
        manager.salary(10000);
        executive.sortTask();
    }
}
