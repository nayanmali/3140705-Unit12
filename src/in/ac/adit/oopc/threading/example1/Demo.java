package in.ac.adit.oopc.threading.example1;

public class Demo extends Thread {
	public void run() {
		// Display the name of Thread
		System.out.println("Demo Class Thread Name : " + Thread.currentThread().getName());

		// Set Name of to the Thread
		Thread.currentThread().setName("Demo_Thread");

/*		Set Priority to the Thread
/		Thread.MAX_PRIORITY = 10
/		Thread.MIN_PRIORITY = 1
/		Thread.NORM_PRIORITY = 5
 */
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		//Display Thread Priority
		
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		
		// Display the name of Thread
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
}
