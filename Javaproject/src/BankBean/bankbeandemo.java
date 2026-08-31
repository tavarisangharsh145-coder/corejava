package BankBean;

public class bankbeandemo {
	private int bid;
	private String Name;
	private String Lock;
	
	public int getBankId() {
		return bid;
	}
	public void setBankId(int bankId) {
		bid = bankId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLock() {
		return Lock;
	}
	public void setLock(String lock) {
		Lock = lock;
	}
	@Override
	public String toString() {
		return "bankbeandemo [BankId=" + bid + ", Name=" + Name + ", Lock=" + Lock + "]";
	}
	

}
