package ex0418_4_Thread;

public class MyThreadTest {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		
		   			//run 메서드를 직접 호출하면 쓰레드가 동작을 안함. 무조건 start 메서드를 호출해야함
		t1.start();	//start 메서드를 호출하면 내부에서 run 메서드를 호출함 !!! 
		t2.start();
		
		System.out.println("-----End of Main-----");
	}

}
