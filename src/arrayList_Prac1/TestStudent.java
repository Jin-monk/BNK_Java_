package arrayList_Prac1;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student("James", 67);
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

		int count = 0;
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getScore() < 60) {
				count++;
			}
//			Student result = sList.get(i);
//			System.out.println(result);
		}

		//향상된 for 문 ; 
		for(Student stu : sList) {
			System.out.println(stu);
		}
		
		System.out.println("낙제 학생 수 : " + count);

		
		
		
		
		
//		Student[] students = new Student[5];
//		students[0] = s1 ;
//		students[1] = s2 ;
//		students[2] = s3 ;
//		students[3] = s4 ;
//		students[4] = s5 ;
//		
//		int count = 0 ; 
//		
//		for(int i = 0 ; i < students.length; i ++ ) {
//			if ( students[i].getScore() < 60) {
//				count ++ ; 
//			}
//		}
//		System.out.println("낙제학생 수 : "+ count);
//	

	}
}
