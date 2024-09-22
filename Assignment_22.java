package assignments;

public class Assignment_22 
{
    void method()
    {
    
    	System.out.println("method is without parameterrized");
    }
    void method(String name)
    {
    	System.out.println("method is parameterized"  +name);	
    }
    void method(int a) 
    {
    	System.out.println("method is parameterized"   +a);
    }
    void method(float b)
    {
    	System.out.println("method is parameterized"   +b);
    }
    void method(double c)
    {
    	System.out.println("method is parameterized"   +c);
    }
	public static void main(String[] args) 
	{
		Assignment_22 a1=new Assignment_22();
		a1.method();
		a1.method("Seema");
		a1.method(23);
		a1.method(23.2);
		a1.method(23.34);
		
	}

}
