package class_Prac;

public class Student_2 {

	public static void main(String[] args) {
		
		/*
		 * Student stu1 = new Student(); Student stu2 = new Student(); Student stu3 =
		 * new Student();
		 * 
		 * stu1.no = 1; stu1.name = "James" ; stu1.korScore = 90 ; stu1.engScore = 95 ;
		 * stu1.mathScore = 100 ;
		 * 
		 * stu2.no = 2; stu2.name = "Ann" ; stu2.korScore = 50 ; stu2.engScore = 70 ;
		 * stu2.mathScore = 60 ;
		 * 
		 * stu3.no = 3; stu3.name = "Brand" ; stu3.korScore = 30 ; stu3.engScore = 25 ;
		 * stu3.mathScore = 40 ;
		 * 
		 * stu1.print(); System.out.println(""); stu2.print2(); System.out.println("");
		 * stu3.print3();
		 */
		
		Student james = new Student();
		Student ann = new Student();
		Student bread = new Student();
		
		Student[] students = new Student[5];
		students[0] = james ; 
		students[1] = ann ; 
		students[2] = bread ; 
		
		students[0].korScore = 10 ; 
	
		james.print(students);
		
	}
}
