package day1.variables;

public class ifelsecondition {

	public static void main(String[] args) {
		int num1=45;
		int num2=30;
		if (!(num1==num2)){
			System.out.println("num1 is equal to num2");
		}
		else {
			System.out.println("num1 is not equal to num2");

		}
		if (num1>num2) {
		System.out.println("num1 is greater than num2");
	} 
		else {
  
		System.out.println("num1 is smaller than num2");
		}
		if (num1>=num2) {
			System.out.println("num1 is either equal to num2 or greater than num2");
		}
		else {
			System.out.println("num1 is either equal to num2 or smaller than num2");
		}
		if (num1==num2 ||num1>num2 ) {
		System.out.println("num1 is equal to num2 or num1 is greater than num2");
		}
		else {
			System.out.println("num1 is greater than num2");
		}
		if (num1>=num2 && num1>num2) {
			System.out.println("num1 is either greater and equal to num2 or num1 is greater than num2");
		} else {
			System.out.println("num1 is smaller than num2");
		
			
		}
		
				

	}

}
