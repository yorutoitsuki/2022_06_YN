package study;

class test_object extends Thread{
	private int x;

	test_object(int x) {
		this.x = x;
	}
	void ignite() {
		System.out.println(x + " start");
		try {
			wait(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(x + " end");
	}
	@Override
	public void run() {
		ignite();
	}
	
}

public class Thread_Coroutine {
	public static void main(String[] args) {
		test_object a[] = new test_object[200];
	}

}
