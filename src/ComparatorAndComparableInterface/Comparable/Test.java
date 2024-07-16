package ComparatorAndComparableInterface.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Demo1> employees = new ArrayList<>();
        employees.add(new Demo1(1001, "Sagar", 50000.0, 1234567890));
        employees.add(new Demo1(1005, "Sandip", 60000.0, 987654321));
        employees.add(new Demo1(2002, "Hrishi", 75000.0, 246813579));
        employees.add(new Demo1(605, "Riddhesh", 45000.0, 135792468));
        employees.add(new Demo1(50, "Nillesn", 55000.0, 975310864));

        Collections.sort(employees, new Comparator<Demo1>() {
            @Override
            public int compare(Demo1 emp1, Demo1 emp2) {
                return Double.compare(emp1.getEmp_salary(), emp2.getEmp_salary());
            }
        });
        System.out.println("Sorted by Employee Salary:");
        printEmployees(employees);
        System.out.println("--------------------------------------");

        Collections.sort(employees, new Comparator<Demo1>() {
            @Override
            public int compare(Demo1 emp1, Demo1 emp2) {
                return Integer.compare(emp1.getEmp_id(), emp2.getEmp_id());
            }
        });
        System.out.println("Sorted by Employee ID:");
        printEmployees(employees);
        System.out.println("--------------------------------------");

        Collections.sort(employees, new Comparator<Demo1>() {
            @Override
            public int compare(Demo1 emp1, Demo1 emp2) {
                return emp1.getEmp_name().compareTo(emp2.getEmp_name());
            }
        });
        System.out.println("Sorted by Employee Name:");
        printEmployees(employees);
        System.out.println("--------------------------------------");

        Collections.sort(employees, new Comparator<Demo1>() {
            @Override
            public int compare(Demo1 emp1, Demo1 emp2) {
                return Long.compare(emp1.getContact(), emp2.getContact());
            }
        });
        System.out.println("Sorted by Contact Number:");
        printEmployees(employees);
        System.out.println("--------------------------------------");
    }

    private static void printEmployees(ArrayList<Demo1> employees) {
        for (Demo1 employee : employees) {
            System.out.println(employee);
        }
    }
}
