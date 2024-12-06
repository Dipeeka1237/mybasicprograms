package basicprograms;

public class Amazonnonstatic
{
	
	void add()
	
	{
	int a=100;
	int b=100;
	int sum=a+b;
	System.out.println(sum);
	}
	public static void main(String[] args)
	
	{
		Amazonnonstatic a1=new Amazonnonstatic();  //syntax of creating an object for non-static method
		//classname variable= new classname	
		// variable.non static] method
		a1.add();
	}

}
