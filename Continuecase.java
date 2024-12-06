package basicprograms;

public class Continuecase 

{

	public static void main(String[] args)
	{
		for (int i=100; i<=200; i++)
		{
			if(i==180)
			{
				continue;
			}
			
			System.out.println(i);
		}
	}

}
