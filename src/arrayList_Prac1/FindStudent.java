package arrayList_Prac1;

import java.util.ArrayList;
import java.util.Scanner;

public class FindStudent {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Student s1 = new Student("James",90);
		Student s2 = new Student("Beop",80);
		Student s3 = new Student("Jin",70);
		Student s4 = new Student("Hye",60);
		Student s5 = new Student("Min",50);

		ArrayList<Student> sList = new ArrayList<>();
		
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		
		System.out.print("번호를 입력하세요: ");
		int inputI = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력하세요: ");
		String inputS = sc.nextLine();
		
		boolean found = false;
		
		for ( int i = 0 ; i < sList.size(); i ++) {
			Student s = sList.get(i);
			s.FindStudentF(inputI, inputS);
			
			if(s.getSno() == inputI && s.getSname().equals(inputS)) {
				found = true;
				break;
			}
		}
		
		if (found = false) {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		
		//System.out.println(s1.equals(sList));
		
		
		
		
		
		
	}
	
}
