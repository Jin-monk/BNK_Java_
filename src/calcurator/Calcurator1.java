package calcurator;

public class Calcurator1 implements Calcurator0{
	
	int result = 0 ;

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y ;
	}

	@Override
	public int mul(int x, int y) {
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		return (int)x / y;
	}
	
	
//	public int add(int x, int y ) {
//		return x + y;
//	}
//	public int sub(int x, int y ) {
//		return x - y ;
//	}
//	public int mul(int x, int y ) {
//		return x * y;
//	}
//	public int div(int x, int y ) {
//		return (int)x / y;
//	}
	
}
