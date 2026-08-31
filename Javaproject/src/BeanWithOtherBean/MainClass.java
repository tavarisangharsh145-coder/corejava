package BeanWithOtherBean;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		personBean p=new personBean();
		
		System.out.println("Enter Person ID:-");
		p.setPid(sc.nextInt());
		
		System.out.println("ENTER Person Name:-");
		p.setPname(sc.next());
		
		System.out.println("PERSON ID:-"+p.getPid());
		System.out.println("PERSON NAME:-"+p.getPname());
		
		
		
		
		ProfBean pr=new ProfBean();
		
		System.out.println("Enter Prof ID:-");
		pr.setProfid(sc.nextInt());
		
		System.out.println("Enter Prof Name:-");
		pr.setProFname(sc.next());
		pr.setPb(p);
		
		// p is object of personBean
		
		System.out.println("Prof ID:-"+pr.getProfid());
		System.out.println("Prof Name:-"+pr.getProFname());
		System.out.println(pr.getPb());
		
		
	}

}
