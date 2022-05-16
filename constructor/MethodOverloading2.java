package constructor;

public class MethodOverloading2 
{
	/* fix the error in */

	double sum(int g, int h) {//(20 20)
		System.out.println(g + h);//(40)
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println(g + h);//(20 20.56)
		return (g + h);//(40.56)
	}

	public static void main(String args[]) {
		MethodOverloading2 ob = new MethodOverloading2();
		double result = ob.sum(20, 20);
		double result2 = ob.sum(20, 20.56);

	}
}
