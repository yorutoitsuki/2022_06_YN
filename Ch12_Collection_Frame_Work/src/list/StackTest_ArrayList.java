/*
 * 가장 최근에 검색한 단어를 찾는다든가,
 * 장기 체스 같은 게임에서 수를 무를 때도 응요할 수 있다.
 */

package list;

import java.util.ArrayList;
import java.util.Stack;

class MyStack{
	private ArrayList<String> list;

	MyStack() {
		super();
		list = new ArrayList<String>();
	}
	
	void push(String data) {
		list.add(data);
	}
	String pop() {
		int number = list.size();
		if(number == 0) {
			System.out.print("Stack is Empty! ");
			return null;
		}
		return list.remove(number-1);
	}
	
	int size() {
		return list.size();
	}
	
}

public class StackTest_ArrayList {
	public static void main(String[] args) {
		Stack<String> stack2 = new Stack<String>();
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		
		int size = stack.size();
		for(int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}
		

	}

}
