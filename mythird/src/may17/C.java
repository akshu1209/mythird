package may17;

public class C {

	public void m1()

	{
		
		int a=123;
	    int b=129;
	     if(a==b)                        // if cond satisfied 
	
	
	     {
	    	 
	    System.out.println("a is smaller");         // cond false
	    	
	     }
	     
     
	     else if(a>b)
	    	 
	     {
	    	 
	     System.out.println("b is greater");	    	 
	  
	     
	     }
	     else 
	     
	     {
	    	 
	    	 System.out.println("condition not match");    //true   cond base logic apply here
	     }
	
	}
	
	public static void main(String[]args)
	{
		C n=new C();
		n.m1();
			
		
		
	}
}

