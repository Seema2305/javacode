package basicsjava;

public class ArithmaticOperator 
{
	// used static method
  public static void add()
  {
   // declaration & initialization of data
  int a=20;
  int b=10;
  int c=a+b;
  System.out.println("Addition is:" +c );
  }
  
  public static void sub()
  {
  int a=20;
  int b=10;
  int c=a-b;
  System.out.println("Subtraction is:" +c); 
  }
  
  public static void mul()
  {
	  int a=20;
	  int b=10;
	  int c=a*b;
	  System.out.println("Multiplication is:" +c);
  }
  
  public static void div()
  {
	  int a=20;
	  int b=10;
	  int c=a/b;
	  System.out.println("Division is:" +c);
  }
  
  public static void mod()
  {
	  int a=20;
	  int b=10;
	  int c=a%b;
	  System.out.println("Modules is:" +c);
  }
  
public static void main(String [] args)
  {
    add();
    sub();
    mul();
    div();
    mod();
  }


}