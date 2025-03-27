package vo;

public class Human2 {
	//인스턴스 생성될때 해당 인간 고유번호가 할당
	//메인메소드에서 인간 몇명인지 확인
	//남자4 여자6 , 배열에 넣고 출력 
	//번호가 4번인 사람의 성별을 알아내고 
	public int cnt ; //고유번호
	public static int num ;  //총 인원수
	public char gender ; 
	//public static int genderM ; 
	//public static int genderF ; 
	
	
	
	
	
	public Human2(char gender ) {
		num++;
		cnt = num;
		this.gender = gender;  
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
