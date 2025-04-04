package interface_Prac2;

public class Wheel extends Car implements A,B,C {
	
	
	
	@Override
	public void drive() {
		System.out.println(Hyundai+"즐겁게 드라이브하다.");
	}
	
	
	
	@Override
	public void goForward() {
		System.out.println("앞으로 가다.");
	}
	
	@Override
	public void reverse() {
		System.out.println("뒤로 가다.");
	}
	
	@Override
	public void boost() {
		System.out.println("빠르게 가다.");
	}



	
}
