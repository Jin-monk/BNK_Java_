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
	  
	  
}
