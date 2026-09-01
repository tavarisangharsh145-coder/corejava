package beanwitharraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course ID,Course Name,Course Fees");
		
		
		CoureBean cs=new CoureBean(sc.nextInt(),sc.next(),sc.nextDouble());
		//This data is used for storing in private variables
		
		
		ArrayList<CoureBean>a=new ArrayList<CoureBean>();
		
		System.out.println("Enter Course ID,Course Name,Course Fees");
		a.add(new CoureBean(sc.nextInt(),sc.next(),sc.nextDouble()));
		
		System.out.println("Enter Course ID,Course Name,Course Fees");
		a.add(new CoureBean(sc.nextInt(),sc.next(),sc.nextDouble()));
		a.add(cs);
		
		
		Iterator<CoureBean>iter=a.iterator();
		//Iterator is predefined Interface from java.util package
		
		//hasNext()is predefined method of Iterator
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
