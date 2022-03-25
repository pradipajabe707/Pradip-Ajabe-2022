import java.util.*;

class digits
{
   public static void main(String []args)
   { 
   Scanner sc = new Scanner(System.in);
    System.out.println("enter a number ....");                             
   
      int x =sc.nextInt();
	  
	  String y = Integer.toString(x);
	  
	  for( int i=0;  i < y.length(); i++)
	  
	  {
		  
		System.out.println(y.charAt(i));
	  }
		
   }
}