package day1.variables;

public class PracticeGlobalvariable10 {
	//Global variable-----> static non ststic variable
	static int Rollno = 456;
	static boolean result;
	
	double salary = 4500.25;
	char grade;

	public static void main(String[] args) {
		System.out.println("Pogram starts");
		
		//access the static and non static global variable
		System.out.println("direct acess of SGV Rollno: "+Rollno);
		System.out.println("direct access of SGV resut: "+result);
		System.out.println("Standared way to access SGV Rollno: "+PracticeGlobalvariable10.Rollno);
		System.out.println("Standared way to access SGV result: "+PracticeGlobalvariable10.result);
		
		PracticeGlobalvariable10 g1 = new PracticeGlobalvariable10();
		
		System.out.println("to access non static global variable salary: "+g1.salary);
		System.out.println("nsgv grade: "+g1.grade);
		
			//updated value of static and non static global variable
		 Rollno = 500;
		result = true;
		
		g1.salary = 46522.25;
		g1.grade = 'A';
		
		
		//Access the updated value of static and non static global variable
		System.out.println("direct access of updated SGV g1.Rollno: "+g1.Rollno);
		System.out.println("direct access of updated SGV g1.result: "+g1.result);
		PracticeGlobalvariable10 g2 = new PracticeGlobalvariable10();
		System.out.println("access NSGV g1.salary: "+g1.salary);
		System.out.println(" access of updated NSGV g1.grade: "+g1.grade);
		System.out.println("Program Ends");
	

	}

}
