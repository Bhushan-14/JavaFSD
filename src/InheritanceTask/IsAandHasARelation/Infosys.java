package InheritanceTask.IsAandHasARelation;

public class Infosys {
    String projectName;
    Employee employee;

    public Infosys() {
    }

    public void assignProject(String projectName, Employee employee) {
        this.projectName = projectName;
        this.employee = employee;
    }

    void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        employee.printEmpDetails();
    }
}
