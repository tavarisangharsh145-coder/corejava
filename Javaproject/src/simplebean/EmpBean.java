package simplebean;

public class EmpBean {
	
	/*
	 Java Beans is concept where we store values inside the variables indirectly with the help of setter and getter method
	 
	 SETTER METHOD:- METHOD WITH PARAMETERS
	 GETTER METHOD:- METHOD WITH VOID
	 
	 Java Beans make the code more secured
	 
	 */

	private int empid;
	private String empname;
	private double empsal;
	
	// Setter method
	public void setEmpid(int id)
	{
		this.empid=id;
	}
	
	//Getter method
	public int getEmpid()
	{
		return empid;
	}
	
	//Setter method
	public void setEmpname(String name)
	{
		this.empname=name;
	}
	
	//Getter method
	public String getEmpname()
	{
		return empname;
	}
	
	//Setter method
	public void setEmpsal(double sal)
	{
		this.empsal=sal;
	}
	
	//Getter method
	public double getEmpsal()
	{
		return empsal;
	}
	
	
}
