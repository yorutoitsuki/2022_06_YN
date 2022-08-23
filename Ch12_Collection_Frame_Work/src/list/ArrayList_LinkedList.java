/*
 * ArrayList와 LinkedList의 속도차를 확인
 */


package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		System.out.println("ArrayList");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		
		startTime = System.nanoTime();
		for(int i  = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
	}

}
