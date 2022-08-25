/*
 * set 인터페이스 index 사용 안하므로 순서가 없음, 중복 또한 없음 iterator
 * 1. HashSet 클래스 : 저장 순서에 상관없는 출력 결과
 * 					 Set은 index사용 암하므로 저장 순서가 중요하지 않다
 * 그러나
 * 2. LinkedHashSet 클래스 : 저장 순서 유지하는 예외적인 Set 클래스
 * 
 * 3. TreeSet : 이진트리를 기반으로 검색 기능을 강화
 * hashcode
 */

package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Str1");
		set.add("Str2");
		set.add("Str2");
		
		//add 하기 전 hasCode() 먼저, 그다음 equal() 호출
		System.out.println("총 객체수 : " + set.size());
		
		System.out.println("주소만 : " + set);
		//Set에 저장된 객체 얻는법
		for(String temp : set) {
			System.out.println(temp);
		}
		System.out.println();
		//iterator;
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		if(set.remove("Str1")) {
			System.out.println("return true, Str1 has removed");
		}
		else {
			System.out.println("return false, Str1 is not include");
		}
		System.out.println("----remove All----");
		if(set.removeAll(set)) {
			System.out.println("remove All");
		}
		else {
			System.out.println("Can not remove");
		}
	}
	
}
