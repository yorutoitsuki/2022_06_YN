/*
 * 	LinkedList : 검색에는 비효율적
 * 				 추가나 삭제가 빈번히 일어나는 곳에서는 효율적
 * 
 * 	LinkedList는 다른 List계통보다 다양한 메서드를 제공한다
 */
package list;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list1.add(i);
		}
		System.out.println(list1);
		
		list1.add(1, 10);
		System.out.println(list1);
		//------------------------------------------------------------------------------------------
		list1.addFirst(20);
		System.out.println(list1);
		list1.addLast(30);
		System.out.println(list1);
		
		System.out.println(list1.removeFirst());
		
		
	}

}
