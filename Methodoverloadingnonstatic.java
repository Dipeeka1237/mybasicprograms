package basicprograms;

public class Methodoverloadingnonstatic 

{
   void add()
   {
	   int a=3;
	   int b=6;
	   int c=a+b;
	   System.out.println(c);
	   
   }
	
   void add(float a, int b)
   {
	   float c=a+b;
	   System.out.println(c);
   }
	
   void add(double a, int b)
   {
	   double c=a+b;
	   System.out.println(c);
   }
	
   void add(long a)
   {
	   
	   System.out.println(a);
   }
	
	public static void main(String[] args)
	
	{
		
		Methodoverloadingnonstatic a1= new Methodoverloadingnonstatic();
		a1.add();
		Methodoverloadingnonstatic a2= new Methodoverloadingnonstatic();
		a2.add(3.14f,80);
		Methodoverloadingnonstatic a3= new Methodoverloadingnonstatic();
		a3.add(67.789, 20);
		Methodoverloadingnonstatic a4= new Methodoverloadingnonstatic();
		a4.add(90878654543l);

	}

}
