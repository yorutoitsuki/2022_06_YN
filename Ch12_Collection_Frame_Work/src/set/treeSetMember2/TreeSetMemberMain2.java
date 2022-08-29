package set.treeSetMember2;

import java.util.TreeSet;

import set.treeSetMember.Member;

public class TreeSetMemberMain2 {

	public static void main(String[] args) {
		System.out.println("---------------처음부터 오름차순 정렬---------------------");
		TreeSet<Member> tsm = new TreeSet<Member>();
		
		tsm.add(new Member(2, "손주환"));
		tsm.add(new Member(3, "황보창민"));
		tsm.add(new Member(1, "이대현"));
		
		System.out.println(tsm);
		
		System.out.println("처음부터 아이디로 내림차순 정렬");
		TreeSet<Member> tsm2 = new TreeSet<Member>(new DescendingMember());
		tsm2.add(new Member(2, "손주환"));
		tsm2.add(new Member(3, "황보창민"));
		tsm2.add(new Member(1, "이대현"));
		
		System.out.println(tsm2);
		
		
	}
}
