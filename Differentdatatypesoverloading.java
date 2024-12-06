package basicprograms;

public class Differentdatatypesoverloading 

{
   static void add(int a,int b)
   
   {
	   int c=a+b;
	   System.out.println(c);
   }
	
	static void add(double a,int b)
	{
		
		double c=a+b;
		System.out.println(c);
	}
	
	static void add(byte a,int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
	
	
	
	public static void main(String[] args)
	
	{
		add(100, 100);
		add(78.123, 80);
		add(10, 908);
		
		
	}

}
