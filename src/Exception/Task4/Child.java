package Exception.Task4;

import Exception.Task4.Parent;

public class Child extends Parent {
    void display() throws StringIndexOutOfBoundsException{
        System.out.println("child class method");
    }

    public void print() throws OwnException{
        System.out.println("Print method");
    }


    public static void  show() throws StringIndexOutOfBoundsException{

        System.out.println("Static class ");
    }

    public static void main(String[] args) throws OwnException {
        Parent p= new Child();
        p.display();
        show();
        p.print();

    }
}