package class_Prac2;
//Unit, UnitTest 
import vo.Unit;

public class UnitTest {

	public static void main(String[] args) {

		Unit unit_1 = new Unit ("이름1");
		Unit unit_2 = new Unit ("이름2");
		
		
		unit_1.attack(unit_2);
		
		System.out.println(unit_1.toString());
		System.out.println(unit_2.toString());
		
	}

}
