package class_Prac1;

public class Student {
	int no;
	String name;
	char gender;

	Student() {
	}

	Student(int no, String name, char g) {
		this.no = no;
		this.name = name;
		gender = g;
	}

	void setNo(int i ) { // 번호 변경 함수 
		
		no = i;
	}
	void setName(String i ) { // 이름 변경 함수 
		
		name = i;
	}
	void setGender(char i ) { //성별 변경 함수 
		
		gender = i;
	}
	
	int getNo( ) { // 현재 번호 리턴 함수 
		return no; 
	}
	String getName() { // 현재 이름 리턴 함수 
		return name; 
	}
	char getGender() { // 현재 성별 리턴 함수 
		return gender; 
	}
	
}
