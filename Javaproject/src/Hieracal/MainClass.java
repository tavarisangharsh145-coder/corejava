package Hieracal;

import Multi_Level.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dept d=new Dept();
		d.setDeptid(1018);
		d.setDeptname("Comp");
		
		
		Student s=new Student();
		s.setStudentid(101);
		s.setStudentname("Alex");
		
		
		Professor p=new Professor();
		p.setProfid(1234);
		p.setProfname("Jonh");
		p.setColid(129);
		p.setCname("ARMIET");
		
		System.out.println("________________________________");
		System.out.println("College ID:-"+p.getColid());
		System.out.println("College Name:-"+p.getCname());
		System.out.println("_________________________________");
		
		
		System.out.println("Dept ID:-"+d.getDeptid());
		System.out.println("Dept Name:-"+d.getDeptname());
		System.out.println("Student ID:-"+s.getStudentid());
		System.out.println("Student Name:-"+s.getStudentname());
		System.out.println("Professor ID:-"+p.getProfid());
		System.out.println("Professor Name:-"+p.getProfname());
		
		
		
		
		
	
	

	}

}
