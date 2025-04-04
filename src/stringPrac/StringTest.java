package stringPrac;

public class StringTest {

	public static void main(String[] args) {

		String s1 = "abcdefg!";
		String s2 = "Hello!";
		// s1 = "Hello!!";
		// == 는 문자열 내용이 아닌 주소값을 확인하는 것이다.
		System.out.println(s1 == s2);

		String s3 = new String("Hello!");
		System.out.println(s1 == s3);

		// equals 함수를 사용하여 주소값이 아닌 내용을 비교
		System.out.println(s1.equals(s3));

		System.out.println("------------");

		char[] arr = new char[s1.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s1.charAt(i);
			System.out.print(arr[i]);
		}
		System.out.println(s1.length());
		System.out.println("------------");
		// -------------------------
		// substring( ) 문자열에서 특정 인덱스를 문자열로 출력해주는 함수
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3, 5));
		System.out.println("------------");

		// -------------------------
		// contains( ) 매개변수의 문자열을 있는지 없는지 확인하여 boolean타입으로 리턴
		boolean res1 = s1.contains("def");
		System.out.println(res1);
		System.out.println("------------");

		// -------------------------
		// indexOf() 매개변수의 문자열이 s1의 문자열의 몇번째 인덱스에 있는가 반환 .
		int res2 = s1.indexOf("f");
		System.out.println(res2);
		System.out.println("------------");

		// -------------------------
		// equals()
		String str1 = "   Java   ";
		String str2 = "java";
		System.out.println(str1.equals(str2)); // 대소문자 구분하여 내용을 비교.
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자를 무시하고 내용을 비교.

		System.out.println(str1.toUpperCase()); // 전부 대문자로 출력
		System.out.println(str1.toLowerCase()); // 전부 소문자로 출력
		System.out.println(str1); // 원 데이터가 변하는 것은 아님.
		System.out.println("------------");

		// -------------------------
		// trim()
		String newStr = str1.trim(); // 공백을 모두 제거해줌.
		System.out.println(newStr.length());
		System.out.println("------------");
		
		// -------------------------
		// replace()
		String x = str2.replace('a', 'o'); // 앞에있는 매개변수를 뒤에 있는 매개변수로 변경하여 출력해줌 .
		System.out.println(x);
		x = str2.replace("ja", "go");
		System.out.println(x);
		System.out.println(str2); // 당연히 원 데이터는 그대로.
		System.out.println("------------");
		
		// -------------------------
		// split() //매개변수로 문자열이 들어갔을 때 구분자를 기준으로 배열을 만들어준다 . 
		String k = "aaa!bbb!ccc!ddd";
		String[] kArr = k.split("!"); // 구분자는 괄호 안에 .  
		for(int i = 0 ; i < kArr.length ; i ++) {
			System.out.println(kArr[i]);
		}
		System.out.println(kArr.length);
		
	}

}
