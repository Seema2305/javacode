package assignments;

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) 
	{
		int b;
		int h;
		double p1=0.5, area;
		System.out.println("Enter the base of triangle");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height of triangle");
		b=s.nextInt();
		h=s.nextInt();
		area=p1*b*h;
		System.out.println("Area of triangle is:" +area);
		s.close();
	}

}
