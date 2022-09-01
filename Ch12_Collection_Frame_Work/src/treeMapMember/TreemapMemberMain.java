package treeMapMember;

public class TreemapMemberMain {

	public static void main(String[] args) {
		TreeMapMember tmm = new TreeMapMember();
		
		Member m1 = new Member(3,"LSK");
		Member m2 = new Member(1, "LJG");
		Member m3 = new Member(2, "JHW");
		Member m4 = new Member(4, "JYH");
		
		tmm.addMember(m1);
		tmm.addMember(m2);
		tmm.addMember(m3);
		tmm.addMember(m4);
		
		tmm.showAllMember();
		tmm.showAllDescMember();
		
		Member m2_1 = new Member(1, "LPG");
		tmm.addMember(m2_1);
		
		tmm.removeMember(3);
		tmm.removeMember(3);
		tmm.showAllMember();
		
		tmm.removeMember("JHW");
		tmm.showAllMember();
		
		tmm.removeMember(m4);
		tmm.showAllMember();
	}

}
