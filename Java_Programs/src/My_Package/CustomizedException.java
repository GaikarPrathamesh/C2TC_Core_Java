package My_Package;
import java.util.Scanner;

public class CustomizedException
{
	
	public static void main(String[] args) throws CantVote
	{
		int age;
		System.out.println("Enter the age");
		Scanner s = new Scanner(System.in);
	    age =s.nextInt();
	   
	    if(age<18)
	    {
	    	throw new CantVote("You cannot cast your vote....");
	    }
	    else
	    {
			System.out.println("You can happily vote...");
	    }
	 }
}
class CantVote extends 	Exception
{
	CantVote(String msg)
	{
		super(msg);
	}
}