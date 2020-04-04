package in.ac.adit.oopc;

public class ThreadDemo {
	public static void main(String[] args) {
		Demo demo = new  Demo();
		
		
		 /*		Display the name of Thread
		 * 		First Thread Having main method is call as main_thread
		 */
		
		System.out.println("Thread Demo Class Thread Name : "+Thread.currentThread().getName());
		
		
		Thread thread = new Thread(demo);
		thread.start();
	}
}
