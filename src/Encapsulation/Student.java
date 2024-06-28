package Encapsulation;

import java.util.Scanner;

public class Student {
    private String name;
    private int roll_no;
    private double marks;

    public Student(String name, int roll_no, double marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }
    public static void main(String[] args) {
        Student student1 = new Student("Sagar", 123, 95.5);
        Student student2 = new Student("Sandip", 124, 96.5);
        System.out.println(student1.toString());
        System.out.println("Name: " + student2.getName());
        System.out.println("Roll No: " + student2.getRoll_no());
        System.out.println("Marks: " + student2.getMarks());
    }
}
