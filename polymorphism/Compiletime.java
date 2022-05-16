package polymorphism;

public class Compiletime 
{
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}
	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}
	public static void main(String[] args) {

		Compiletime.sum(45, 80, 22);//147
	}
}
/**
 * When a method gets to know its implementation at the time of compilation is known as compile
 * time poly this can be achieved by using static method overloading
 */

