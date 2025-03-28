package vo;

public class Student {
	private String school;
	private int grade ; 
	private int studentNum ;
	private Personal personal;
	
	public Student(String school, int grade, int studentNum, Personal personal) {
		super();
		this.school = school;
		this.grade = grade;
		this.studentNum = studentNum;
		this.personal = personal;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	} 
	@Override
	public String toString() {
		return "학교: "+school+ 
				"\n학년: "+grade+ 
				"\n학번: "+ studentNum+ 
				"\n이름: "+personal.getName() +
				"\n성별: "+personal.getGender()+
				"\n나이: "+personal.getAge();
	} 
	
}
