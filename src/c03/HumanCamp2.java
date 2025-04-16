package c03;

public class HumanCamp2 {
	private int speed = 10;

//	public Unit getMarine() {
//		class Marine2 implements Unit {
//			@Override
//			public void move() {
//				System.out.println("인간형 유닛이 " + speed + "의 속도로 이동합니다.");
//			}
//	
//		}
//		return new Marine2();
//	}

	//익명클래스 
	public Unit getMarine() {
		return new Unit() {

			@Override
			public void move() {
				System.out.println("인간형 유닛이 " + speed + "의 속도로 이동합니다.");
			}
		};
	}
}
