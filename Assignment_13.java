package assignments;
import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) 
	{
		int a;
		int b;
		int area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of square");
		a=s.nextInt();
		System.out.println("Enter the side of square");
		b=s.nextInt();
		area=a*b;
		System.out.println("Area of sqaure is:" +area);
		s.close();
	}

}
