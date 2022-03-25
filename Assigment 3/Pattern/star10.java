class star10

{
	public static void main(String args [])
  { 
int n=69;
	for (int i=1; i<=5; i++)
	{  
		for (int m=4; m>=i; m--)
		{
			  System.out.print(" ");
		}
int abc = n;
		
		for (int j=1; j<=i; j++)
		{	
	char ch = (char)abc;
	  
	  System.out.print(" "+ch);
	    abc++;
		}	
		n--;
		System.out.println();
	}  
	   
	
  }
}