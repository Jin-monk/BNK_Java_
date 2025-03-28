package vo;
//Student2, Student2Test, Bus
public class Student2 {
	
	String name ;
	int grade ;
	int money ;
	int fee = 1000 ;
	
	
	public Student2(String name, int grade, int money){
		this.name = name ; 
		this.grade = grade ;
		this.money = 10000 ; 
		
	}
	
	public void takeBus() {
		money = money - fee ;
		
	}
		
	public void showinfo() {
		System.out.println("");
		 
	}
}
