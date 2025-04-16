package c03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionCopyTest {

	public static void main(String[] args) {

		List<String> src = Arrays.asList("홍길동","전우치","손오공","멀린"); //Imutable(불변) 객체 생성.
		//수정가능한 리스트로 생성
		List<String> dst = new ArrayList<>(src); //Mutable(변경가능) 객체로 재생성
		System.out.println(dst);
		//정렬을 수행함.
		Collections.sort(dst);
		System.out.println(dst);
		//다시 정렬 이전 상태로 돌아갈 필요가 생겼다.
		//오른쪽에 있는것을 왼쪽으로 넣는다 . dst = src ; 랑 같음. 
		Collections.copy(dst, src);
		System.out.println(dst);
		//수정 가능한 상태인지 확인. (Mutable 객체)
		dst.remove(0);
		System.out.println(dst);
		
	}	

}
