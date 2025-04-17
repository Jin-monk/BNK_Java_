package c03;

import java.util.Arrays;
import java.util.List;

public class StreamSortedTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동","멀린","해리포터");
		
		list.stream()  // 스트림 생성
			.sorted()  // 정렬 (중간연산)
			.forEach(n -> System.out.print(n+"\t"));  // 요소를 하나씩 꺼냄(최종연산)
		
		System.out.println();
		System.out.println("======================");
		
		list.stream()
			.sorted((s1,s2) -> s1.length() - s2.length()) // 문자열의 길이로 비교한것.
			.forEach(n -> System.out.print(n + "\t")); 
		
	}

}
