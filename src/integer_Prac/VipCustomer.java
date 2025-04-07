package integer_Prac;

public class VipCustomer {

	private String VipCustomerNum ; // c + 고객 순번 
	private String name;
	private int phone ; 
	private int amount ; 
	private int point ;
	
	public VipCustomer(String vipCustomerNum, String name, int phone, int amount, int point) {
		VipCustomerNum = vipCustomerNum;
		this.name = name;
		this.phone = phone;
		this.amount = amount;
		this.point = point;
	}

	
	
	
	public String getVipCustomerNum() {
		return VipCustomerNum;
	}

	public void setVipCustomerNum(String vipCustomerNum) {
		VipCustomerNum = vipCustomerNum;
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

	public int getPoint() {
		return point;
	}

	public void setPoint() {
		this.point = getAmount()*5/100;
	}

	@Override
	public String toString() {
		return "VipCustomer [VipCustomerNum=" + VipCustomerNum + ", name=" + name + ", phone=" + phone + ", amount="
				+ amount + ", point=" + point + "]";
	}
	
	
	
	
	
}
