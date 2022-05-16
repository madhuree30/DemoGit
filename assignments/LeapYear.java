package assignments;

public class LeapYear 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * yr%4==0
		 * 		yr%100==0
		 * 			yr%400==0
		 * 
		 * yr%4==0 && yr%100!=0 || yr%400
		 */
		
			int year=2024;
			if(((year%4==0) && year%100!=0) || (year%400==0)) {
				
			System.out.println("leap year");
		}
		else {
			System.out.println("non leap year");
		}
			

		}
}
