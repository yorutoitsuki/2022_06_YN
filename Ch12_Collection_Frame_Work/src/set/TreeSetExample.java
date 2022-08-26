/*
 * [HashSet과 TreeSet]
 * 공통점 : Set계통 이므로 모두 종복을 혀용하지 않고 순서가 없는 컬렉션이다.
 * 
 * 구현방식 -HashSet : '해싱'을 이용하여 구현
 * 					TreeSet : 이진 탐색트리를 이용하여 구현
 * 
 * 속도 비교 -HashSet 가 TreeSet 보다 빠름
 * 해싱값을 이용하여 검색하기 때문에 검색하는 범위가 엄청 줄어들게 되어검색 속도가 매우 빠르다
 * (HashSet은 Set계통에서 가장 빠른 데이터 접근 속도를 가지고 있다.
 * 
 * 정렬기능 TreeSet이 hashSet보다 빠름
 * 이진 탐색 트리를 이용했기 때문에 데이터 정렬이 가능(Comparable 인터페이스 이용)
 */

package set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(new Integer(87));
		treeSet.add(95);
		treeSet.add(78);
		treeSet.add(98);
		treeSet.add(80);
		treeSet.add(83);
		
		treeSet.add(78);
		
		System.out.println("저장된 총 객체 수 : " + treeSet.size());
		
		System.out.println("주소만 오름차순 정렬 : " + treeSet);
		System.out.println("주소만 오름차순 정렬 : " + treeSet.descendingSet());
		//-------------------------------------------------------------------
		System.out.println("검색과 관련된 메서드들");
		System.out.println("가장 낮은 객체 리턴(가장 낮은 점수) : " + treeSet.first());
		System.out.println("가장 낮은 객체 리턴(가장 높은 점수) : " + treeSet.last());
		
		System.out.println("주어진 객체 95보다 바로 아래 작은 객체 리턴 : " + treeSet.lower(95));
		System.out.println("주어진 객체 95보다 바로 위 큰 객체 리턴 : " + treeSet.higher(95));
		
		System.out.println("주어진 객체 96과 같은 객체가 있으면 리턴, 만약 없으면 주어진 객체 96보다 바로 아래 작은 객체 리턴 : " + treeSet.floor(96));
		System.out.println("주어진 객체 94과 같은 객체가 있으면 리턴, 만약 없으면 주어진 객체 96보다 바로 위 큰 객체 리턴 : " + treeSet.ceiling(96));
		
		System.out.println("범위 검색과 관련된 메서드");
		SortedSet<Integer> treeSetSub1 = treeSet.subSet(78, 95);
		System.out.println("78 <= 찾는 점수 < 95");
		for(Integer temp : treeSetSub1) {
			System.out.print(temp + " ");
		}
		System.out.println();
		//범위지정(78, true(이상)false(초과),95,true(이하)false(미만))
		NavigableSet<Integer> treeSetSub2 = treeSet.subSet(78, true, 95, true);
		for(Integer i:treeSetSub2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("오름차순 Iterator 리턴");
		Iterator<Integer> itr =  treeSet.iterator();//오름차순 반복자
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		itr = treeSet.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("내림 차순으로 정렬된");
		NavigableSet<Integer> dSet = treeSet.descendingSet();
		System.out.println("향상된 For문 이용");
		for(Integer temp : dSet) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("Iterator 반복자(순회자) 이용");
		Iterator<Integer> dSetItr = dSet.iterator();
		while(dSetItr.hasNext()) {
			System.out.print(dSetItr.next() + " ");
		}
		System.out.println();
		System.out.println("내림차순 정렬된 NavigableSet을 descendingSet()으로 한번 더 호출하면 오름차순 정렬됨");
		NavigableSet<Integer> aSet = dSet.descendingSet();
		System.out.println("향상된 For문 이용");
		for(Integer temp : aSet) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("Iterator 반복자(순회자) 이용");
		Iterator<Integer> aSetItr = aSet.iterator();
		while(aSetItr.hasNext()) {
			System.out.print(aSetItr.next() + " ");
		}
//		System.out.println();
//		System.out.println("제일 낮은 객체부터 꺼내오고 제거한 순서 : ");
//		while(!treeSet.isEmpty()) {
//			System.out.print(treeSet.pollFirst() + " ");//제일 낮은 객체부터 꺼내옴
//		}
//		System.out.println();
//		if(treeSet.isEmpty()) {
//			System.out.println("모두 삭제 되어 있음");
//		}
//		else {
//			System.out.println("비어있지 않음");
//		}
		System.out.println();
		System.out.println("제일 높은 객체부터 꺼내오고 제거한 순서 : ");
		while(!treeSet.isEmpty()) {
			System.out.print(treeSet.pollLast() + " ");//제일 높은 객체부터 꺼내옴
		}
		System.out.println();
		if(treeSet.isEmpty()) {
			System.out.println("모두 삭제 되어 있음");
		}
		else {
			System.out.println("비어있지 않음");
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		TreeSet<String> treeSet2 = new TreeSet<String>();
		treeSet2.add("banana");
		treeSet2.add("cherry");
		treeSet2.add("apple");
		treeSet2.add("black");
		treeSet2.add("school");
		treeSet2.add("door");
		treeSet2.add("element");
		
		System.out.println(treeSet2);
		System.out.println("b~e 사이의 단어 검색 : ");
		//주의 단 끝 개체는 제외됨, e% 은 e보다 더 큰 숫자 if(i <= e || l <= e.length)
		NavigableSet<String> nav3 = treeSet2.subSet("b", true, "e", true);
		for(String temp : nav3) {//element 제외됨
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("지정된 객체보다 작은 값의 객체들을 반환");
		SortedSet<String> sSet2 = treeSet2.headSet("banana");
		System.out.println(sSet2);
		
		System.out.println("지정된 객체보다 작은 값의 객체들을 반환");
		SortedSet<String> sSet3 = treeSet2.headSet("banana", false);
		System.out.println(sSet3);
		
		System.out.println("지정된 객체를 포함하여 작은 값의 객체들을 반환");
		SortedSet<String> sSet4 = treeSet2.headSet("banana", true);
		System.out.println(sSet4);
		
		System.out.println("지정된 객체보다 큰 값의 객체들을 반환");
		SortedSet<String> sSet5 = treeSet2.headSet("ba");
		System.out.println(sSet5);
		
		System.out.println("지정된 객체보다 큰 값의 객체들을 반환");
		SortedSet<String> sSet6 = treeSet2.headSet("banana", false);
		System.out.println(sSet6);
		
		System.out.println("지정된 객체를 포함하여 큰 값의 객체들을 반환");
		SortedSet<String> sSet7 = treeSet2.headSet("banana", true);
		System.out.println(sSet7);
	}

}
