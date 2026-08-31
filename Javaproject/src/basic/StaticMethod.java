package basic;

import java.util.Scanner;

public class StaticMethod {
	
	public static void pinverify()
	{
	Scanner sc=new Scanner(System.in);
	 String pin="12345";
		
		System.out.println("Enter the pin");
		String p=sc.next();
		
		if(pin.equals(p))
		{
			System.out.println("pin is valid");
		}
		else
		{
			System.err.println("pin is invalid");
			pinverify();
		
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pinverify();
		
		// StaticMethod.PinVerify();
		// static is a non access modifier 

	}

}














