package set.treeSetMember;

public class TreeSetMemberMain {

	public static void main(String[] args) {
		System.out.println("처음부터 오름차순 정렬");
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
	}

}
