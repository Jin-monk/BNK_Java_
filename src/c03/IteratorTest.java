package c03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "bbb", "ccc");
		//반복 횟수를 지정할 수 있다. 인덱스 지정 가능 . 
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		// '처음부터 끝까지 순서대로' 반복.
		System.out.println();
		for (String s : list) {
			System.out.print(s + "\t");
		}

		//반복자 컬렉션에 사용.
		//'처음부터 끝까지 순서대로' 반복.
		System.out.println();
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}

	}

}
