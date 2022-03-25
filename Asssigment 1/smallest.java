import java.util.*;

class smallest

{
	public static void main(String args [])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.printf(" Enter the number 1 ....");
	int x = sc.nextInt();
	
	System.out.printf(" Enter the number 2....");
	int y = sc.nextInt();
	
	System.out.printf(" Enter the number 3....");
	int z = sc.nextInt();
	
	
	if ( x<=y && x<=z )
	{
		System.out.printf("the smallest no is........"+x);
	}
	else if ( y<=x && y<=z )
	{
		System.out.printf("the smallest no is........"+y);
	}
	else
	{
		System.out.printf("the smallest no is........"+z);
	}
	
	}
}