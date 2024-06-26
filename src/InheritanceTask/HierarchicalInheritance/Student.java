package InheritanceTask.HierarchicalInheritance;

public class Student extends Human{
    static void studing(){
        System.out.println("Student study");
    }
    void enjoy(){
        System.out.println("Student enjoy");
    }
    void playing(){
        System.out.println("Student play");
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.brain);
        s.walking();
        eat();
        studing();
        s.enjoy();
        s.playing();
    }

}
