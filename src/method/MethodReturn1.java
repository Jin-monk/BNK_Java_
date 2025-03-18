package method;

public class MethodReturn1 {

	public static void main(String[] args) {

		boolean result = odd(2);
		System.out.println(result);

	}

	public static boolean odd(int i) {
		if (i % 2 == 1) {
			return true; // 짝수 일 경우는 리턴값이 나오지 않으므로 컴파일 오류발생.
		} else {
			return false; // 짝수여도 리턴값을 주며 컴파일 오류 방지.
		}
	}
}
