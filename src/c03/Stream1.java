package c03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		// !! 스트림 연산은 기존 자료를 변경하지 않는다 !! 
		// 스트림은 중간 연산과 최종연산으로 나뉜다.
		// 스트림은 생성하고 사용한 스트림은 재사용 할수 없다 . 
		//
		
		
		// 1. 스트림 생성. 데이터 흐름 ? 
		IntStream stm1 = Arrays.stream(arr);
		
		// 2. 중간 연산.
		IntStream stm2 = stm1.filter(n -> n%2 == 1);
		
		// 3. 최종 연산.
		int sum = stm2.sum();
		
		System.out.println(sum);
		
		// 이런 식의 표현은 파이프 라인 형성 이라고 함.
		// 메서드 체인 . 
		int sum2 = Arrays.stream(arr)
				     	 .filter(n -> n%2 == 0)
				     	 .sum();
		System.out.println(sum2);
		
	}
	
}
