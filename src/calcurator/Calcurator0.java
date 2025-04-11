package calcurator;

public interface Calcurator0 {
	
	public int add(int x, int y);
	public int sub(int x, int y);
	public int mul(int x, int y);
	public int div(int x, int y);
	
	public default int power(int x) {
		return x * x;
	}
}
