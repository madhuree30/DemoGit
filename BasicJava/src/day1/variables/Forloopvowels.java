package day1.variables;

public class Forloopvowels {

	public static void main(String[] args) {
		System.out.println("**************vowels from a to z***************");
		for(char c1='a';c1<='z';c1++) {
		
		if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1=='u')) {
			System.out.println("vowels is:"+c1);
		}
	}
		System.out.println("**************number vowels from a to p***************");
		int counter=0;
		for(char c1='a';c1<='p';c1++) {
		
		if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1=='u')) {
			++counter;
			System.out.println("counter"+counter);
		
	}
}
	
	}
	}