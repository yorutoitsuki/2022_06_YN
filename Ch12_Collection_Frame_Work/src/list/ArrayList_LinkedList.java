/*
 * ArrayList와 LinkedList의 속도차를 확인
 * index 0에 추가가 빈번히 일어나는 상황
 * 
 * 결과 : LinkedList가 빠른 성능을 낸다
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
		System.out.println("ArrayList  걸린 시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i  = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");
	}

}
