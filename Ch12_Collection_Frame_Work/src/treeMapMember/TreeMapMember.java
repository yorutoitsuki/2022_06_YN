package treeMapMember;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMember {
	private TreeMap<Integer, Member> memberMap;
	
	TreeMapMember() {//key 기준 오름 차순 정렬된 TreeMap
		//Integer는 Comparable 인터페이스를 이미 구현하여 재정의된 compareTo() 메서드로 오름차순 정렬되어 있음
		memberMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member m) {
		memberMap.put(m.getMemberID(), m);
	}
	
	public boolean removeMember(int memberID) {
		if(memberMap.containsKey(memberID)) {
			System.out.println(memberMap.get(memberID) + " has removed");
			memberMap.remove(memberID);
			return true;
		}
		else {
			System.out.println("해당 아이디 " + memberID + " 는 존재하지 않습니다");
			return false;
		}
	}
	
	public boolean removeMember(String memberName) {
		Set<Entry<Integer, Member>> memberSet = memberMap.entrySet();
		Iterator<Entry<Integer, Member>> itr = memberSet.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Member> indexMember = itr.next();
			if(indexMember.getValue().getMemberName().equals(memberName)) {
				System.out.println(indexMember + " has removed");
				memberMap.remove(indexMember.getKey());
				return true;
			}
		}
		System.out.println(memberName + " 님은 존재하지 않습니다");
		return false;
	}
	
	public boolean removeMember(Member member) {
		if(memberMap.containsValue(member)) {
			System.out.println(member + " has removed");
			memberMap.remove(member.getMemberID());
			return true;
		}
		System.out.println(member + " 가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember()	{
		System.out.println("오름차순 출력");
		System.out.println(memberMap);
		System.out.println();
		
	}
	
	public void showAllDescMember() {
		System.out.println("내림차순 출력");
		NavigableMap<Integer, Member> descMap = memberMap.descendingMap();
		System.out.println(descMap);
		System.out.println("for");
		NavigableSet<Integer> descKeySet = memberMap.descendingKeySet();
		for(int key : descKeySet) {
			System.out.print(key + " = " + memberMap.get(key));
			if(key != descKeySet.last()) {
				System.out.print(", ");
			}
		}
	}
}
