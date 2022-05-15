package day1.variables;

public class PracticeGlobalvariable6 {
	static int empId = 123;

	public static void main(String[] args) {
			int age = 30, empId = 100;
		System.out.println("local variable: age "+age);
		 age = 45;
		System.out.println("Updated local variable: age"+age);
		System.out.println("local variable: empId"+empId);
		System.out.println("standard way to access SGV: "+PracticeGlobalvariable5.empId);
		System.out.println("Direct way to access SGV: empId"+empId);
		empId = 456;
		System.out.println("updated standard way to access SGV: "+PracticeGlobalvariable5.empId);
		System.out.println("updated Direct way to access SGV: empId"+empId);
		
		

	}

}
