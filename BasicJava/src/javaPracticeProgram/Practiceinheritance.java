package javaPracticeProgram;
class animal
{
	void eat() 
	{
		System.out.println("amimals are eating");
	}
}
	class Dog extends animal
	{
		void walk()
		{
			System.out.println("dog has four legs he can walk and run");
		}
	}
		class cat extends animal
		{
			void run () 
			{
				System.out.println("cat can run");
			}
			
	
		}

public class Practiceinheritance 
{

	public static void main(String[] args) 
	{
		System.out.println("Program start here*****");
		//create a object class of cat
		cat r=new cat();
		r.eat();
		r.run();
		//create object for dog
		Dog s=new Dog();
		s.walk();
		System.out.println("Programends here*******");

	}

}
