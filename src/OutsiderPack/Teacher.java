package OutsiderPack;
import InheritaceTask.HierarchicalInheritance.Human;


public class Teacher {
    public static void main(String[] args) {
        Human human = new Human();
        human.walking();
        System.out.println(human.brain);
        Human.eat();
    }
}
