package InheritaceTask.HierarchicalInheritance;

public class Doctor extends Human{
    static void operate(){
        System.out.println(("Doctors operate patients"));
    }
    void assignMedicines(){
        System.out.println("Doctor assign medicine");
    }

    public static void main(String[] args) {
        Doctor d = new Doctor();
        System.out.println(d.brain);
        d.walking();
        eat();
        operate();
        d.assignMedicines();
    }
}
