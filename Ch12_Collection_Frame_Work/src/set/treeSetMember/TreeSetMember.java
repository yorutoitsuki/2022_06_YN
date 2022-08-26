package set.treeSetMember;

import java.util.TreeSet;

public class TreeSetMember {
	//멤버변수 : Member를 관리하는 TreeSet 타입을 포함관계
	private TreeSet<Member> treeSet;
	public TreeSetMember() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member m) {
		treeSet.add(m);
		/*
		 * 	1. TreeSet<Member>() 생성자로 객체 생성
		 * 	   add() 호출되면 compareTo() 메서드가 자동호출되어 크기를 비교해 가면서 '오름차순' 정렬시켜 저장
		 * 
		 * 
		 */
	}
	
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
	}
	
	
}
