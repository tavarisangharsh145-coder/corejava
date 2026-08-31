package BankBean;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		bankbeandemo d=new bankbeandemo();
		
		System.out.println("Enter Bank Id:-");
		d.setBankId(sc.nextInt());
		
		System.out.println("Enter Bank Name:-");
		d.setName(sc.next());
		
		System.out.println("Enter Bank Lock:-");
		d.setLock(sc.next());
		
		System.out.println("BANK ID:-"+d.getBankId());
		System.out.println("BANK NAME:-"+d.getName());
		System.out.println("BANK LOCK:-"+d.getLock());
		
		
		
		Accountbean a= new Accountbean();
		
		System.out.println("Enter Account ID:-");
		a.setAccountId(sc.nextInt());
		
		System.out.println("Enter Account Name:-");
		a.setName(sc.next());
		a.setBb(d);
		
		System.out.println("ACCOUNT ID:-"+a.getAccountId());
		System.out.println("ACCOUNT NAME:-"+a.getName());
		System.out.println(a.getBb());
		
		
		
		CustomerBean c=new CustomerBean();
		
		System.out.println("Enter Customer Id:-");
		c.setId(sc.nextInt());
		
		System.out.println("Enter Customer Name:-");
		c.setName(sc.next());
		
		System.out.println("Enter Customer Bank Balance:-");
		c.setBank_bal(sc.nextInt());
		c.setBb(d);
		
		System.out.println("ENTER CUSTOMER ID:-"+c.getId());
		System.out.println("ENTER CUSTOMER NAME:-"+c.getName());
		System.out.println("ENTER CUSTOMER BANK BALANCE"+c.getBank_bal());
		System.out.println(c.getBb());
		
		
		
		
				 

	}

}
