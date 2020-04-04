package in.ac.adit.oopc.threading.example3;
public class Main{
	public static void main(String args[]) {
		Demo t1 = new Demo();
		Demo t2 = new Demo();

		t1.start();
		t2.start();
	}
}