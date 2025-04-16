package c03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	//이름 정렬
//	@Override
//	public int compareTo(Person o) {
//		int result = this.name.compareTo(o.name);
//		System.out.println("result "+ result);
//		return result;
//	}
	
	//나이 정렬
	@Override
	public int compareTo(Person o) {
		System.out.println(this.age - o.age);
//		return o.age - this.age; //내림차순 
		return this.age - o.age ; //오름차순
	}
	
	
}
