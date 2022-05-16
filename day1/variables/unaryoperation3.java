package day1.variables;

public class unaryoperation3 {

	public static void main(String[] args) {
		int a=0, b;
		b= a++ + ++a + ++a +a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=-5;
		b= a-- + --a + --a + a;
		//-5 + -6 + -7 + -8
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=21;
		b=--a + --a + --a + a + ++a + a++;
		//20 + 19 + 18 + 18 +19 + 19
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a =-2;
		b= a-- + a + ++a + a++ + ++a + a++ + a;
		//b= -2 + -1 + -2 + -2 + -3 + -3 + -4		
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
