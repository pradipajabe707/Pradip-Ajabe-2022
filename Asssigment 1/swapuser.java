import java.util.*;

class swapuser
{
   public static void main(String []args)
   { 
   Scanner sc = new Scanner(System.in);
      int x=sc.nextInt();
   System.out.println("enter a first value x.....");
      int x=sc.nextInt();
   System.out.println("enter a first value y.....");  
      int y=sc.nextInt();
   
	    x=x+y;
	    y=x-y;
	    x=x-y;
		
		System.out.println("The swaped value of x is...."+x);
		System.out.println("The swaped value of y is...."+y);
   }
}