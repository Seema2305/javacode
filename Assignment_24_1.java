package assignments;

import java.util.Arrays;

public class Assignment_24_1 {

	public static void main(String[] args) 
	{

    char c1[]=new char[5];
    c1[0]='S';
    c1[1]='E';
    c1[2]='E';
    c1[3]='M';
    c1[4]='A';
    
    char c2[]=new char[5];
    c2[0]='S';
    c2[1]='E';
    c2[2]='E';
    c2[3]='M';
    c2[4]='A';
    
    boolean b3=Arrays.equals(c1, c2);
    System.out.println(b3);
	}

}
