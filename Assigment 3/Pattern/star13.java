class star13

{
	public static void main(String args [])
  { 
  int n=65;
	for (int i=1; i<=5; i++)
	{  
        
		for (int m=4; m>=i; m--)
		{
			  System.out.print(" ");
		}
		int x=n;
		
		for (int j=1; j<=i; j++)
		{	
		  char ch = (char) x;
	  System.out.print(" "+ch);
	  
	  	}	
		n++;
	   System.out.println();
	}  
	   
	
  }
}