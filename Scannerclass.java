package basicprograms;
import java.util.Scanner;
public class Scannerclass

{
	public static void main(String[] args)
   {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter student name,student ID, college name,Branch, Phoneno: ");
		String name=s1.next();
		int ID =s1.nextInt();
		String collegename=s1.next();
		String Branchname=s1.next();
		long phoneno=s1.nextLong();
		/*double no3=s1.nextDouble();
		short no4=s1.nextShort();
		float no5=s1.nextFloat();
		long no6=s1.nextLong();
		*/boolean no7=s1.nextBoolean();
		
		System.out.println("student name: " +name);
		System.out.println("student ID: " +ID);
		System.out.println("college name: " +collegename);
		System.out.println("Branch: " +Branchname);	
		System.out.println("Phoneno: " +phoneno);
   
   }

}
