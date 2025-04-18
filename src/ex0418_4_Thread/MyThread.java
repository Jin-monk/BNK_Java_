package ex0418_4_Thread;

public class MyThread  extends Thread{
//프로세스는 하나 이상의 쓰레드를 갖는다.
	
	//두개 이상의 쓰레드를 동시에 작동했을 때 문제점은 공용자원을 동시에 조작하려고 하기때문에 문제발생함.
	
	
	@Override
	public void run() {
		for ( int i = 0 ; i < 10 ; i ++ ) {
			System.out.println(Thread.currentThread().getName()+": "+ i);
			
			try {
				Thread.sleep(1000); //1초간 쓰레드 멈춘다. 1000 이 1sec 뜻함. 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
