package vo;
//Robot, RobotTest
public class Robot {

	private String name;
	private int mood;

	public Robot() {
		this.mood = 5;
	}
	public Robot(String name) {
		this(); //생성자 안에서 또 다른 생성자를 부를땐 this() 를 사용하고 맨 윗줄에 있어야함.
		this.name=name ; 
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMood() {
		return mood;
	}

	//칭찬
	public void praise() {
		if (1 <= mood && mood < 10) {
			mood = mood + 1;
		}
	}
	//꾸중
	public void scold() {
		if(1 <= mood && mood <= 10) {
		mood = mood - 2 ; 
		}
	}
	//기분
	public void situation() {
		if (mood <= 2) {
			System.out.println("울적해요.");
		} else if (mood >= 7) {
			System.out.println("하늘을 나는 기분이에요.");
		}
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 기분: " + mood;
	}

}
