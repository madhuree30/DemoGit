package day1.variables;

public class unaryoperation2 {

	public static void main(String[] args) {
		int a=47, b;
		b=a++;
		System.out.println("a"+a);
		System.out.println("b:"+b);
		int x=a, y;
		System.out.println("x: "+x);
		y=++x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		int p=-15, q=25, res;
		res = p++ + --q;
		System.out.println("res: "+res);
		System.out.println("p: "+ p);
		System.out.println("q: "+ q);
		int res1= ++p + ++q;
		System.out.println("res1: "+res1);
		System.out.println("p: "+p);
		System.out.println("q: "+q);
		
		
				
				
	

	}

}
