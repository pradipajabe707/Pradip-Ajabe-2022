import java.util.*;
class positive
{
	public static void main(String args [])
	{
	
	System.out.println("Enter a number = ");
	
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
	
	if (x>0)
	    {
		System.out.println("The ginen no is POSITIVE ");
		}
     else if (x==0) 
	    {
		 System.out.println("The ginen no is ZERO ");
		}
	  else
		{
		 System.out.println("The ginen no is negative ");
		}
	  }
}