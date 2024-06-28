package InheritanceTask.IsAandHasARelation;

public class ABCSoftware extends Infosys {
    public ABCSoftware() {
        super();
    }

    public void assignProjectToABC(String projectName, Employee employee) {
        super.assignProject(projectName, employee);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(94, "Sagar", "DevOps");
        Infosys infosys = new Infosys();
        infosys.assignProject("Project X", employee1);
        infosys.printProjectDetails();

        Employee employee2 = new Employee(95, "Sandip", "Software Engineering");
        ABCSoftware abcSoftware = new ABCSoftware();
        abcSoftware.assignProjectToABC("Project Y", employee2);
        abcSoftware.printProjectDetails();
    }
}
