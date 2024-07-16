package ComparatorAndComparableInterface.Comparator;

import java.util.Comparator;
import java.util.LinkedHashMap;

public class StudDetails {
    private int roll_no;
    private String name;
    private double marks;
    private long contact;

    public StudDetails(int roll_no, String name, double marks, long contact) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
        this.contact = contact;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public long getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "StudDetails{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", contact=" + contact +
                '}';
    }
}
