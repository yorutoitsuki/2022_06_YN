package queue;

import java.util.ArrayList;


class MyQueue {
	private ArrayList<String> que;

	MyQueue() {
		super();
		que = new ArrayList<String>();
	}

	void offer(String data) {
		que.add(data);
	}

	String poll() {
		if (que.isEmpty()) {
			return null;
		}
		return que.remove(0);
	}

	int size() {
		return que.size();
	}
	String peek() {
		return que.get(0);
	}
	boolean isEmpty(){
		if(que.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class QueueTest_ArrayList {

	public static void main(String[] args) {
		MyQueue cdBox = new MyQueue();

		cdBox.offer("Frost Punk");
		cdBox.offer("Calisto Protocol");
		cdBox.offer("Dead Space");

		System.out.println(cdBox.peek());

		int number = 0;
		while (!cdBox.isEmpty()) {
			System.out.println(++number + " title : " + cdBox.poll());
		}

	}

}
