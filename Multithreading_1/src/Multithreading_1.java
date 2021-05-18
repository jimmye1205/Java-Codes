class Thread_1 extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 10; i++) 
		{
			System.out.println("Hi.......");
			try {
				sleep(500);
			}	catch(Exception e)
			{	}
		}
	}
}
class Thread_2 extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 15; i++) 
		{
			System.out.println("Hello.......");
			try {
				sleep(500);
			}	catch(Exception e)
			{	
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_1 t1 = new Thread_1();
		Thread_2 t2 = new Thread_2();
		t1.start();
		t2.start();
	}

}
