package basic;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// If Else are 3 types:-
		// 1.Single If Else 
		//2.Multiple If Else
		//3.Nested If Else
		
		int a=4;
		//% means Modules     //1==0
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}  
		
		
		
		int c= 6,d= 67;
		
		if(c>d)
		{
			System.out.println(" is greater than"+ d);
		}
		else if(c<d)
		{
			System.out.println(d+" is greater than"+ c);
		}
		else if(c==d)
		{
			System.out.println("Both are equals");
			
		}

	}

}
