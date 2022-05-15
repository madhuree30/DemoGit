package constructor;

public class Practiceprogram1 
{
private static final String Mynme = null;

	//non-parameterised constructor
	void display()//create void method with non static global variable---> non parameterised constructor used
{
		int a=10 , b=20, c=35;
		int d=a+b+c;
		double salary=50000.23;
		boolean result=false;
		String name="Myname";
		char grade= 'A';
		System.out.println("int value result: "+d);
		System.out.println("double salary: "+salary);
		System.out.println(result);
		System.out.println(name);
		System.out.println(grade);
		
}
	public static String display1(String name1,String name2)//with static method---> parameterised constructor used
	{
	String name3=name1+name2;
	return name3;
	}
   public static void main(String[] args) {
	Practiceprogram1 obj=new Practiceprogram1();
	obj.display();
	System.out.println(Practiceprogram1.display1("name","class"));
	
}
	}