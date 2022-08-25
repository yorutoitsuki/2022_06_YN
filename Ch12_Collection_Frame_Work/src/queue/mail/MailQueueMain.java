package queue.mail;

import java.util.LinkedList;
import java.util.Queue;

public class MailQueueMain {

	public static void main(String[] args) {
		Queue<Mail> mail = new LinkedList<Mail>();
		
		//메일이 큐에 순서대로 저장 : 재정의된 offer()호출
		mail.offer(new Mail("1-1","1-2"));
		mail.offer(new Mail("2-1","2-2"));
		mail.offer(new Mail("3-1","3-2"));
		
		System.out.println(mail.peek());
		
		System.out.println("큐에서 객체 하나씩 꺼내서 제거");
		
		while(!mail.isEmpty()) {
			Mail each = mail.poll();
			switch(each.getMailTitle().substring(0,2)) {
			case"1-":
				System.out.println(each);
				System.out.println("case 1");
				break;
			case"2-":
				System.out.println(each);
				System.out.println("case 2");
				break;
			case"3-":
				System.out.println(each);
				System.out.println("case 3");
				break;
			}
		}
		
		System.out.println("큐에 남은 Mail 객체 수 : " + mail.size());
	}

}
