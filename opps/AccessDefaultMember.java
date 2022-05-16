package opps;

public class AccessDefaultMember 
{
public static void main(String[] args) {
		
		AccessDefaultMember p1=new AccessDefaultMember();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
