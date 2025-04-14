package c02;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//마커인터페이스 , 표시용 인터페이스, 복제가능. 

@Getter
@Setter
@Data
public class Point implements Cloneable{
	
	private int xPos;
	private int yPos;
	
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public void showPosition() {
		System.out.printf("[%d,%d]", xPos,yPos);
		System.out.println();
	}
	//복제가 필요할 때 clone 메서드 오버라이딩. 새로운 객체를 만들어서 무언가를 한다.
	@Override
	public Point clone() throws CloneNotSupportedException {

		return (Point)super.clone();
	}
	
	public void changePos(int x, int y ) {
		xPos = x;
		yPos = y;
	}
	
	
	
	
}
