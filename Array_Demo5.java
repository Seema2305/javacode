package arraydemo;
import java.util.Arrays;
import java.util.Scanner;
// accept the values of the array at runtime int data type size is 4
public class Array_Demo5 
{
public static void main (String [] args)
{
	Scanner s1=new Scanner(System.in);
	int rollno[]=new int[4];
	for(int i=0; i<4; i++) 
	{
	rollno[i]=s1.nextInt();
	}
	System.out.println(Arrays.toString(rollno));
}
}
