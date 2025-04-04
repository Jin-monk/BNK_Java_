package interface_Prac2;

public class CarMain {

	public static void main(String[] args) {

		
		Car c1 = new Car (); 
		Wheel w1 = new Wheel () ;
		
		c1.drive();
		w1.drive();
	
		w1.goForward() ; 
		w1.reverse();
		
	}
	
}
