package predefinedClasses;

public class Objectclass2 {

	static int last_roll = 100;
	int roll_no;

	// Constructor
	Objectclass2()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	@Override
    public int hashCode()
    {
        return roll_no;
    }

	// Driver code
	public static void main(String args[]) {
		Objectclass2 s = new Objectclass2();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
	}

}
