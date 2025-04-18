package ex0418_4_Thread;

public class MyRunnableTest {

	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();

		Thread t1 = new Thread(runnable, "Thread-A");
		Thread t2 = new Thread(runnable, "Thread-B");
		
		//코드 순서 상관없이 실행된다. 독자적인 실행 
		t1.start();
		t2.start();
		
	}

}
