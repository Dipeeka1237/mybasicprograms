package basicprograms;

public class Methodoverloading 
{

	static void add()
		
	  {
	   	int a=80;
	   	int b=80;
	   	int sum=a+b;
	   	System.out.println(sum);
	  }
	
	static void add(int a, double b)
	
	  {
	   	double c=a+b;
	   	System.out.println(c);
	  }
	
	static void add(float a, int b)
	
	{
	   	float c=a+b;
	   	System.out.println(c);
	}
	
     static void add(String a)
	
	{
	   	System.out.println("Dipeeka");
	}
	   public static void main(String[] args)
	   {
	     add();
	     add(100, 24.345678);
	     add(3.14f, 90);
	     add("Dipeeka");
	     
	   }

}