package assignments;

import constructor.Assignment_9;

public class Assignment_9 
{
	
	// using static method
	
	
	static void add(int a, int b, int c) // static method 1
	{
		int d=a+b+c;
		System.out.println("Addition of three numbers is:" +d);
	}
	
	static void sub(int a, int b, int c) // static method 2
	{
		int d=a-b-c;
		System.out.println("Subtraction of three numbers is:" +d);
	}
	
	static void mul(int a, int b, int c) // static method 3
	{
		int d=a*b*c;
		System.out.println("Multiplication of three numbers is:" +d);
	}
	
	public void add1(int a, int b, int c) // non static method 1
	{
		int d=a+b+c;
		System.out.println("Addition of three number is:" +d);
	}
	
	public void sub1(int a, int b, int c) // non static method 2
	{
		int d=a-b-c;
		System.out.println("Subtraction of three number is:" +d);
	}
	
	public void div1(int a, int b, int c) // non static method 3
	{
		int d=a/b/c;
		System.out.println("Division of three numbers is:" +d);		
	}
	
	public Assignment_9(int id) // constructor method 1 
	{
	System.out.println("Employee name is:" +id);
	}
	
	public Assignment_9(String name) // constructor method 2 
	{
	System.out.println("Employee name is:" +name);
	}
	
	public Assignment_9(double salary ) // constructor method 3
	{
	System.out.println("Employee salary is:" +salary);
	}

	
	public Assignment_9() 
	{
		
		
	}

	public static void main(String[]args)
	{
		add(40,20,10);
		sub(50,30,20);
		mul(60,40,30);
		Assignment_9 a1=new Assignment_9();
		a1.add1(12, 24, 30);
		a1.sub1(90,80,60);
		a1.div1(23, 45, 56);
		Assignment_9 a2=new Assignment_9(102);
		Assignment_9 a3=new Assignment_9("Seema");
		Assignment_9 a4=new Assignment_9(234500.01);
	}
	
	
	
}
