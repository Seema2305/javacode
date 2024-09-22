package assignments;

public class Assignment_7 {

	public static void main(String[] args) 
	{
	int age= 60;
	char gender='M';
	if (!(gender=='M'))
	{
		System.out.println("Free tickets for women");
	}
	else
		if(gender=='M') 
		{
			if(age<2)
			{
				System.out.println("for infant ticket is free");
			}
			else if (age>2 && age<=12 && age>60)
			{
				System.out.println("for age below 12 childrens & senior citizens half ticket");
			}
			else
				System.out.println("for age greater 12 to 60 full ticket");
		}
}
}
