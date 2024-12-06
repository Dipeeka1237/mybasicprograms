package basicprograms;

public class Localvariables
{
	static void add()
	
{
	int a=30;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
}
	
	static void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
			
	}
	static void sub()
	
	{
		int a=30;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args)
	
	
	{
		add();
		sub();
		add(110,200.789);	
		
	}
	
}
