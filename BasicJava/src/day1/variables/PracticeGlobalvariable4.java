package day1.variables;

public class PracticeGlobalvariable4 {
	static int empId = 123;

	public static void main(String[] args) {
			int age = 30;
		System.out.println("local variable: age "+age);
		System.out.println("standard way to access SGV: "+PracticeGlobalvariable4.empId);
		System.out.println("Direct way to access SGV: empId"+empId);
		
		

	}

}
