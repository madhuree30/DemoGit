package day1.variables;

public class PracticeGlobalvariable3 {
	static int empId = 123;

	public static void main(String[] args) {
		int empId = 100;
		int age = 30;
		System.out.println("local variable: age "+age);
		System.out.println("standard way to access SGV: "+PracticeGlobalvariable3.empId);
		System.out.println("Local variable: empId "+empId);
		

	}

}
