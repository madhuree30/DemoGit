package day1.variables;

public class unaryoperator {

	public static void main(String[] args) {
		int a=10;
		int b=a;
		System.out.println("a: "+a);
		System.out.println("b: "+a);
		//Pre increment: first perform the operation and then use the value
		//post : first perform the value then use the operation.
		
		a=10;
		int k=++a;
		System.out.println("k: "+a);
		System.out.println("k: "+k);
		int j = k++;
		System.out.println("k: "+k);
		System.out.println("j: "+j);
		int r=21;
		System.out.println("r: "+r++);
		System.out.println("r: "+r);
		System.out.println("r: "+ ++r);
		System.out.println("r: "+r);
		int x=105;
		System.out.println("x: "+ --x);
		System.out.println("x: "+ x);
		System.out.println("x: "+ x--);
		System.out.println("x: "+ --x);
			
		
	}

}
