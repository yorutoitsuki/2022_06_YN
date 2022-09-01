package study;


import java.util.Vector;

class Sample extends Thread {
	int seq;
	
	Sample(int seq){
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + " thread start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(this.seq + " thread has Interrupted");
		}
		System.out.println(this.seq + " thread end");
	}
}

class Sample2 implements Runnable {

int seq;
	
	Sample2(int seq){
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println("interface " + this.seq + " thread start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("interface " + this.seq + " thread has Interrupted");
		}
		System.out.println("interface " + this.seq + " thread end");
	}
	
}
public class Thread_Coroutine {
	public static void main(String[] args) {
//		ArrayList<Thread> thread = new ArrayList<Thread>();
		Vector<Thread> thread2 = new Vector<Thread>();
		for(int i = 0; i < 10; i++) {
			Thread t = new Sample(i);
			Thread t2 = new Thread(new Sample2(i));
			t.start();
			t2.start();
//			thread.add(t);
			thread2.add(t);
		}
		for(int i = 0; i < thread2.size(); i ++) {
			try {
//				thread.get(i).join();
				thread2.get(i).join();
			} catch (InterruptedException e) {
				System.out.println(i + " thread has Interrupted");
			}
		}
		System.out.println("main 종료");
	}
}
