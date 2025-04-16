package c03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "멀린");
//		for (String s : list) {
//			System.out.println(s);
//		}
//		 list.add("aaa"); 불변 자료이며 읽기만 가능함.

		list = new ArrayList<>(list);
		list.add("aaa");
		for (String s : list) {
			System.out.print(s+"\t");
		}

		//정렬메서드 오름차순
		//comparable 이라는 인터페이스를 정의를 해야 쓸수있따 ? 
		// Comparator?
		Collections.sort(list);
		System.out.println();
		for (String s : list) {
			System.out.print(s+"\t");
		}
		
		
		
		
	}

}
