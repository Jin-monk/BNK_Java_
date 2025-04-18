package ex0418_1_Stream_FIle;

import java.util.Arrays;
import java.util.List;

public class StreamMapTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple","anana","orange");
		
		// map : 자료를 특정한 형태로 변환하기
		list.stream()
			.map( s -> s.toUpperCase())  // 대문자로 변환하여 
			.forEach(n -> System.out.print(n + "\t"));  //출력한다.
		
		System.out.println();
		
		list.stream()
			.map( s -> s.length())
			.filter(s -> s > 5)
			.forEach(s -> System.out.print(s));
		
//		System.out.println();
//		//a로 시작하는 것 
//		list.stream()
//			.filter( s -> s.charAt(0) == 'a')
//			.map( s -> s.toUpperCase())
//			.forEach(s -> System.out.print(s));
//		
//		System.out.println();
//		//e로 끝나는 것 
//		list.stream()
//			.map( s -> s.length())
//			.filter( s -> s.charAt(0) == 'a')
//			.forEach(s -> System.out.println(s));
		
		System.out.println();
		list.stream()
			.filter( s -> s.startsWith("a")) //a로 시작하는 것
			.filter( s -> s.endsWith("e"))   //e로 끝나는 것 
			.map( s -> s.toUpperCase())
			.forEach( n -> System.out.println(n));
		
	}

}
