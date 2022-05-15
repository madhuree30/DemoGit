package predefinedClasses;

public class Objectclass3 {

	static int last_roll = 100;
	int roll_no;

	// Constructor
	Objectclass3()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }

	// Driver code
	public static void main(String args[]) {
		Objectclass3 s = new Objectclass3();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}

}
