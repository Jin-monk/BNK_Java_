package integer_Prac;

public class CustomerInfo {

	Customer customer;
	VipCustomer vipcustomer ;  
	
	void conversion () {
		vipcustomer.setName(customer.getName());
		vipcustomer.setPhone(customer.getPhone());
		vipcustomer.setAmount(customer.getAmount());
		
	}
	
}
