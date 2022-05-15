package casting;
class Parent{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class DerivedCasting1 
{
	// Main driver method
		public static void main(String[] args) {
			System.out.println("****************Ref and Object both of child*********************");
			//Object of Child class and reference of child class
			Child c1=new Child();
			c1.readme();//Child readme method called
			c1.callme();//Parent callme method called
			c1.show();//Parent show method called
			System.out.println("****************Ref and Object both of Parent*********************");
			//Object of Parent class and reference of Parent class
			Parent p1=new Parent();
			p1.show();//Parent show method called
			p1.callme();//Parent callme method called	
			System.out.println("****************Ref parent and Object child*********************");
			// Creating a Parent class object but referencing it to a Child class
			Parent obj = new Child();//auto-up/implicit up casting
			obj.show();//Parent show method called
			obj.callme();//parent callme method called
			//obj.readme();
			System.out.println("****************Ref and Object both are of child*********************");
			Child c2=new Child();
			c2.readme();//Child read me method call
			c2.callme();//Parent call me method called
			c2.show();//Parent call me method called
			System.out.println("****************Ref parent and Object of child*********************");
			Parent p2=(Parent)c2;//explicit up casting
					//or
			//Parent p2=c2;
					//or
			//Parent p2=(Parent)new Child();
			p2.show();//Parent call me method called
			p2.callme();//Parent call me method called
			//p2.readme();
		}
}
