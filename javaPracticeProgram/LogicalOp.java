package javaPracticeProgram;

public class LogicalOp {

	public static void main(String[] args) {
		int age=18;
		char Bldgrp='A';
		boolean res1 ,res2;
		res1=(age>18);
		res2=(Bldgrp=='A');
		System.out.println("Result1: "+res1);
		System.out.println("Result2: "+res2);
		//Logical AND
		System.out.println("bool1 && bool2 = "+(res1 && res2));
		//Logical OR
		System.out.println("bool1 || bool2 = " + (res1 || res2));
		//Logical NOT Equal
		System.out.println("bool1 != bool2 = "+(res1!=res2));

	}

}
