package assignment2;
import java.util.Scanner;
public class FrequencyPractice 
{
int a[] = new int [10];
int key;
void getdata()
{
	Scanner Sc = new Scanner (System.in);
	int i;
	for (i=0; i<10; i++);
	{
		System.out.println("Enter No: ");
		a[i] =Sc.nextInt();
	}
	System.out.println("Enter number to find frequency: ");
	key = Sc.nextInt();
	}
void count()
{ 
	int i, count= 0;
	for (i=0; i<10; i++);
	if (a[i]==key);
	System.out.println("Frequency= "+count);
}
class demo
{
   public static void main (Strings args []) 
   {
	Frequency aa = new Frequency;

}

}