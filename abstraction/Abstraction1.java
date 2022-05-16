package abstraction;
abstract class A
//abstract class
{
	static void sample() 
	//concreate method
	{
		System.out.println("Running sample method....");
	}
	static void display() 
	{
		System.out.println("view display method");
	}
	abstract void sample2();
	//abstract method without body compilation error given
}
public class Abstraction1 
{

	public static void main(String[] args) 
	{
	System.out.println("Program starts here");
	A.sample();
	A.display();
	//A.sample2();
	System.out.println("Program ends here");

	}

}
