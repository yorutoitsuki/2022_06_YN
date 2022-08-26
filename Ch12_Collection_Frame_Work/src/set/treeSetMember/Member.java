/*
 * String 이나 Integer 등 제공받은 클래스들은 Comparable 인터페이스를 이미 구현하여
 * 재정의된 compareTo() 메서드로 오름차순 정렬되어 추가됨
 * 
 * 우리가 만든 사용자 정의 클래스는 Comparable을 임플해야함
 */

package set.treeSetMember;

public class Member implements Comparable<Member> {
	private int memberID;
	private String memberName;
	
	
	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
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
	
}
