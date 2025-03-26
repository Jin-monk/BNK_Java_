package vo;

public class MyDate {
	
	int year;
	int month;
	int day;
	
	public MyDate(){}
	
	public MyDate(int year, int month, int day){
		
	}

	public void setYear(int year) {
		checkYear(year);
		this.year = year;
	}
	public void checkYear(int year ) {
		if (0 <= year && year <= 9999) {
			this.year = year ;
			
		}else {
			this.year = 0 ;
			System.out.println("값이 잘못 입력되었습니다.");
		}
	}
	public int getYear() {
		return year;
	}

	
	
	public void setMonth(int month) {
		this.month = month;
	}
	public void checkMonth(int month) {
		if (1 <= month && month <= 12 ) {
			this.month = month ; 
		}else {
			this.month = 0 ; 
			System.out.println("값이 잘못 입력되었습니다.");
		}
	}
	
	public int getMonth() {
		return month;
	}


	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}

}
