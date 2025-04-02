package class_Prac2;

import vo.PersonAge;
import vo.Tteokguk;

public class TteokgukTest {

	public static void main(String[] args) {

		PersonAge pa1 = new PersonAge("법진", 28);
		Tteokguk eat = new Tteokguk();
			
		System.out.println("먹기 전:"+pa1.getName()+pa1.getAge());
		
		eat.eatTteokguk(pa1);
		
		System.out.println("먹은 후:"+pa1.getName()+pa1.getAge());
		
		
		
	}

}
