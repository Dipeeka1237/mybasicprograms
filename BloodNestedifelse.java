package basicprograms;

public class BloodNestedifelse
{

	public static void main(String[] args) 
	
	{
		int age=25;
		int weight=60;
		if(age>26)
		{
			if(weight>65)
			{
			  System.out.println("Eligible to donate the blood");
			}
			
			else
			{
				System.out.println("not eligible to donate the blood");
			}
		}
		else
		{
			System.out.println("Age must be greater than 18");
		}
	}

}
