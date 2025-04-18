package ex0418_1_Stream_FIle;

import java.util.List;

public class StreamFinalTest {

	public static void main(String[] args) {

		List<String> words = List.of("helli", "hi", "world");

//		anyMatch
		boolean result = words.stream()
				.anyMatch(s -> s.length() < 3); // 길이가 3 미만인 단어가 있나 ?

		if (result) {
			System.out.println("있어요.");
		}else {
			System.out.println("없어요.");
		}
		
//		allMatch 
		boolean result2 = words.stream()
				.allMatch(s -> s.length() < 3); // 모두 길이가 3 미만인 단어인가? 
		
		if (result2) {
			System.out.println("있어요.");
		}else {
			System.out.println("없어요.");
		}
		
		
	}

}
