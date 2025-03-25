package class_Prac1;

public class Constructor {

	public static void main(String[] args) {
		//생성자는 인스턴스 선언할 때 멤버변수를 초기화할때 쓰인다.

		Student stu1 = new Student(1,"James",'M');
		System.out.print("번호: " + stu1.no + ", 이름: "+ stu1.name+", 성별: "+stu1.gender);		
		System.out.println("");
		Student stu2 = new Student(2,"Ann",'F');
		System.out.print("번호: " + stu2.no + ", 이름: "+ stu2.name+", 성별: "+stu2.gender);
		System.out.println("");
		Student stu3 = new Student(3,"Bread",'M');
		System.out.print("번호: " + stu3.no + ", 이름: "+ stu3.name+", 성별: "+stu3.gender);
		System.out.println("");
		
		
		//함수의 이름이 같아야한다. 단 시그니처는 달라야한다.
		//메소드(함수)의 오버로딩이다.
		
		stu3.setName("김법진"); //이름 변경 함수  
		System.out.println(stu3.name);
		
		 
		int nowNo = stu1.getNo();
		System.out.println("\n"+nowNo);
		
		String nowName = stu1.getName();
		System.out.println("\n"+nowName);
		
		char nowGender = stu1.getGender();
		System.out.println("\n"+nowGender);
		
		
		
	}
}
