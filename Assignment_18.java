package assignments;

import java.util.Scanner;

public class Assignment_18 {

	public static void main(String[] args) 
	{
     
		int a;
		double circumference;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the side of the square:");
		a=s.nextInt();
		circumference=4*a;
	    System.out.println("Circumference of the square is: " +circumference);
	    s.close();

	}

}
