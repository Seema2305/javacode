package assignments;

public class Assignment_23 {

	
			static double pi = Math.PI;
			// math.PI method comes from math class, math class comes from java.lang package
			public static void main(String[] args) 
			{
				double r = Math.random(); // Random method comes from math class, math class comes from java.lang package
				for(int i = 0; i<10;i++)
				{
					System.out.println("Radius of circle is "+i + " -> "+r);
					double circleArea = pi*r*r;
					System.out.println("Area of circle "+i + " -> "+circleArea);

			}

		
	}

}
