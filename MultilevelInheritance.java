package basicprograms;
class one
{
	static void add()
	{
		
	}
}

class Two extends one
{
	static void sub()
	{
		
	}
}
public class MultilevelInheritance extends Two 
{
	static void mul()
	{
		
	}

	public static void main(String[] args) 
	{
		mul();
		sub();
		add();

	}

}
