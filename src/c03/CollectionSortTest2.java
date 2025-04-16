package c03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		
		//원본이 바뀌는지 안 바뀌는지에 대해 항상 생각해야함.
		
		Collections.sort(list);
		System.out.println(list);
		
		StringDesc cmp = new StringDesc();
		
		Collections.sort(list,cmp);
		System.out.println(list);
		
	}

}
