package assignments;

import java.util.Arrays;

public class Assignment_26 {

	public static void main(String[] args) 
	{
		
     int a1[]=new int[5];  // original array
     a1[0]=2;
     a1[1]=4;
     a1[2]=6;
     a1[3]=8;
     a1[4]=10;
     
     int a2[]=new int[5]; // reversed array
   
     for(int i=0, k=a2.length-1; i<a1.length; i++, k--)
     {
    	 a2[k]=a1[i];
     }
     System.out.println("Original array is: "+ Arrays.toString(a1));
     System.out.println("Reversed array is: "+ Arrays.toString(a2));
	}

}
