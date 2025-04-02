package vo;

public class PersonAge {
	//생성시 이름 나이 부여 
	//음식 클래스 떡국이 있고 
	// 사람이 떡국을 먹다라는 함수가 있고, 
	// 메서드 내에서 떡국 메서드 실행
	// 먹으면 나이가 한살 증가 .  
	// (떡국클래스에 멤버변수)떡국을 먹었습니다. 출력 
	
	private String name;
	private int age;
	private int weight;
	
	public PersonAge(String name, int age){
		this.name = name ;
		this.age = age ;
	}
	public PersonAge(String name, int age, int weight){
		this.name = name ;
		this.age = age ;
		this.weight = weight ; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		age++ ;
	}
	
	
}
