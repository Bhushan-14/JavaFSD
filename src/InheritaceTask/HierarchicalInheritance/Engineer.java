package InheritaceTask.HierarchicalInheritance;

public class Engineer extends Human{
    static void study(){
        System.out.println("Engineers Study");
    }
    void innovate(){
        System.out.println("Engineers Innovate");
    }

    public static void main(String[] args) {
        Engineer e = new Engineer();
        System.out.println(e.brain);
        eat();
        study();
        e.walking();
        e.innovate();
    }
}
