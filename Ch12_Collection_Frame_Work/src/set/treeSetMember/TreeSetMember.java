package set.treeSetMember;


import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMember {
	//멤버변수 : Member를 관리하는 TreeSet 타입을 포함관계
	private TreeSet<Member> treeSet;
	public TreeSetMember() {//오름차순 정렬됨
		treeSet = new TreeSet<Member>();
	}
	/*
	 * Comparator<T> 사용 시 유의점 :TreeSet) 생성자에 'Comparator를 구현한 객체'를 매개값으로 전달해야함
	 */
	public TreeSetMember(Member member) {//내림차순 정렬된 TreeSet
		treeSet = new TreeSet<Member>(member);
	}
	
	public void addMember(Member m) {
		treeSet.add(m);
		/*
		 * 	1. TreeSet<Member>() 생성자로 객체 생성
		 * 	   add() 호출되면 compareTo() 메서드가 자동호출되어 크기를 비교해 가면서 '오름차순' 정렬시키며 저장
		 * 	   (반환 값이 0이면 동일 객체로 인식하여 추가하지 아니함)
		 * 
		 * 	2. TreeSet(Member member) 생성자로 객체 생성
		 * 	   매개변수 member 클래스는 반드시 Comparator인터페이스를 구현해야함
		 * 	   add() 호출되면 compare() 메서드가 자동호출되어 크기를 비교해 가면서 '내림차순' 정렬시키며 저장
		 */
	}
	public boolean removeMember(Member m) {//멤버 클래스를 인수로 받음
		if(remove(m.getMemberID())){//멤버 아이디를 호출하고 그 숫자를 remove에 전달
			return true;
		}
		else {
			System.out.println(m + " 멤버는 존재하지 않습니다");
			return false;
		}
	}
	
	public boolean removeMember(int mi) {//아이디 숫자로 받음
		if(remove(mi)) {//아이디 숫자를 remove에 전달
			return true;
		}
		else {
			System.out.println(mi + " 아이디는 존재하지 않습니다");
			return false;
		}
	}
	
	private boolean remove(int id) {//삭제 함수
		Iterator<Member> itr = treeSet.iterator();
		while(itr.hasNext()) {
			if(itr.next().getMemberID() == id) {
				itr.remove();
				return true;
			}
		}
		return false;
	}//삭제 함수 끝
	
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
	}
	
	public void showAllMemeberDescending() {
		Iterator<Member> dItr= treeSet.descendingIterator();
		while(dItr.hasNext()) {
			System.out.println(dItr.next());
		}
	}
	
	public void showAllMemberDescending2() {
		NavigableSet<Member> nav = treeSet.descendingSet();
		for(Member m : nav) {
			System.out.println(m);
		}
		Iterator<Member> itr = nav.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
