package integer_Prac;

public class CustomerTest {

	public static void main(String[] args) {

		CustomerInfo cuschange = new CustomerInfo();
		
		Customer cus1 = new Customer("c001","Ann",30787887,1000000) ; 
		Customer cus2 = new Customer("c002","Beop",30787887,100000) ; 
		Customer cus3 = new Customer("c003","JIN",30787887,10000000) ; 
		
		VipCustomer vipcus1 = new VipCustomer(cus1.getCustomerNum(), cus1.getName(), cus1.getPhone(), cus1.getAmount(), cus1.getAmount()) ; 
		
		if(cus1.getAmount() >= 1000000) {
			cuschange.conversion();
		}
		
		System.out.println(vipcus1.toString());
		
		
//		if(cus1.getAmount()>=1000000) {
//			vipcus1 = new VipCustomer(cus1.getCustomerNum(), cus1.getName(), cus1.getPhone(), cus1.getAmount(), cus1.getAmount()*5/100);
//		}
//		if(cus3.getAmount()>=1000000) {
//			vipcus3 = new VipCustomer(cus1.getCustomerNum(), cus1.getName(), cus1.getPhone(), cus1.getAmount(), cus1.getAmount()*5/100);
//		}
		
		
		
	}
}
