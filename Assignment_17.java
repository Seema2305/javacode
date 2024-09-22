package assignments;

import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) 
	{
		int l;
		int b;
		double circumference;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of the rectangle:");
		l=s.nextInt();
		System.out.println("enter the width of the rectangle:");
		b=s.nextInt();
		circumference=2*(l+b);
	    System.out.println("Circumference of the circle is: " +circumference);
	    s.close();
	}

}
