package class_Prac1;

public class Book {
	// 책 정보 저장 클래스
	// 멤버 변수 : 책 title , 출판사 publisher, 작가 writer 장르 genre, 가격 price
	// 멤버변수 세터와 게터를 만드세요 .

	String title;
	String publisher;
	String writer;
	String genre;
	int price;

	Book() {
	}

	Book(String i, String j, String k) {
		title = i;
		publisher = j;
		writer = k;
	}

	Book(String i, String j, String k, String x) {
		title = i;
		publisher = j;
		writer = k;
		genre = x;
	}

	Book(String i, String j, String k, String x, int y) {
		title = i;
		publisher = j;
		writer = k;
		genre = x;
		price = y;
	}

	void setTitle(String i) {
		title = i;
	}

	void setPublisher(String i) {
		publisher = i;
	}

	void setWriter(String i) {
		writer = i;
	}

	String getTitle() {
		return title;
	}

	String getPublisher() {
		return publisher;
	}

	String getWriter() {
		return writer;
	}

	String bookInfoToString() {
		String info = "title: "+title+" / publisher: "+publisher + " / writer: "+writer ; 
		return info ;
	}

}
