package set.treeSetMember;

public class TreeSetMemberMain {

	public static void main(String[] args) {
		System.out.println("---------------처음부터 오름차순 정렬---------------------");
		TreeSetMember tsm = new TreeSetMember();
		Member m1 = new Member(3, "이승기");
		tsm.addMember(m1);
		//class set.treeSetMember.Member cannot be cast to class java.lang.Comparable
		//comparable 인터페이스 구현을 하지 않았음
		
		Member m2 = new Member(2, "이진광");
		tsm.addMember(m2);
		
		Member m3 = new Member(2, "장혜원");
		tsm.addMember(m3);
		Member m4 = new Member(4, "전영훈");
		tsm.addMember(m4);
		tsm.showAllMember();
		System.out.println("------------------삭제------------------");
		if(tsm.removeMember(3)) {
			System.out.println("아이디 3 삭제");
		}
		if(tsm.removeMember(8)) {
			
		}
		tsm.showAllMember();
		System.out.println();
		tsm.showAllMemeberDescending();
		
		System.out.println("---------------처음부터 내림차순 정렬---------------------");
		TreeSetMember tsm2 = new TreeSetMember(new Member());//내림차순 정렬된 TreeSet객체 생성
		//매개변수가 있는 생성자 호출 -> 내림차순 정렬된 TreeSet객체 생성
		
		//Member 클래스가 Comparator 인터페이스를 구현하지 않고 저장하는 순간 ClassCastException 예외발생
		Member m5 = new Member(5, "서동규");
		tsm2.addMember(m5);
		
		Member m6 = new Member(6, "송호진");
		tsm2.addMember(m6);
		
		Member m7 = new Member(7, "김채우");
		tsm2.addMember(m7);
		tsm2.showAllMember();
		System.out.println();
		Member m5_2 = new Member(5, "김도영");
		tsm2.addMember(m5_2);
		tsm2.showAllMember();
		System.out.println();
		Member m8 = new Member(8, "김도영");
		tsm2.addMember(m8);
		tsm2.showAllMember();
		
		System.out.println("------------------삭제------------------");
		if(tsm2.removeMember(6)) {
			System.out.println("아이디 3 삭제");
		}
		if(tsm2.removeMember(8)) {
			System.out.println("아이디 8 삭제");
		}
		tsm2.showAllMember();
		System.out.println();
		tsm2.showAllMemeberDescending();
	}

}
