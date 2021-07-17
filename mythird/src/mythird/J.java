package mythird;

public class J
{
  public void m1(int a,float b)          // should be match data types
  {
	  System.out.println(a);
	  System.out.println(b);
	  
	  
  }
  
  
  public static void main(String[]args)
  {
	  
	  J j=new J();
	  j.m1(10,1.092f);
	
  }
  
  
}






