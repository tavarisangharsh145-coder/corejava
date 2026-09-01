package beanwitharraylist;

public class CoureBean {
	
	private int courseid;
	private String coursename;
	private double coursefees;
	
	
	
	CoureBean(int id, String name,double fees)
	{
		this.courseid=id;
		this.coursename=name;
		this.coursefees=fees;
		
	}



	@Override
	public String toString() {
		return "[courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
			
		

}
