package basicprograms;

public class Constructoremployee 

{
	Constructoremployee(String employee_name)
	
	{
		String employee = employee_name;
		System.out.println("employee name is "+" "+employee);
	}
	
    Constructoremployee(int employee_ID, String employee_company)
	
	{
    	int eID = employee_ID;
    	String emp = employee_company;
		System.out.println("employee ID is "+"  "+eID);
		System.out.println("employee company is "+"  "+emp);
	}
	
   Constructoremployee(String designation, int salary)
	
	{
	  	String desg = designation;
	    int sal = salary;
		System.out.println("employee designation is "+"  "+desg);
		System.out.println("employee salary is "+"  "+sal);
	}
	
	public static void main(String[] args)
	
	{
		Constructoremployee a1= new Constructoremployee("Dipeeka");
		//Constructoremployee a2= new Constructoremployee(21, "ABC");
		//Constructoremployee a3= new Constructoremployee("Senior soft engg", 65000);
		
	}

}
