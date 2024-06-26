package OutsiderPack;
import InheritanceTask.HierarchicalInheritance.Human;


public class Teacher extends Human {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.walking();
        System.out.println(teacher.brain);
        Human.eat();
    }
}
