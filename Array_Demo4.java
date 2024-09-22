package arraydemo;

import java.util.Arrays;

public class Array_Demo4 
{
// to check if two arrays are equals to each others
	public static void main (String [] args)
	{
		int student_id_1[]= new int[4];
		student_id_1[0]=78;
		student_id_1[1]=71;
		student_id_1[2]=77;
		student_id_1[3]=43;
		
		
		int student_id_2[]= new int[4];
		student_id_2[0]=78;
		student_id_2[1]=71;
		student_id_2[2]=77;
		student_id_2[3]=43;

		boolean b1=Arrays.equals(student_id_1, student_id_2); // using equals method
		System.out.println(b1);
	}
}
