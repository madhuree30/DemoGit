package day1.variables;

public class Switchcase1 {

	public static void main(String[] args) {
	int num1= 10, num2=5, res;
	//char op= '%';
	switch ('+') {
	case '-':
		res= num1 - num2;
		System.out.println("num1-num2"+res);
		break;
	case '+':
		res=num1+num2;
		System.out.println("num1+num2"+res);
		break;
	case '*':
		res=num1*num2;
		System.out.println("num1*num2"+res);
		break;
	case '/':
		res=num1/num2;
		System.out.println("num1/num2"+res);
		break;
	default:
		System.out.println("Unknown operation");
		break;
		
	}

	}

}
