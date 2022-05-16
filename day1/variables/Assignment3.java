package day1.variables;
//Find ASCII value of characters
public class Assignment3 {

	public static void main(String[] args) {
		 char ch='A';
		 int n= ch;
		 System.out.println("The ascii value of 'A' will be: "+n);
	
		 
		 char Capitalchar = 'A';
		 char Smallchar = 'a';
		 
		 //write the java program to find the ascii value from A-Z?
		 for(int i = 'A'; i <= 'Z'; i++) {
			 System.out.println(Capitalchar +" : " +i);
			 Capitalchar++;
			 
		 }
		 //write the java program to find the ascii value from a-z?
		 for (int i = 'a';i <='z';i++) {
			 System.out.println(Smallchar + " : " +i);
			 Smallchar++;
		 }
		 
		 }
		 
		 
		
		
		
		
	}
