package assignments;

import java.util.Scanner;

public class Assignment_15 {

	public static void main(String[] args) 
	{
		int a;
		int b;
		int h;
		double p1=0.5, area;
		System.out.println("Enter the base of trapezium");
		System.out.println("Enter the base of trapezium");
		System.out.println("Enter the height of trapezium");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		h=s.nextInt();
		area=p1*(a+b)*h;
		System.out.println("Area of trapezium is:" +area);
		s.close();
	}

}
