class Thread_1 implements Runnable
{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello......");
			try {
				Thread.sleep(500);
			} 	catch(Exception e) {
				
			}
		}
	}
}

class Thread_2 implements Runnable
{
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("Hi......");
			try {
				Thread.sleep(400);
			} 	catch(Exception e) {
				
			}
		}
	}
}

public class Multithreading_2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread_1());
		Thread t2 = new Thread(new Thread_2());
		t1.start();
		t2.start();
	}
}
