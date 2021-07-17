package mythird;

import java.util.Scanner;



public class L 

{
	
	public static void main(String[]args )
	  {
		double b ;
	
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the number");
	      b= scr.nextInt();                               // scanner is classs pre difine by sc is syntax
		                                       // u have to create object for sc
		
		
		if (b%2==0)
		{
		  System.out.println("The given number is even="+b);
		   }
	  else
	  {
		  System.out.println("The given number is odd="+b);
	  }
	
	  
		  
	
	  
	}
}

