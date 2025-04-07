package integer_Prac;

public class Customer {

	private String CustomerNum; // c + 고객 순번
	private String name;
	private int phone;
	private int amount;

	public Customer(String customerNum, String name, int phone, int amount) {
		CustomerNum = customerNum;
		this.name = name;
		this.phone = phone;
		this.amount = this.amount + amount;
		if (this.amount >= 1000000) {
			System.out.println("VIP고객 전환");
		}
	}

	public String getCustomerNum() {
		return CustomerNum;
	}

	public void setCustomerNum(String customerNum) {
		CustomerNum = customerNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
