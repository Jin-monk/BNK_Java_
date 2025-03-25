package class_Prac1;

public class Person {
	
	int age;
	String name;
	char gender;
	
	Person(){}
	
	Person(int age){
		this.age = age ; 
	}
	Person(String name){
		this.name = name ;
	}
	Person(char gender){
		this.gender = gender ;
	}
	Person(int age, String name){
		this.age = age ;
		this.name = name ; 
	}
	Person(int age, char gender){
		this.age = age ;
		this.gender = gender ;
	}
	Person(String name, char gender){
		this.name = name ; 
		this.gender = gender ;
	}
	Person(int age, String name, char gender){
		this(age, name);
	}
}
