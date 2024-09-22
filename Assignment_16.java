package assignments;

import java.util.Scanner;

public class Assignment_16 
{

	public static void main(String[] args) 
	{
		double r,circumference;
		final double pi=3.14;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius of the circle:");
		r=s.nextDouble();
		circumference=2*pi*r;
	    System.out.println("Circumference of the circle is: " +circumference);
	    s.close();
	}
	
}