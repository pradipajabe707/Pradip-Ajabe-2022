class pat5
{
	public static void main(String args [])
  { 
  int a=1;
  for (int i=1; i<=5; i++)
	{  
          for (int m=4; m>=i; m--)
	    {
		  System.out.print(" ");
	    }
          for (int j=1; j<=a; j++)
		{	
	      System.out.print("*");
		}
        a+=2;
          	System.out.println();		  
    }

  }

}