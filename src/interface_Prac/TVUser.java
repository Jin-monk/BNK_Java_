package interface_Prac;

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

		/*
		 * for (int i = 0 ; i < tvs.length ; i ++) { tvs[i].powerOn();
		 * tvs[i].volumeUp(); tvs[i].volumeDown(); tvs[i].powerOff();
		 * 
		 * }
		 */

		BeanFactory factory = new BeanFactory();
		TV tv3 = factory.getBean(3); // 1이면 삼성, 2면 LG
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
