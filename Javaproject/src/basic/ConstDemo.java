package basic;

public class ConstDemo {
	
	//Constructor name should be same as that of class name
	//Constructor does not have any return statement
	//We can create only one constructor in same class
	
	//Constructor are of 2 types:-
	//1.DEFAULT CONSTRUCTOR
	//2.PARAMETERIZED CONSTRUCTOR
	
	ConstDemo(int a, int b)
	{
	
		System.out.println("Addition"+(a+b));
	}
	
	public void sub()
	{
		int a=10,b=5;
		System.out.println("SUB is "+(a-b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstDemo c=new ConstDemo(15,5);
		
		c.sub();
	}
}
