package OOPS.Methods;

public class MethodOverloading {
	public static void main() {
		System.out.println(add(10,12));
	}
	private static int add(int a, int b) {
		return a + b;
	}
	private static int add(int a,int b,int c) {
		return a + b + c;
	}
	private static double add(int a,int b,int c,int d) {
		return a + b;
	}
}
