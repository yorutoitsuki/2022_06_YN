package set.treeSetMember2;

import java.util.Comparator;

import set.treeSetMember.Member;

public class DescendingMember implements Comparator<Member>{

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
