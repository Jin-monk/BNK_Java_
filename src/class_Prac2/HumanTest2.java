package class_Prac2;

import vo.Human2;

public class HumanTest2 {

	public static void main(String[] args) {

		Human2 h1 = new Human2('M');
		Human2 h2 = new Human2('M');
		Human2 h3 = new Human2('M');
		Human2 h4 = new Human2('M');
		Human2 h5 = new Human2('F');
		Human2 h6 = new Human2('F');
		Human2 h7 = new Human2('F');
		Human2 h8 = new Human2('F');
		Human2 h9 = new Human2('F');
		Human2 h10 = new Human2('F');

		Human2[] humans = new Human2[10];

		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		humans[5] = h6;
		humans[6] = h7;
		humans[7] = h8;
		humans[8] = h9;
		humans[9] = h10;

		/*
		 * int maleCnt = 0; int femaleCnt = 0;
		 */
		getHuman sc = new getHuman();
		sc.getHuman(humans);

		for (int i = 0; i < humans.length; i++) {
			if (humans[i].cnt == 4) {
				System.out.println(humans[i].getGender());
			}
		}

		System.out.println("총 인원수: " + Human2.num);
		System.out.println("고유번호: " + h4.cnt);

	}

	static void getHuman(Human2[] gender) {
		int maleCnt = 0;
		int femaleCnt = 0;
		for (int i = 0; i < 10; i++) {
			if (gender[i].getGender()== 'M') {
				maleCnt++;
			} else {
				femaleCnt++;
			}
		}
		System.out.println("남자의 수: " + maleCnt);
		System.out.println("여자의 수: " + femaleCnt);

	}

}
