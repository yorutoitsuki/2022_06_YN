package set.treeSetMember;

public class TreeSetMemberMain {

	public static void main(String[] args) {
		System.out.println("처음부터 오름차순 정렬");
		TreeSetMember tsm = new TreeSetMember();
		Member m1 = new Member(3, "이승기");
		tsm.addMember(m1);
		//class set.treeSetMember.Member cannot be cast to class java.lang.Comparable
		//comparable 인터페이스 구현을 하지 않았음
	}

}
