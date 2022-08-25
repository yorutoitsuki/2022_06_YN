package stack.cd;

import java.util.Stack;

public class CDStackMain {

	public static void main(String[] args) {
		Stack<CD> cdBox = new Stack<CD>();
		
		cdBox.push(new CD("Frost Punk"));
		cdBox.push(new CD("Calisto Protocol"));
		cdBox.push(new CD("Dead Space"));
		
		CD cd = cdBox.peek();//스택 맨 위의 객체를 확인, 제거는 하지 않음
		System.out.println(cd);
		
		int number = 0;
		while(!cdBox.isEmpty()) {
			cd = cdBox.pop();
			System.out.println(++number + " title : " + cd.getCdTitle());
		}
		
		cdBox.clear();
		
		/*
		 * try catch는 쓰레드를 이용하므로 되도록 if문을 예외처리
		 */
		if(cdBox.isEmpty()) {
			cd = cdBox.get(0);
			System.out.println(cd);
		}
		System.out.println("----");
		
		
	}

}
