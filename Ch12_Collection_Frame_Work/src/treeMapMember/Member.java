package treeMapMember;

public class Member {
	//1. privatge 멤버변수
	private	int memberID;
	private String memberName;
	
	public Member(int memberID, String meberName) {
		super();
		this.memberID = memberID;
		this.memberName = meberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public void setMemberName(String meberName) {
		this.memberName = meberName;
	}

	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", meberName=" + memberName + "]";
	}
	
	
	
	
}
