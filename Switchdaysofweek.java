package basicprograms;

import java.util.Scanner;

public class Switchdaysofweek
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter day number");
		int day= s1.nextInt();
		switch(day) 
	  {
		case 1: System.out.println("Monday");
                break;
        case 2: System.out.println("Tuesday");
                break;
        case 3: System.out.println("Wednesday");
                break;
        case 4: System.out.println("Thursday");
                break;
        case 5: System.out.println("Friday");
                break;
                
         default: System.out.println("Invalid");
	 }

	}

}