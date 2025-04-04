package interface_Prac;

import java.util.Scanner;

public class TVUser {

	public static void main(String[] args) {

		/*
		 * SamsungTV samsungTV = new SamsungTV(); samsungTV.powerOn();
		 * samsungTV.volumeUp(); samsungTV.volumeDown(); samsungTV.powerOff();
		 * 
		 * LgTV LgTV = new LgTV(); LgTV.turnOn(); LgTV.soundUp(); LgTV.soundDown();
		 * LgTV.turnOff();
		 */

		TV tv1 = new SamsungTV();
		/*
		 * tv1.powerOn(); tv1.volumeUp(); tv1.volumeDown(); tv1.powerOff();
		 */

		TV tv2 = new LgTV();
		/*
		 * tv2.powerOn(); tv2.volumeUp(); tv2.volumeDown(); tv2.powerOff();
		 */
		TV[] tvs = new TV[2];
		tvs[0] = tv1;
		tvs[1] = tv2;

		
//		for (int i = 0; i < tvs.length; i++) {
//			tvs[i].powerOn();
//			tvs[i].volumeUp();
//			tvs[i].volumeDown();
//			tvs[i].powerOff();
//
//		}

		Scanner sc = new Scanner(System.in);
		BeanFactory factory = new BeanFactory();

		System.out.println("어떤 브랜드의 TV를 원하십니까? ");
		System.out.println("saumsung과 lg가 있습니다. 입력하세요: ");

		String brand = sc.nextLine();
		TV tv3 = factory.getBean(brand); // 매개변수 samsung 이면 삼성TV, 매개변수 lg 이면 LGTV

		if (tv3 == null) {
			System.out.println("해당 TV가 없습니다.");
		} else {
			tv3.powerOn();
			tv3.volumeUp();
			tv3.volumeDown();
			tv3.powerOff();
		}

	}

}
