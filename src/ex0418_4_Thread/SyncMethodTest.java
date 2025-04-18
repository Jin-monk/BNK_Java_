package ex0418_4_Thread;

public class SyncMethodTest {

	public static int money = 0 ; 
	
	public static void main(String[] args) throws InterruptedException {

		Runnable task1 = () -> {
			for ( int i = 0; i < 10000 ; i ++) {
				deposit ();
			}
		};
		Runnable task2 = () -> {
			for ( int i = 0; i < 10000 ; i ++) {
				withdraw ();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(money);
		
	}
	//동기화 : 줄 세우는 것 , 동시에 작업되지 않고 하나가 끝나고 하나가 시작할 수 있도록 줄을 만들어서 순서대로 실행되게끔 하는것 .
	public synchronized static void deposit () {
		money ++;
	}
	public synchronized static void withdraw () {
		money --;
	}
}
