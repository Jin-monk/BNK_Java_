package ex0418_1_Stream_FIle;

enum Day{
	MONDAY,TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumTest1 {

	public static void main(String[] args) {
		
		Day today = Day.FRIDAY;
		
		for(Day day:Day.values()) {
			System.out.println(day);
		}
		
		System.out.println(today);
		
		switch (today) {
		case MONDAY -> System.out.println("또 한주 시작됨..");
//			break;
		case TUESDAY -> System.out.println("언제 오나 주말? ");
//			break;
		case WEDNESDAY -> System.out.println("오늘만 하면 2일");
//			break;
		case THURSDAY -> System.out.println("내일이면 금요일");
//			break;
		case FRIDAY -> System.out.println("오늘만 하면 주말");
//			break;
		case SATURDAY -> System.out.println("토요일");
//			break;
		case SUNDAY -> System.out.println("일요일");
//			break;
		default ->  System.out.println("그런거 없음");
			
			
			
		}
	}

}
