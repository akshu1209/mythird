package mythird;

public class G {

	int I=19 ;    // Global level variables  outside method 
	   
     public void m2 ()
	{
		System.out.println(I);
		
		
	}
	public void m3() {
		System.out.println("method m3;"+I);
		
		

	}
	
	public static void main(String[] args)
	{
		G h=new G();
		 h.m2();
		 h.m3();                     // TODO Auto-generated method stub

	}

}
