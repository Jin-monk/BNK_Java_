package c02;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle org = new Rectangle(1,1,9,9);
		Rectangle cpy; 
		
		try {
			cpy= (Rectangle) org.clone();
			org.showPosition();
			cpy.showPosition();
			Set<Rectangle> s1 = new HashSet<>();
			s1.add(cpy);
			s1.add(org);
			System.out.println("셋 크기: "+s1.size());
//			System.out.println("-----------");
//			System.out.println("수정 이후 "+"\n");
//			cpy.changePos(4, 4, 10, 10);
//			org.showPosition();
//			cpy.showPosition();
			
			//얕은 복사 : 주소값 복사
			//깊은 복사 : 내용 + 주소값 복사
			System.out.println("-----------");
			System.out.println("복사 이후 "+"\n");
			
			cpy.changePos(2, 2, 3, 3);
			org.showPosition();
			cpy.showPosition();
			
			System.out.println("복사 후 셋 크기: "+ s1.size());
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
