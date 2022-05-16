package javaPracticeProgram;

public class Methodoverloadingpractice1  
{
public static void Areaofcircle()
{
	int r=4;
	int Areaofcircle=r*r;
	System.out.println("Method with int argument called: "+Areaofcircle);
		}
public void Areaofcircle(double number) 
{
	double r=3.5;
	double Areaofcircle=r*r;
	System.out.println("Method with doubleargument called: "+Areaofcircle);
	}
public static void main(String[] args)
{

Methodoverloadingpractice1 m2=new Methodoverloadingpractice1(); 

	Areaofcircle(4);
m2.Areaofcircle(3.5);
}
}
