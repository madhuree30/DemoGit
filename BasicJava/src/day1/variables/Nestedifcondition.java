package day1.variables;

public class Nestedifcondition {

	public static void main(String[] args) {
		// creating twi veriable for age and weight
		int age=17;
		int weight=49;
		if(age<=17) {
			System.out.println("age: "+age);
			if (weight>49) {
				System.out.println("you are eligible to donate blood");
			}
			else {
				System.out.println("you are not eligible to donate blood due to less weight");
			}
		} 
			else {
				System.out.println("age must be greater than 18");
				
				
			}
		}
		

	}


