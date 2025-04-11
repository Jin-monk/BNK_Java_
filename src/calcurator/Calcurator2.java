package calcurator;

public class Calcurator2 extends Calcurator1 {
	
	public int absValue(int x) {
		
		if( x > 0 ) {
			result = x ; 
		}else if ( x < 0 ) {
			result = x * (-1) ;
		}else if ( x == 0 ) {
			System.out.println("잘못 입력됨!");
		}
		
		return result; 
	}
}
