import java.util.*;

class swap1
{
   public static void main(String []args)
   { 
   Scanner sc = new Scanner("100 150");
   
   System.out.println("enter a first value x.....100");
   
      int x=sc.nextInt();
	  
   System.out.println("enter a first value y.....150"); 
   
      int y=sc.nextInt();
   
	    x=x+y;
	    y=x-y;
	    x=x-y;
		
		System.out.println("The swaped value of x is...."+x);
		System.out.println("The swaped value of y is...."+y);
   }
}