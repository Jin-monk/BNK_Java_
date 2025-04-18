package ex0418_2_enum_correct;

interface Scale {
	// 언터페이스에 선언된 변수에는 모두 public static final <- 되어있다
	int DO = 0;
	int RE = 1;
	int MI = 2;
	int FA = 3;
	int SO = 4;
	int RA = 5;
	int TI = 6;
}

public class InterfaceBaseContest {

	public static void main(String[] args) {
		int sc = Scale.DO;

		// win + . = 이모지
		switch (sc) {
			case Scale.DO:
				System.out.println("도");
				break;
			case Scale.RE:
				System.out.println("레");
				break;
			case Scale.MI:
				System.out.println("미");
				break;
			case Scale.FA:
				System.out.println("파");
				break;
			case Scale.SO:
				System.out.println("솔");
				break;
			case Scale.RA:
				System.out.println("라");
				break;
			case Scale.TI:
				System.out.println("시");
				break;
		}
	}

}
