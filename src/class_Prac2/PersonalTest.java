package class_Prac2;

import vo.Personal;
import vo.Student;

public class PersonalTest {

	public static void main(String[] args) {

		Personal p1 = new Personal();

		p1.setName("김법진");
		p1.setGender('M');
		p1.setAge(28);
		
		Student stu1 = new Student("고등학교",1,10,p1);

		stu1.setSchool("고등학교");
		stu1.setGrade(1);
		stu1.setStudentNum(10);

		System.out.println(stu1.toString());
	}

}
