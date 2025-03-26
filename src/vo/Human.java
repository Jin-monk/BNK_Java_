package vo;

public class Human {

	private String name;
	private int age;
	
	public Human() {}
	
	public Human(String name,int age){
		this.name = name;
		this.age = setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int setAge(int i) {

		if (checkAge(i) == true) {

			return this.age = i;

		} else {
			this.age = 0;
			System.out.println("값의 허용범위를 벗어습니다. ");
		}
		return i;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		if (age == 0) {
			return "이름: " + name + ", 나이 미정 ";
		}
		return "이름: " + name + ", 나이: " + age;
	}

	 private boolean checkAge(int age) {
		if (1 <= age && age <= 200) {
			return true;
		} else {
			System.out.println("값의 허용범위를 벗어습니다. ");
			return false;
		}

	}
}
