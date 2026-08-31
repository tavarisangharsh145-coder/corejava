package basic;

public class MethodsDemo{
	
	//Basic method eodsDemo { 
	
	
	//Method should always be created the main method but inside the class 
	//Method are of 4 types:-
	//1.BASIC METHOD -OR- NON STTIC METHOD 
	//2.METHOD WITH PARAMETERS
	//3.METHOD WITHOUT VOID
	//4.STATIC METHOD
	
	//BASIC METHOD EXAMPLE:-
	public void add()
	{
		int a=5,b=10;
		System.out.println("Addition"+(a+b));
	}
	
	//METHODS WIH PARAMETERS EXAMPLE:-
	public void sub(int a,int b,int c,int d)
	{
		System.out.println("sub"+(c-d));
	}
	
	//METHODS WITHOUT VOID:-
	public int mul()
	{
		
		return 6*5;
		
	}
	
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo m=new MethodsDemo();
		
		m.add();
		m.sub(12,3,2,2);
		System.out.println("Mul is :- "+m.mul());
		
	}

}
