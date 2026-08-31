package BankBean;

public class CustomerBean {
	
	private int Id;
	private String Name;
	private int Bank_bal;
	private bankbeandemo Bb;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getBank_bal() {
		return Bank_bal;
	}
	public void setBank_bal(int bank_bal) {
		Bank_bal = bank_bal;
	}
	public bankbeandemo getBb() {
		return Bb;
	}
	public void setBb(bankbeandemo bb) {
		Bb = bb;
	}
	@Override
	public String toString() {
		return "CustomerBean [Id=" + Id + ", Name=" + Name + ", Bank_bal=" + Bank_bal + ", Bb=" + Bb + "]";
	}
	

}

