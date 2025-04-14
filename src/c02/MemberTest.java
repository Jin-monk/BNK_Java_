package c02;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setMno(1);
		m1.setName("aaa");
		m1.setPhone("010-1111-1111");

		Member m2 = new Member();
		m2.setMno(1);
		m2.setName("aaa");
		m2.setPhone("010-1111-1111");

		System.out.println("== 사용 : " + (m1 == m2)); // false
		System.out.println("equals 사용 : " + m1.equals(m2)); // false -> true

		Set<Member> s1 = new HashSet<>();
		s1.add(m1);
		s1.add(m2);

		System.out.println(s1.size());
		
		

//		HashSet<Member> set = new HashSet<>();
//		set.add(m1);
//		set.add(m2);
//		
//		System.out.println(set.size());
		
		
//		Member m3 = m1 ;
//		System.out.println(m1 == m3 ); //true

	}

}
