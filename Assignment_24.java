package assignments;

import java.util.Arrays;

public class Assignment_24 {

	public static void main(String[] args) 
	{
     String name1[]=new String[5];
     name1[0]="Seema";
     name1[1]="Indrajeet";
     name1[2]="Ajay";
     name1[3]="Neeta";
     name1[4]="Brahmi";
     
     String name2[]=new String[5];
     name2[0]="Seema";
     name2[1]="Indrajeet";
     name2[2]="Ajay";
     name2[3]="Neeta";
     name2[4]="Brahmi";
     
     boolean b2=Arrays.equals(name1,name2);
     System.out.println(b2);
     
	}

}
