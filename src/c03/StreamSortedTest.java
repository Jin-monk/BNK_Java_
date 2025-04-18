package c03;

import java.util.Arrays;
import java.util.List;

public class StreamSortedTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동","멀린","해리포터");
		
		//sorted의 매개변수가 없는 이유는 오름차순 정렬이기 때문
		list.stream()  // 스트림 생성
			.sorted()  // 정렬 (중간연산)
			.forEach(n -> System.out.print(n+"\t"));  // 요소를 하나씩 꺼냄(최종연산)
		
		System.out.println();
		System.out.println("======================");
		
		//매개 변수 2개인 이유는 내림차순 정렬을 위함.
		//뒤에 있는 변수 - 앞에 있는 변수 = 내림차순. 
		list.stream()
			.sorted((s1,s2) -> s1.length() - s2.length()) // 문자열의 길이로 비교한것.
			.forEach(n -> System.out.print(n + "\t")); 
		
//		stream
//
//		자료의 흐름
//		데이터뭉치 ( 컬렉션 자료)
//
//		-중간연산
//		filter : 조건에 맞는 자료들 추출하기
//		 -startWith : 특정 문자로 시작하는 것.
//		 -endsWith : 특정 문자로 끝나는 것 .
//		map : 자료를 특정한 형태로 변환하기 ( ex : 문자열 -> 문자열의 길이 ) 
//		sorted () : 정렬
//		distict () : 중복제거 
//		limit () : 스트림 범위 제한
//		skip () : 스트림 내 데이터들 중 앞으로 n개요소 건너뜀.
//
//		-최종연산 
//		collect () : 컬렉션 자료 만들어 반환0
//		forEach () : 각 요소에 대한 작업 수행
//		count() : 요소 개수 반환
//		reduce () : 요소들을 하나의 결과로 만들기 
//		anyMatch(), allMatch() : 조건 검사 
	}

}
