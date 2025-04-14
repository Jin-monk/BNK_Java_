package c02;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Rectangle implements Cloneable{

	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1,y1);
		lowerRight = new Point(x2,y2);
	}
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1,y1);
		lowerRight.changePos(x2,y2);
		
	}
	public void showPosition() {
		System.out.println("좌측 상단: ");
		upperLeft.showPosition();
		
		System.out.println("우측 하단: ");
		lowerRight.showPosition();
		System.out.println();
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangle copy = (Rectangle)super.clone();
		copy.upperLeft = (Point)upperLeft.clone();
		copy.lowerRight= (Point)lowerRight.clone();	
		return copy;
	}
//	@Override
//	public  boolean equals(Object obj) {
//		
//		Rectangle temp = (Rectangle) obj ;
//		return temp;
//	}
//	@Override
//	public int hashCode() {
//		return Rectangle.hash(upperLeft,lowerRight);
//	}
}
