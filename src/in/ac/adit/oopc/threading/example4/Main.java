package in.ac.adit.oopc.threading.example4;

public class Main {
	public static void main(String args[]) {
		Demo t1 = new Demo();
		Demo t2 = new Demo();
		Demo t3 = new Demo();
		
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
