package basicprograms;

public class assignmentstaticnonstatic {


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
	
	void add(int a)
	{
		int c=a+6;
		System.out.println(c);
		
	}
	
	void login()
	{
		
		System.out.println("howttologin");
	}
	public static void main(String[] args)
	
	
	{
		add();
		sub();
		add(110,200.789);
		assignmentstaticnonstatic a1=new assignmentstaticnonstatic();
		a1.add(100);
		assignmentstaticnonstatic n1=new assignmentstaticnonstatic();
		n1.login();
		
	}
	

}
