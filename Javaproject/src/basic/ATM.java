package basic;

import java.util.Scanner;

public class ATM {
	
	static Scanner sc=new Scanner(System.in);
	
	static double Bal=0.0;
	
	public static void Deposit()
	{
		System.out.println("Enter the amount to deposit");
		double dep=sc.nextDouble();
		
		if(dep>=100)
		{
			System.out.println(dep+" amount has been deposited sussesfully");
			Bal=Bal+dep;
		}
		else
		{
			System.out.println("Plese enetr the amount greater than 100");
			Deposit();
		}
		
	}
	
	
	
	public static void WithDraw()
	{
		System.out.println("Enter the amount to withdraw");
        double wit=sc.nextDouble();
        
        if(Bal<=100)
        {
        	System.out.println("Balance iss insufficient..please deposit first");
        	choice();
        }
        else
        {
        	
        
		if(wit>=100)
		{
			System.out.println(wit+" amount has been withdrawn sussesfully");
			Bal=Bal+wit;
		}
		else
		{
			System.out.println("Please enetr the amount greater than 100");
			WithDraw();
		}
	}
	}
	
	
	
	public static void choice()
	{
		System.out.println("Enter your choice..\n1.DEPOSIT \n2.WITHDRAW \n3.CHECK BALANCE");
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			Deposit();
			break;
		case 2:
			WithDraw();
			break;
		case 3:
			System.out.println("Your current balance is"+Bal);
			break;
			
			default:
				System.out.println("Invalid Choice..");
				choice();
				break;
		}
	}
	
	
	
 public static void transaction()
 {
	 choice();
	 System.out.println("do you want to continue...yes/no");
	 String option=sc.next();
	 
	 if(option.equalsIgnoreCase("yes"))
	 {
		 transaction();
	 }
	 else if(option.equalsIgnoreCase("no"))
	 {
		 System.out.println("Thank  you for using our service...");
	 }
 }
 
 
 
 
	public static void PinVerify()
	{
        String pin1="12345";
		
		System.out.println("Enter your pin number");
		String pin2=sc.next();
		
		for (int i=1; i<=3; i++)
		{
			if(i<=2)
			{
				
				if(pin1.equals(pin2))
				{
					System.out.println("Pin is valid");
					transaction();
					
					break;
				}
				else
				{
					System.out.println("Pin is invalid.please try again");
					pin2=sc.next();
				}
			}
			else if(i==3)
			{
				if(pin1.equals(pin2))
				{
					System.out.println("Pin is valid");
					transaction();
					
					break;
				}
				else
				{
					System.out.println("Acc is blocked..");
				}
				}
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinVerify();

		
}
}