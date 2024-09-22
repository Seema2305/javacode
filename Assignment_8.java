package assignments;

public class Assignment_8 
{
	static void first_method()
	{
	System.out.println("first_method");	
    }
	
	void second_method()
	{
	System.out.println("second_method");
	}
	
	public static void main (String [] args)
	{
		System.out.println("main_method");
		first_method();
		Assignment_8 a1=new Assignment_8();
		a1.second_method();
	}
	

}
