package basicprograms;

interface Program1
{
	void method1();
	void method2();
}


public class Interfacework implements Program1

{

	public void method1()
	{
		
		System.out.println("Display method1");
	}

	
	public void method2() 
	{
		System.out.println("Display method2");
		
	}
	
	public static void main(String[] args)
	{
		Interfacework H=new Interfacework();
		H.method1();
		H.method2();


	}


}
