package class_Prac;

public class Student {
	
	int no ; 
	String name;
	int korScore ;
	int engScore ;
	int mathScore ; 
	
	void print(Student[] i ) {
		System.out.println(i);
	}

	void print2() {
		System.out.println("번호: "+no);
		System.out.println("이름: "+name);
		System.out.println("국어 점수: "+korScore);
		System.out.println("영어 점수: "+engScore);
		System.out.println("수학 점수: "+mathScore);
	}
	void print3() {
		System.out.println("번호: "+no);
		System.out.println("이름: "+name);
		System.out.println("국어 점수: "+korScore);
		System.out.println("영어 점수: "+engScore);
		System.out.println("수학 점수: "+mathScore);
	}
}
