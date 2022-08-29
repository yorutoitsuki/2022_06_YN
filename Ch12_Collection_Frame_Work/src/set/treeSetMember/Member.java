/*
 * String 이나 Integer 등 제공받은 클래스들은 Comparable 인터페이스를 이미 구현하여
 * 재정의된 compareTo() 메서드로 오름차순 정렬되어 추가됨
 * 
 * 우리가 만든 사용자 정의 클래스는 Comparable을 임플해야함
 * 
 * compareTo() 메서드를 내림차순 정렬되도록 재정의할 수 없다.
 * 
 * 우리가 만든 사용자 정의 클래스는 Comparable<T> 인터페이스와 Comparator<T> 인터페이스를 함께 구현하여
 * compareTo() 메서드로 '오름차순 정렬'되도록 재정의 하고 compare()
 */

package set.treeSetMember;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
	private int memberID;
	private String memberName;
	
	
	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}
	/*
	 * Comparator<T> 사용 시 유의점 :TreeSet) 생성자에 'Comparator를 구현한 객체'를 매개값으로 전달해야함
	 * 생성자 직접 추가(이유, TreeSet() 생성자 호출할 때 'Comparator를 구현한 객체'를 이 생성자(기본생성자)로 만들어 매개값으로 주기 위해)
	 */
	public Member() {
		super();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	

	public int getMemberID() {
		return memberID;
	}

	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", memberName=" + memberName + "]";
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override//기준 : memberID로 오름차순 정렬
	public int compareTo(Member o) {
		//오름차순 정렬 -1 : 권장하지 않음
//		return (this.memberID - o.getMemberID());
		//새로 추가되는 값 - 기존값 = 반환값이 '양수' : 오름차순
		//새로 추가되는 값 - 기존값 = 중복, 추가 안됨
		if(this.memberID > o.memberID) {
			return 1;
		}
		else if(this.memberID < o.memberID) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

	@Override//기준 : memberID로 내림차순 정렬
	public int compare(Member o1, Member o2) {
//		if(o1.memberID > o2.memberID) {//오버플로우 가능성 때문에 값의 비교를 권장
//			return -1;//새로 추가되는 값 - 기존값 = 반환값이 '음수' : 내림차순
//		}
//		else if(o1.memberID < o2.memberID) {
//			return 1;
//		}
//		else {
//			return 0;//새로 추가되는 값 - 기존값 = 중복, 추가 안됨
//		}
		return (-1)*o1.compareTo(o2);
		
	}
	
}
