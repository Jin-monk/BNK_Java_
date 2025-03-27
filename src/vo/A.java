package vo;

public class A {

	  private int n ;
	  private String s ;
	  
	  
	  
	  public void setN(int i){
		  
		  this.n = i ;
	  }
	  
	  public int getN() {
		  
		  return n ;
	  }
	  
	  public void setS(String s ) {
		  this.s = s ; 
		  
	  }
	  public String getS() {
		  
		  return s ;
	  }
	  public String showinfo() {
		  return "n = "+n+", s = "+s;
	  }
	  @Override //어노케이션
	  public String toString() { //인스턴스의 멤버변수 값들을 제공하는 기능을 하는것으로 약속되어 있다.
		  return "A]]n = "+n+", s = "+s;
	  }
	  
}
