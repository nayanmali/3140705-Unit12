package in.ac.adit.oopc.threading.example5;

public class Main {
	public static void main(String[] args) {
		Demo t = new Demo();
		t.start();

		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}