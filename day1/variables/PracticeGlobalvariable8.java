package day1.variables;

public class PracticeGlobalvariable8 {
	//global variable
	double empId = 123;//non static global variable

	public static void main(String[] args) {
		System.out.println("Program starts");
		
		//need to create object
		PracticeGlobalvariable7 g1;// object not created
		g1=new PracticeGlobalvariable7();// object created
	    System.out.println("to access NSGV empId"+g1.empId);
	    g1.empId = 456;// updating non static global variable value
	    System.out.println("to access updated NSGV empId"+g1.empId);
	    
	    //creating again new object
	    PracticeGlobalvariable8 g2;
	    g2=new PracticeGlobalvariable8();
	    System.out.println("to access NSGV empId"+g2.empId);
	    System.out.println("Program starts");
		
		

	}

}
