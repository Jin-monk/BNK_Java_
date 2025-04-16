package c03;

public class LambdaTest1 {

	public static void main(String[] args) {

//		Unit unit = new Human();
//		unit.move();
		
		
//		익명클래스 
//		Unit unit = new Unit() {
//
//			@Override
//			public void move() {
//				System.out.println("인간이 움직여요 ? ");
//			}
//
//		};
//		unit.move();
		
		
		//인터페이스의 메서드가 하나일 경우 이러한 문법이 적용 가능하고
		//이걸 람다식이라고 한다. 
		Unit unit =  () -> {
				System.out.println("인간이 움직여요 ? ");
			};
		unit.move();
		
		
//		Unit2 unit2 =  s -> System.out.println(s);
//		unit2.move("move");
		
		//람다식은 인터페이스 메서드가 한개여야만 ! 한다.
		// 두 개가 된다면 어느 것인지에 대한 지정이 필요하기 때문에 . 
		
		Unit2 unit2 = s ->{
			System.out.println(s);
			return s.length();
		};
		int result = unit2.move("move move ..");
		System.out.println(result);
		
		
		Unit3 unit3 = (s,i) -> System.out.println(s+","+i);
		
		unit3.move("move move", 1);
		
		
	}//end of main 
}
