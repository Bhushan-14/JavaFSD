package InheritanceTask.MultilevelInheritance;

public class TeamLead extends Executive {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("Task for  you");
        sortTask();
        manager.salary(5000);

    }
}
