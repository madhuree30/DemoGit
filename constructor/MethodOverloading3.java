package constructor;

public class MethodOverloading3 
{
	public void Square(int number) {//12
		int square = number * number;//(12*12)
		System.out.println("Method with Integer Argument Called:" + square);
	}

	public void Square(double number) {//12.34
		double square = number * number;//(12.34*12.34)
		System.out.println("Method with double Argument Called:" + square);
	}

	public void Square(long number) {//123l
		long square = number * number;//(123*123)
		System.out.println("Method with long Argument Called:" + square);
	}

	public static void main(String[] args) {
		
		MethodOverloading3 m1=new MethodOverloading3();
		m1.Square(12.34);
		m1.Square(12);
		m1.Square(123l);
	}
}
