package ex0418_1_Stream_FIle;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		File file = new File("C:/temp/jv_test/test.txt"); // 파일 경로 .

		if (file.exists()) {
			System.out.println("파일이름 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일크기 : " + file.length() + "bytes");

		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

		
		
		File file2 = new File("C:/temp/jv_test/test.txt");
		try {
			if (file2.createNewFile()) {
				System.out.println("파일이 생성되었습니다. " + file2.getName());
			} else {
				System.out.println("파일이 이미 존재합니다.");
			}

		} catch (IOException e) {
			System.out.println("파일 생성 중 문제가 발생했습니다.");
			e.printStackTrace();
		}

	}

}
