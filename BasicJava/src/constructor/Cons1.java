package constructor;

public class Cons1 
{
	Cons1() {
		System.out.println("This is a zero-para constructor");
	}
	Cons1(char c) {
		System.out.println("This is a single-para constructor");
	}
	Cons1(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}	
	Cons1(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	Cons1(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	Cons1(double num1, boolean num2,char c) {
		System.out.println("This is a double-boolean-char parameterized constructor");
	}
	public static void main(String[] args) {
		Cons1 c1 = new Cons1();// zero
		Cons1 c2 = new Cons1(10, 20);//int int
		Cons1 c3 = new Cons1('d');//single para
		Cons1 c4 = new Cons1(10d, 20);//double int
		Cons1 c5 = new Cons1(10, 20.45);//int double
		Cons1 c6 = new Cons1(10,false,'x');//double boolean char
	}
}

/**
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */

