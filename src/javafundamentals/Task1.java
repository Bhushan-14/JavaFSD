package javafundamentals;
public class Task1{
	public static void main(String[] args){
		System.out.println("Hello Sagar");
		String name = "";
		Task1.main(name);
		main();
		Sagar sagar = new Sagar();
		sagar.main();
	}
	public static void main(String name){
		name = "Sagar";
		System.out.println("Hello "+name+" from main2");
	}
	public static void main(){
		System.out.println("Hello Sagar from main3");
	}
}
class Sagar{
	public static void main(){
		System.out.println("Hello Hrishi");
	}
}

