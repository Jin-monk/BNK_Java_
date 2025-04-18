package ex0418_1_Stream_FIle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	static BufferedReader br ;
	static FileReader fr; 
	public static void main(String[] args) {
		try {
//			FileReader fr = new FileReader("C:/temp/jv_test/test.txt"); //fianlly 추가로 인하여 전역변수 처리함.
			fr = new FileReader("C:/temp/jv_test/test.txt"); //읽을 파일 경로 

			int data = 0;  // '-1'을 읽기 위해서 int 형으로 선언하고 후에 char로 형변환 한다. 
			while ((data = fr.read()) != -1) {  // EOF (end of file ) 파일의 끝은 정수로 표현하는데, '-1'로 정의해둠 ..  
				System.out.print((char) data);  // 문자 단위별로 읽는다 !한 글자씩! 때문에 char 자료형으로 형변환을 해줘야한다.
			}
			fr.close();

			fr = new FileReader("C:/temp/jv_test/test.txt");
//			BufferedReader br = new BufferedReader(fr);  //fianlly 추가로 인하여 전역변수 처리함.
			br = new BufferedReader(fr);  //BufferedReader:  보조 스트링
														//FileReader fr의 문자를 읽어서 저장하고 있다가 한번에 출력시켜주는 보조 스트링임.
			
			System.out.println("버퍼 사용하기");
			String s = null ;					  
			while((s = br.readLine()) != null) {  //readLine() 함수는 문자열 단위로 읽는다. 엔터키값까지 한 문장으로 읽어서 출력한다.
				System.out.println(s);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
