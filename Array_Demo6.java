package arraydemo;

import java.util.Arrays;
// if array size is 5 of int data type and check if 34 is present in the array or not
// how to find out the index of 34
public class Array_Demo6 
{
public static void main(String[]args)
{
	int rollno[]=new int [4];
	rollno[0]=78;
	rollno[1]=88;
	rollno[2]=98;
	rollno[3]=34;
	int notocheck=34;
	for(int i=0; i<4; i++)

	{
	if(notocheck==rollno[i])
	{
		System.out.println("The Given no->" +notocheck +" is the part of array");
		System.out.println("The Given no->" +notocheck +" and it's index is->" +i);
	}
	
}
}
}