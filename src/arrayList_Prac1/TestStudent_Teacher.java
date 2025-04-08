package arrayList_Prac1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent_Teacher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student("James", 93);
		Student s2 = new Student("Ann", 46);
		Student s3 = new Student("Candy", 100);
		Student s4 = new Student("Bruce", 64);
		Student s5 = new Student("Ben", 56);
		
		ArrayList<Student> sList = new ArrayList<>();
		
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("번호를 입력하세요 >> ");
			int sno = sc.nextInt();
			sc.nextLine();
			System.out.print("이름을 입력하세요 >> ");
			String name = sc.nextLine();
			flag = StudentCheckerTeacher.checkStudentInfo(sList, sno, name);
			if(flag) {
				System.out.println("번호와 이름을 확인하세요.");
			}
		}
	}
	
}
