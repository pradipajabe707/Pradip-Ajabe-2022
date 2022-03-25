class swap
{
   public static void main(String []args)
   
   {
	   int x=200;
	   int y=300;
	   
	    x=x+y;
	    y=x-y;
	    x=x-y;
		
		System.out.println("The swaped value of x is...."+x);
		System.out.println("The swaped value of y is...."+y);
   }
}