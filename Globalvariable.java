package basicprograms;

public class Globalvariable 

{
	final static int a=100;
	static int b=200;
	int c=10;
	int d=20;
   static void add()
   {
	   int sum =a+b;
	   System.out.println(sum);
   }
	
   
   static void sub()
   {
	   int sub =a-b;
	   System.out.println(sub);
   }
	
   
  
public static void main(String[] args) 
	{
	    //a=500;
	   add();
	   sub();
	   Globalvariable g= new Globalvariable();
	   g.c=50;
	   System.out.println(g.c);
	   	  
		
	}

}
