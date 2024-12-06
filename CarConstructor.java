package basicprograms;

class vehicle
{
	vehicle()
	{
		System.out.println("Constructor parent");
	}
}

public class CarConstructor extends vehicle

{
	CarConstructor()
	{
		super();
		System.out.println("constructor child");
	}

	public static void main(String[] args)
	
	{
		new CarConstructor();

	}

}
