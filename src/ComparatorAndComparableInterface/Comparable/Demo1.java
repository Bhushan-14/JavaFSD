package ComparatorAndComparableInterface.Comparable;

public class Demo1 implements Comparable<Demo1> {
    private int emp_id;
    private String emp_name;
    private double emp_salary;
    private long contact;

    public Demo1(int emp_id, String emp_name, double emp_salary, long contact) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.contact = contact;
    }

    @Override
    public int compareTo(Demo1 other) {
        return Integer.compare(this.emp_id, other.emp_id);
    }
    @Override
    public String toString() {
        return "Employee ID: " + emp_id + ", Name: " + emp_name + ", Salary: " + emp_salary + ", Contact: " + contact;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public long getContact() {
        return contact;
    }
}
