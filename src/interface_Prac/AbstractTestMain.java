package interface_Prac;
//AbstractParent, AbstractParent, AbstractTestMain
public class AbstractTestMain {

	public static void main(String[] args) {
			
		//AbstractParent ap = new AbstractParent(); 실행 안됨.
		
		A a = new A (100);  
		//a.setN(20) ;  
		System.out.println(a.getN());
			
		
	}

}
