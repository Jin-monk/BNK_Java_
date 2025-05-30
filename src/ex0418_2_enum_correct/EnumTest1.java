package ex0418_2_enum_correct;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumTest1 {

	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		
		for(Day day : Day.values()) {
			System.out.println(day);
		}
		
		switch(today) {
			case MONDAY:
				System.out.println("또 한주가 시작되었군.");
				break;
			case TUESDAY:
				System.out.println("언제 오나 주말..");
				break;
			case WEDNESDAY:
				System.out.println("오늘만 가면 2일 남았다.");
				break;
			case THURSDAY:
				System.out.println("이제 내일만...");
				break;
			case FRIDAY:
				System.out.println("이제 오늘만...");
				break;
			case SATURDAY:
				System.out.println("주말이다!!");
				break;
			case SUNDAY:
				System.out.println("크아아악!!");
				break;
			default:
				System.out.println("그런 요일 없어요");
				break;
		}
	}
}
