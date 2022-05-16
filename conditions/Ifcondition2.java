package conditions;

public class Ifcondition2 
{
	public static void main(String[] args) {
		int year = 2021;
		if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}

		System.out.println("Given year is leap year or not: " + checkLeapYear(2020));//leap year
		System.out.println("Given year is leap year or not: " + checkLeapYear(2010));// common year
	}
	static boolean checkLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			// System.out.println("LEAP YEAR");
			return true;
		} else {
			// System.out.println("COMMON YEAR or NON LEAP YEAR");
			return false;
		}
	}
}
