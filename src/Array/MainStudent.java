package Array;

public class MainStudent {
    public static void main(String[] args) {
        Student std[] = new Student[]{
            new Student(12,"Bhushan",100,"Computer"),
            new Student(30,"Hrushikesh",90,"Computer"),
            new Student(34,"Mayur",90,"Computer"),
            new Student(90,"Sagar",90,"Computer")
        };
        for(int i = 0; i < std.length; i++){
            System.out.println(std[i].roll+" "+std[i].name+" "+std[i].marks);
        }
    }
}
