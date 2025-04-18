package ex0418_1_Stream_FIle;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:/temp/jv_test/test1.txt"); //문서가 없으면 생성해서 작성함. 
			fw.write("Hello, Java File I/O를 연습 중입니다.");
			fw.close();  // FileWriter에서는 반드시 close를 해줘야한다.
			
			System.out.println("파일에 문자열을 성공적으로 썼습니다.");
			
			fw = new FileWriter("C:/temp/jv_test/test1.txt" , true);  // 덮어쓰기 // ture: 이어쓰기
			fw.write("\n 이어서 씁니다. Hello, Java File I/O를 연습 중입니다.");
			fw.close();  // FileWriter에서는 반드시 close를 해줘야한다.
			
			System.out.println("파일에 문자열을 성공적으로 이어 썼습니다.");
		
		} catch (IOException e) {
			
		}
	}
}
