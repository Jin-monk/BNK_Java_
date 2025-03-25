package class_Prac1;

public class BookTest {

	public static void main(String[] args) {

		Book s1 = new Book("책 잘 쓰는법", "그린아카데미", "홍길동");

		System.out.println(s1.title);

		s1.setTitle("책 잘잘 쓰는법");
		System.out.println(s1.title);

		String nowTitle = s1.getTitle();
		System.out.println(nowTitle);

		String info = s1.bookInfoToString();
		System.out.println(info);

	}

}
