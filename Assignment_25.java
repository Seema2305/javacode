package assignments;

import java.util.Arrays;

public class Assignment_25 
{
	static void StringArray()
	{
		String s1[]=new String[4];
		String s2[]=new String[4];
		
		s1[0]="Seema";
		s1[1]="Neeta";
		s1[2]="Ram";
		s1[3]="Swetha";
		
		s2[0]="Seema";
		s2[1]="Neeta";
		s2[2]="Ram";
		s2[3]="Swetha";
		if ( Arrays.equals(s1,s2))
		{
			System.out.println("both string arrays are equals");
		}
			else
			{
				System.out.println("both string arrays are not equals" );
			}
		}
	static void CharArray()
	{
		char c1[]=new char[4];
		char c2[]=new char[4];
		
		c1[0]='s';
		c1[1]='e';
		c1[2]='e';
		c1[3]='m';
		
		c2[0]='s';
		c2[1]='e';
		c2[2]='e';
		c2[3]='m';
		if ( Arrays.equals(c1,c2))
		{
			System.out.println("both char arrays are equals");
		}
			else
			{
				System.out.println("both char arrays are not equals" );
			}
		}
	
	
	public static void main(String[] args) 
	{
		StringArray();
		CharArray();
		

	}

}
