package Exception.Task4;

public class Parent {
    void display(){
        System.out.println("parent class method");
    }
    static void anotherMethod() {
        System.out.println("parent class anotherMethod()");
    }

    protected void print() throws OwnException {
        System.out.println("Parent Print method");
    }
}