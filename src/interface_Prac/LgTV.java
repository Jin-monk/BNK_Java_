package interface_Prac;

public class LgTV implements TV{

	
	@Override
	public void powerOn() {
		System.out.println("LgTV 전원 켠다.");		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV 전원 끈다.");		
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV 소리 업.");		
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV 소리 다운.");		
	}

}
