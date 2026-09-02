package Multi_Level;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.setColid(101);
		s.setCname("coder");
		s.setColloc("Mumbai");
		s.setDeptid(180);
		s.setDeptname(null);
		s.setStudentid(102);
		s.setStudentname("Mock");
		
		System.out.println("COLLEGE ID:-"+s.getColid());
		System.out.println("COLLEGE Name:-"+s.getCname());
		System.out.println("COLLEGE LOC:-"+s.getColloc());
		
		System.out.println("Dept id:-"+s.getDeptid());
		System.out.println("Dept name:-"+s.getDeptname());
		
		System.out.println("Student id:-"+s.getStudentid());
		System.out.println("Student name:-"+s.getStudentname());
		

	}

}
