package casting;
class Parent100{
	void myHome() {
		System.out.println("Parent home");
	}
}
class Child100 extends Parent100{
	void myCar() {
		System.out.println("Child car");
	}
}
public class Casting 
{
	public static void main(String[] args) {
		Child100 c2=new Child100();
		c2.myCar();//Child car
		c2.myHome();//Parent home
		Parent100 c1=new Parent100();		
		c1.myHome();//Parent home
		System.out.println("***************Using Upcasting****************");
		//usig casting concept
		Child100 c3=new Child100();
		c3.myCar();//Child car
		c3.myHome();//Parent home
		Parent100 c4=c3;//auto upcasting
		c4.myHome();//Parent home
	}
}
