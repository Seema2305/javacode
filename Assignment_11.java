package assignments;
import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) 
	{
		int r;
		double pi=3.14, area;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		r=s1.nextInt();
		area=pi*r*r;
		System.out.println("Area of circle is:" +area);
		s1.close();

	}

}
