package InheritanceTask.HasRelation;

public class Employee {
    int empID;
    String name;
    String department;
    Address address;
    public Employee(int empID, String name, String department, Address address) {

        
        this.empID = empID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    void printEmpDetails() {
        System.out.println("Employee Details: ");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Address address1 = new Address("MG road", "Dhule", "Maharashtra", 424005);
        Employee emp = new Employee(94, "Sagar", "Computer", address1);
        emp.printEmpDetails();
    }
}
