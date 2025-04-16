package c03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSearchTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		
		Collections.sort(list);
		System.out.println(list);
		int idx1 = Collections.binarySearch(list, "전우치");
		System.out.println(idx1);
	
		if(idx1 == -1) {
			System.out.println("해당 데이터는 리스트에 없습니다.");
			
		}else {
			System.out.println("해당 데이터는 리스트의 " + idx1 +"번 인덱스에 있습니다.");
		}
		
	}
	
}
