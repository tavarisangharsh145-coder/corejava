package BeanWithOtherBean;

public class personBean {
	/*
	 Bean with other Bean
	 Aggregation Relationship
	 Indirect Relationship
	 wrapper class
	 */
	
	private int pid;
	private String pname;
	
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "personBean [pid=" + pid + ", pname=" + pname + "]";
	}
}


	


