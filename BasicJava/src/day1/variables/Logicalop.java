package day1.variables;

public class Logicalop {

	public static void main(String[] args) {
		int age= 18;
		char bldgroup= 'A';
		boolean res1, res2;
		res1=age>18;
		res2=(bldgroup=='A');
		res1= (age>18);
		res2= (bldgroup=='A');
		System.out.println("result1: "+res1);
		System.out.println("result2: "+res2);
		//logical && condition
		System.out.println("result1&&result2:"+ (res1&&res2) );
		//logical OR condition
		System.out.println("result||result: "+(res1||res2));
		// logical NOT
		System.out.println("result1&&result2:"+ !(res1&&res2) );
		

	}

}
