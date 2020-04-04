package in.ac.adit.oopc.threading.example1;

public class Main {
	public static void main(String[] args) {
		Demo demo = new  Demo();
		
		
		 /*		Display the name of Thread
		 * 		First Thread Having main method is call as main_thread
		 */
		
		System.out.println("Thread Demo Class Thread Name : "+Thread.currentThread().getName());
		demo.start();
	}
}
