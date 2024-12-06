package basicprograms;
public class Gradingsystem 
{
   public static void main(String[] args) 
	{
		int marks=75;
		if(marks<50)
		{
			System.out.println("fail");
		}
		else if(marks<60 && marks>50)
		{
			System.out.println("D");
		}
		else if(marks<70 && marks>60)
		{
			System.out.println("C");
		}
		else if(marks<80 && marks>70)
		{
			System.out.println("B");
		}
		else if(marks<90 && marks>80)
		{
			System.out.println("A");
		}
		
		else
		{
			System.out.println("A+");
		}
	}

}
