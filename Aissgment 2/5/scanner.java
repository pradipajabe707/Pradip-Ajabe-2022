import java.util.Scanner; 

class scanner
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
  
  System.out.println("Input the number 1"); 
  
  float x1  = sc.nextFloat();
  
  System.out.println("input the number 2");
  
  float x2 = sc.nextFloat();
  
  float y=x1*x2;
	
	System.out.println("25*5 = " +y );

  }
}