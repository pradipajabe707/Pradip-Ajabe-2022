import java.util.*;
class fac1
{
	public static void main(String args [])
	{
	
	System.out.println("Enter a number = ");
	
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
	
	int fact=1;
	for (int i=1; i<=x; i++)                                              
	  {
         fact=fact*i;
	}
	System.out.println("THE FACTORIAL OF ENTERD NO IS " +fact );
	  }
}