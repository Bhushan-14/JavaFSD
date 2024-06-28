package Abstraction;

public interface firstInterface {
    int a = 20;
    static int b = 20;
    void display();
    private void show(){
        System.out.println("Show method of an interface");
    }
    static void add(){
        System.out.println("static method of interface");
    }
    public static void main(String[] args) {
        firstInterface obj = new firstInterface() {
            @Override
            public void display() {
                System.out.println("In display method");
            }
        };
        obj.display();
        obj.show();
        add();
    }
}
