package assignments;
import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) 
	{
	int l;
	int b;
	int area;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the length of the rectangle:");
	l=s.nextInt();
	System.out.println("Enter the width of the rectangle");
	b=s.nextInt();
	area=l*b;
	System.out.println("Area of Rectangle is:" +area);
	s.close();

	}

}
