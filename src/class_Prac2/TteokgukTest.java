package class_Prac2;
//Person, Tteokguk, TteokgukTest
import vo.Person;
import vo.Tteokguk;

public class TteokgukTest {

	public static void main(String[] args) {

		Person pa1 = new Person("법진", 28,72);
		Tteokguk eat = new Tteokguk();
			
		System.out.println("먹기 전:"+pa1.getName()+pa1.getAge());
		
		eat.eatTteokguk(pa1);
		
		System.out.println("먹은 후:"+pa1.getName()+pa1.getAge());
		
		
		
	}
		
}
