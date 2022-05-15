package javaPracticeProgram;

public class Globalvariable0 
{
     int empId=10102810;//Global variable
     static double salary=450000.25;//non Static Global variable
     
	public static void main(String[] args) 
	{
		System.out.println("Program starts here....");
		int age=30; //Local variable
		int empId=1515;// Local variable
		System.out.println("local variable age: "+age);
		System.out.println("Local variable empId: "+empId);
		System.out.println("Standared way to acess Global variable salary: "+Globalvariable0.salary);
		System.out.println("Direct way to access global variable salary "+salary);
		Globalvariable0 obj=new Globalvariable0();// to acess non static global variable create object 1st
		System.out.println("non static global variabe empId: "+obj.empId);
		System.out.println("Program ends here.....");
		
		
		
	}

}
