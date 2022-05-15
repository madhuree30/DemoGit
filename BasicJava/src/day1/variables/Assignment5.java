package day1.variables;
//Swap two numbers using temporary variable
public class Assignment5 {

	public static void main(String[] args) {
		float firstnum = 1.9f;
		float secondnum = 3.7f;
		System.out.println("Before swaping:");
		System.out.println("firstnum: "+firstnum);
		System.out.println("secondnum: "+secondnum);

        // Value of first is assigned to temporary
        float temporary = firstnum;

        // Value of second is assigned to first
        firstnum = secondnum;
		//Value of temporary (which contains the initial value of first) is assigned to second
        secondnum = temporary;
        
        System.out.println("After swaping:");
        System.out.println("firstnum: :"+firstnum);
        System.out.println("secondnum:"+secondnum);
        
        //output
        // firstnum: 1.9
        //secondnum: 3.7
        //After swaping:
        //firstnum: :3.7
        //secondnum:1.9   
	
		
		
		

	}

}
