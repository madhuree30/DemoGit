package opps;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
public class Overridding4 
{
	public void myMethod() {
		// This will call the myMethod() of parent class
		//super.myMethod();
		System.out.println("Overridding method of Class Overridding4");
	}
	public static void main(String args[]) {
		Overridding4 obj = new Overridding4();
		obj.myMethod();
	}
}
