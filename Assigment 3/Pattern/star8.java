class star8

{
	public static void main(String args [])
  { 
    int n=5;
	for (int i=1; i<=5; i++)
	{  
		for (int m=4; m>=i; m--)
		{
			  System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++)
		{	
	    System.out.print(" "+n);
	    n++;
		}
			    n=5-i;
				
				
		System.out.println();
	}  
	   
	
  }
}