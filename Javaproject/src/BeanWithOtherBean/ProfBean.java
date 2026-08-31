package BeanWithOtherBean;

public class ProfBean {
	
	private int profid;
	private String proFname;
	private personBean pb;
	
	public int getProfid() {
		return profid;
	}
	public void setProfid(int profid) {
		this.profid = profid;
	}
	public String getProFname() {
		return proFname;
	}
	public void setProFname(String proFname) {
		this.proFname = proFname;
	}
	public personBean getPb() {
		return pb;
	}
	public void setPb(personBean pb) {
		this.pb = pb;
	}

}
