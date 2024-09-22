package basicsjava;

public class EmployeeData 

{

	//declare value
	int eid;
	String ename;
	
	// calling non static method
	public void display()
	{
		System.out.println("Employee id is:" +eid);
		System.out.println("Employee name is:" +ename);
	}
	
	// to create object in main method
	public static void main (String [] args) 
	{
		EmployeeData e1=new EmployeeData();
		e1.display(); // default value 
		System.out.println("**********************");
		e1.eid=11;
		e1.ename="Pradnya";
		e1.display();
		
		
		EmployeeData e2=new EmployeeData();
		System.out.println("**********************");
		e2.eid=12;
		e2.ename="Leela";
		e2.display();
		
		EmployeeData e3=new EmployeeData();
		System.out.println("**********************");
		e3.eid=13;
		e3.ename="Ram";
		e3.display();
		
		EmployeeData e4=new EmployeeData();
		System.out.println("**********************");
		e4.eid=14;
		e4.ename="Sita";
		e4.display();
		
		EmployeeData e5=new EmployeeData();
		System.out.println("**********************");
		e5.eid=15;
		e5.ename="Geeta";
		e5.display();
		
			
	}
	
}
