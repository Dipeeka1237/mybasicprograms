package basicprograms;

import java.util.Scanner;



public class scanner 
{

	public static void main(String[] args) 
	
	{
		Scanner s1= new Scanner(System.in);
		//String name= s1.next();
		
		System.out.println("please enter the value of a");
		int a=s1.nextInt();	
		System.out.println("please enter the value of b");
		int b=s1.nextInt();	
		int sum=a+b;
		System.out.println("the sum of two numbers>");
		System.out.println(sum);
		
	}

}
