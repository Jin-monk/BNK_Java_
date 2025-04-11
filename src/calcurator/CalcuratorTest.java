package calcurator;

import java.util.Scanner;

public class CalcuratorTest {

	public static void main(String[] args) {
		
		int x = 5 ;
		int y = 4 ;
		int result = 0 ;
		Scanner sc = new Scanner(System.in);
		Calcurator1 calcurator1 = new Calcurator1();
		Calcurator2 calcurator2 = new Calcurator2();
//		System.out.println("무엇을 하시겠습니까?");
//		System.out.println("1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈 ");
//		System.out.print("입력 >> ");
//		int selectMenu = sc.nextInt();
//		
//		if(selectMenu == 1 ) {
//			result = calcuratormanager.add(x,y);
//		}else if(selectMenu == 2) {
//			result = calcuratormanager.sub(x,y);
//		}else if(selectMenu == 3) {
//			result = calcuratormanager.mul(x,y);
//		}else if(selectMenu == 4) {
//			result = calcuratormanager.div(x,y);
//		}
		
		result = calcurator2.absValue(-19);
		System.out.println("절댓값: "+result);
		System.out.println("제곱: "+calcurator1.power(5));
	}

}
