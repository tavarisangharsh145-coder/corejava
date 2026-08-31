package BankBean;

public class Accountbean {
	
	private int AccountId;
	private String Name;
	private bankbeandemo Bb;
	
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public bankbeandemo getBb() {
		return Bb;
	}
	public void setBb(bankbeandemo bb) {
		Bb = bb;
	}
	@Override
	public String toString() {
		return "Accountbean [AccountId=" + AccountId + ", Name=" + Name + ", Bb=" + Bb + "]";
	}
	

}
