package memoryoperator;

public class Relationoprator 
{
	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1 = 19, num2 = 14;
		System.out.println("num1: " + num1 + "--->num2: " + num2);//19  14
		// is equal to
//		boolean res = (num1 == num2);
//		System.out.println("num1 == num2 : " + res);// 
				//or
		System.out.println("num1 == num2 : " + (num1 == num2));// F
		// is not equal to
		System.out.println("num1 != num2 : " + (num1 != num2));// T
		// Greater than
		System.out.println("num1 >  num2 : " + (num1 > num2));// T
		// Less than
		System.out.println("num1 <  num2 : " + (num1 < num2));// F
		// Greater than or equal to
		System.out.println("num1 >= num2 : " + (num1 >= num2));// T
		// Less than or equal to
		System.out.println("num1 <= num2 : " + (num1 <= num2));// F

	}
}
