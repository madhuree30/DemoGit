package day1.variables;

public class PracticeGlobalvariable9 {
	//global variable
	double empId = 123;
	static double salary;//non static global variable

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("direcly access SGV: salary"+salary);
		System.out.println("STANDARED WAY to access SGV: salary"+PracticeGlobalvariable9.salary);
	
		PracticeGlobalvariable9 g1;
		g1 = new PracticeGlobalvariable9();
		System.out.println("to access NSGV: empId"+g1.empId);
		
		
		
	    System.out.println("Program starts");
		
		

	}

}
