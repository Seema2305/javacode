package basicsjava;

public class StudentData 
{

	//data declaration
	int sid;
	String sname;
	
	
	// non static methods 
	public void show()
	{
	System.out.println("Student id is:"+sid);
	System.out.println("Student name is:"+sname);
	}
	
	
	public static void main(String[] args)
	{
	// object should create for non static method
		StudentData s1=new StudentData();
		s1.show(); //default data
		System.out.println("**************************");
		s1.sid=101;
		s1.sname="Seema";
		s1.show();
		
		
		StudentData s2=new StudentData();
		s2.show(); //default value
		System.out.println("****************************");
		s2.sid=102;
		s2.sname="Indrajeet";
		s2.show();
		
		
		
		
	}
}
