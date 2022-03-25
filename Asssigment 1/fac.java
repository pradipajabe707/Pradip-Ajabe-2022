import java.util.*;

class fac

{
	public static void main(String args [])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.printf(" Enter the number ....");
	
	int x = sc.nextInt();
	
	for (int i=1 ; i<=x ; i++)
	{
	   if( x % i == 0)
	   
	   {
		   System.out.printf(" "+i);
	   }
	}
	}
}