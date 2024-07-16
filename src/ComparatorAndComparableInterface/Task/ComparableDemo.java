package ComparatorAndComparableInterface.Task;

import java.util.LinkedList;

public class ComparableDemo implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        LinkedList<PatientDetails> ll = new LinkedList<>();
        ll.add(new PatientDetails(1, "Sagar", "Dr. Smith", "Cardiology", 101, 500.0));
        ll.add(new PatientDetails(2, "Shubham", "Dr. Johnson", "Pediatrics", 102, 300.0));
        ll.add(new PatientDetails(3, "Riddhesh", "Dr. Williams", "Dermatology", 103, 700.0));
        ll.add(new PatientDetails(4, "Sandip", "Dr. Garcia", "Orthopedics", 104, 450.0));
        ll.add(new PatientDetails(5, "Jatin", "Dr. Martinez", "Ophthalmology", 105, 600.0));
        ll.add(new PatientDetails(6, "Hrishi", "Dr. Robinson", "Cardiology", 106, 350.0));
        ll.add(new PatientDetails(7, "Rohan", "Dr. Clark", "Neurology", 107, 800.0));
        ll.add(new PatientDetails(8, "Mayur", "Dr. Brown", "Neurology", 108, 400.0));
        ll.add(new PatientDetails(9, "Uday", "Dr. Hall", "Psychiatry", 109, 550.0));
        ll.add(new PatientDetails(10, "Harshal", "Dr. Lopez", "Urology", 110, 650.0));

        // Printing all patient details
        for (PatientDetails patient : ll){
            System.out.println(patient);
        }
    }
}
