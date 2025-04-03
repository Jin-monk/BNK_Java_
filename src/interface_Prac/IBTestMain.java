package interface_Prac;
//IB, IBTestMain, B, C
public class IBTestMain {

	public static void main(String[] args) {
		
		IB ib = new B();
		IB ic = new C();
		
		IB[] arr = new IB[2];
		
		arr[0] = ib ;
		arr[1] = ic ; 
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].f1();
			arr[i].f2();
		}
		
		/*
		 * ib.f1(); ib.f2();
		 * 
		 * ib.f1(); ib.f2();
		 */
		
	}

}
