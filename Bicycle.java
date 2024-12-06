package basicprograms;

class Motor 
{
	static void display()
	{
		System.out.println("Display Motor");
	}
}
public class Bicycle extends Motor

{
	static void side()
	{
		System.out.println("Display Bicycle");
	}

	public static void main(String[] args) 
	{
		side();
		display();
		
	}

}
