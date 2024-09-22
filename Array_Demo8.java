package arraydemo;

import java.util.Arrays;

// copy one array into another array in reverse order
public class Array_Demo8 {
     
	public static void main(String[] args) 
	{
		int array1[]=new int[4];
		array1[0]=85;
		array1[1]=96;
		array1[2]=65;
		array1[3]=68;
		
		int array2[]=new int[4];
	
		
		for(int i=0; k=3; i<array1.length; i++)
		{
			array2[k]=array1[i];
			k--;
		}
		System.out.println(Arrays.toString(array1));
		
		System.out.println(Arrays.toString(array2));
		

	}

}
