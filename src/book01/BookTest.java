package book01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		List<Book> bkList = new ArrayList<>();
		BookDAO bkDAO = new BookDAO();
		int selectMenu = 0;
		while (selectMenu != 5) {
			System.out.println("======MENU======");
			System.out.println("1. 책 조회 / 2. 책 수정 / 3. 책 추가 / 4. 책 삭제 / 5. 종료 ");
			System.out.print("입력 >> "+ "\n");
			selectMenu = sc.nextInt();

			if (selectMenu == 1) {
				System.out.println("1. 책 전체 조회 / 2. 책 부분 조회 ");
				System.out.print("조회할 메뉴를 입력하세요 >> "+ "\n");
				int inputselect = sc.nextInt();
				sc.nextLine();
				if(inputselect == 1) {
					bkList = bkDAO.SelectAll();
					for (Book b : bkList) {
						System.out.println(b);
					}
					System.out.println("책을 조회했습니다 ! " + "\n");
					
				}else if ( inputselect == 2) {
					bkList = bkDAO.SelectPart();
					for ( Book b : bkList) {
						System.out.println(b);
					}
				}
				//책 수정
			} else if (selectMenu == 2) {
				System.out.println("1. 책 번호 / 2. 책 이름 / 3. 책 저자 / 4. 책 출판사 / 5. 책 가격 ");
				System.out.print("수정할 것을 입력하세요 >> ");
				int updateSelect = sc.nextInt();
				sc.nextLine();
				if(updateSelect == 1) {
					bkDAO.UpdateNo();
				}
				if(updateSelect == 2) {
					bkDAO.UpdateName();
				}
				if(updateSelect == 3) {
					bkDAO.UpdateWriter();
				}
				if(updateSelect == 4) {
					bkDAO.UpdatePublisher();
				}
				if(updateSelect == 5) {
					bkDAO.UpdatePrice();
				}
				
				//책 추가
			} else if (selectMenu == 3) {
				bkDAO.Insert();
				
				//책 삭제
			} else if (selectMenu == 4) {
				bkDAO.Delete();
				
				//종료
			} else if (selectMenu == 5) {
				System.out.println("시스템을 종료합니다. ");
			} else {
				System.out.println("메뉴를 잘못 누르셨습니다 ! ");
			}
			
			
			
		}
	}

}
