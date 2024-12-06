package basicprograms;

import java.util.Scanner;

public class Switchcase 

{
 public static void main(String[] args)
 
{
	 Scanner s1= new Scanner(System.in);
	 System.out.println("Press 1 for chrome");
	 System.out.println("Press 2 for safari");
	 System.out.println("Press 3 for edge");
	 System.out.println("Press 4 for IE");
	 System.out.println("Press 5 for firefox");
	 int input= s1.nextInt();
	switch(input)
	
	{
	  case 1: System.out.println("launch chrome browser");
	          //break;
	  case 2: System.out.println("launch safari browser");
	          break;
	  case 3: System.out.println("launch edge browser");
	          break;
	  case 4: System.out.println("launch IE browser");
	          break;
	  case 5: System.out.println("launch firefox browser");
	          break;
	  default: System.out.println("please enter 1,2,3,4 or 5 only");
	  
	}
}
}
