package javaPracticeProgram;

public class Methodoverloadingpractice 
{
	public void square() 
	{
		System.out.println("zero parameterised method");
	}
	public void square(int number) 
	{
		int square=number*number;
		System.out.println("Method with int argument called: "+square);
	}
	public void square(float number) 
	{
	float square=number*number;
	System.out.println("Method with float argument called: "+square);
	}
	public static void main (String[] arg)
	{
		Methodoverloadingpractice m1=new Methodoverloadingpractice();
		m1.square();
		m1.square(3);
		m1.square(2.5f);
		
	}
}
