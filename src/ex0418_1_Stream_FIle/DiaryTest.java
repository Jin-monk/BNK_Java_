package ex0418_1_Stream_FIle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiaryTest {

	static BufferedReader br;
	static FileReader fr;
	static FileWriter fw;
	
	public static void main(String[] args) {
//		일기 쓰기 및 읽기 프로그램 
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 일기 작성 / 2. 일기 읽기 ");
		System.out.print("입력 >> ");
		int selectMenu = sc.nextInt();
		sc.nextLine();
		// 일기 쓰기
		if (selectMenu == 1) {
			try {
				System.out.print("작성할 일기 제목 >> ");
				String fileName = sc.nextLine();
				System.out.print("일기 작성 >> ");
				String inputdiary = sc.nextLine();
				fw = new FileWriter("C:/temp/jv_test/"+fileName+".txt");
				fw.write(inputdiary);
				fw.close();
				System.out.println("----작성 완료----");
				System.out.println();
				
				System.out.println("계속 작성하시겠습니까?");
				System.out.println("1. 계속 / 2. 종료 ");
				System.out.print("입력 >> ");
				int selectContinue = sc.nextInt();
				sc.nextLine();
				if(selectContinue == 1) {
					System.out.print("일기 쓰기 >> ");
					inputdiary = sc.nextLine();
					fw = new FileWriter("C:/temp/jv_test/diary.txt", true);
					fw.write("\n"+ inputdiary );
					fw.close();
				}
				System.out.println("----작성 완료----");
				System.out.println();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("작성 실패.");
			}
			
			
			
		//일기 읽기
		} else if (selectMenu == 2) {
			try {
//				FileReader fr = new FileReader("C:/temp/jv_test/diary.txt");
//				int data = 0 ; 
//				while ((data = fr.read()) != -1){
//					System.out.print((char)data);
//				}
//				fr.close();
				
				System.out.print("읽을 일기 제목 >> ");
				String fileName = sc.nextLine();
				
				fr = new FileReader("C:/temp/jv_test/"+fileName+".txt");
				br = new BufferedReader(fr);
				
				String s = null ; 
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		//목록 
		File dir = new File("C:/temp/jv_test/");
		File[] fileList = dir.listFiles();
		
		

	}

}
