package opps;

abstract class Abstract {
	// global variable
	// constructor
	// normal or non-abstract or concrete method
	// abstract method
}

abstract class Abstract1 { 
	// abstract method ------>
	abstract void call1();
	abstract void call2();
	// non-abstract method
	void display() {
		System.out.println("Hello");
	}
}
abstract class Abstract2 {
	// abstract method  ---->100%
	abstract void call1();
	abstract void call2();
}
abstract class Abstract3 {
	// non-abstract method ----->0%
	void display() {
	}
}
public class Abstractclass5 extends Abstract2 {//
	void call1() {
		System.out.println("Hello");
	}
	void call2() {
		System.out.println("he");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass d1=new Abstractclass ();

	}
}