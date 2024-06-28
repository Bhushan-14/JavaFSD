package InheritanceTask.IsAandHasARelation;
public class Employee {
    int empID;
    String name;
    String department;

    public Employee(int empID, String name, String department) {
        this.empID = empID;
        this.name = name;
        this.department = department;
    }

    void printEmpDetails() {
        System.out.println("Employee Details: ");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
