package arraydemo;

public class Array_Demo2 
{
 public static void main (String []args)
 {
	 double d1[]= new double[4];
	 d1[0]=2300.10;
	 d1[1]=2200.09;
	 d1[2]=2100.78;
	 d1[3]=2300.67;
	 d1[4]=2500.55;
	 
	 for (int i = 0; i<5; i++) 
	 {
		System.out.println("Print the double =>" +d1[i]); 
	 }
 }
}
