package javaPracticeProgram;

public class Memory 
{
	static int salary;
	int empId;
	void display() 
	{ 
		System.out.println("I am display method");
	}
	static void print() 
	{
		System.out.println("I am print");
	}

	public static void main(String[] args) {
		// To access static member----> static variable and method
		System.out.println("Static variable Salary: "+Memory.salary);
		Memory.print();
		//Access non static member----> Non static variable and method
	    Memory m1=new Memory();
	    System.out.println("non static variable empId: "+m1.empId);
		m1.print();
		//updated static member
		Memory.salary=25000;
		System.out.println("Updated salary: "+Memory.salary);
		//updated non static member
		m1.empId=105;
		
		System.out.println("updated empId: "+m1.empId);
		Memory m2=new Memory();
		System.out.println("2nd updated empId: "+m2.empId);
		m2.display();
	}

}
