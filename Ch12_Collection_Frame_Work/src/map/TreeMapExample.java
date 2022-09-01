package map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(new Integer(89), "이순신");
		treeMap.put(95, "홍길동");
		treeMap.put(78, "김유신");
		treeMap.put(98, "유관순");
		treeMap.put(80, "김구");
		treeMap.put(83, "강감찬");
		System.out.println("저장된 총 Entry 객체 수 : " + treeMap.size());
		treeMap.put(78, "유재석");
		System.out.println(treeMap);//같은 키 : "김유신" -> "유재석"
		System.out.println("저장된 총 Entry 객체 수 : " + treeMap.size());
		
		System.out.println(treeMap);
		System.out.println("-------------------------------------");
		System.out.println("검색과 관련된 메서드");
		Integer firstKey = treeMap.firstKey();
		System.out.println("가장 낮은객체 리턴 " + treeMap.firstKey() + ", " + treeMap.get(firstKey));
		System.out.println("가장 낮은객체 리턴 " + treeMap.firstEntry().getKey() + ", " + treeMap.firstEntry().getValue());
		Entry<Integer,String> firstEntry = treeMap.firstEntry(); 
		System.out.println("가장 낮은객체 리턴 " + firstEntry.getKey() + ", " + firstEntry.getValue());
		System.out.println("가장 높은 객체 리턴 " + treeMap.lastKey() + ", " + treeMap.lastEntry());
		
		Entry<Integer, String> lowerEntry = treeMap.lowerEntry(95);
		System.out.println("주어진 key객체 95 보다 바로 아래 (오름차순,크거 나 내림차순,작은)Entry객체 리턴(=95점 바로 아래 점수와 이름) " + lowerEntry);
		Entry<Integer,String> higherEntry = treeMap.higherEntry(95);
		System.out.println("주어진 key객체 95 보다 바로 위 (오름차순,작거 나 내림차순,큰)Entry객체 리턴(=95점 바로 위 점수와 이름) " + higherEntry);
		
		Entry<Integer, String> floorEntry = treeMap.floorEntry(96);
		System.out.println("주어진 key 객체인 96과 같은 key 객체가 있으면 해당 Entry 객체를 리턴, 없으면 바로 아래의 객체 리턴 " + floorEntry);
		
		Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(96);
		System.out.println("주어진 key 객체인 96과 같은 key 객체가 있으면 해당 Entry 객체를 리턴, 없으면 바로 위의 객체 리턴 " + ceilingEntry);
		
		System.out.println("범위 검색과 관련된 메서드들");
		/*
		 * SortedMap<Integer,String> subMap(k fromKey, k toKey)
		 * 									시작키(포함)~끝(포함x) 이전까지의 부분집합 반환
		 * 
		 * NaviableMap<k,V> subMap(K fromKey, boolean fromInclusive, k ToKey, boolean toInclusive)
		 * 							시작 키,  시작키 포함 여부, 마지막 키, 마지막키 포함 여부
		 */
		SortedMap<Integer, String> treeMapSub1 =  treeMap.subMap(78, 95);
		System.out.println("78 <= 찾는 점수 < 95");
		Set<Entry<Integer, String>> set1 = treeMapSub1.entrySet();
		System.out.println(set1);
		System.out.println("Iterator 사용");
		System.out.print("[ ");
		Iterator<Entry<Integer, String>> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println(" ]");
		System.out.println("향상된 for문");
		System.out.print("[ ");
		for(Entry<Integer, String> entry : set1) {
			System.out.print(entry + " ");
		}
		System.out.println(" ]");
		
		NavigableMap<Integer, String> treeMapSub2 = treeMap.subMap(78, true, 95,true);
		System.out.println("78 <= 찾는 점수 =< 95");
		Set<Entry<Integer, String>> set2 = treeMapSub2.entrySet();
		System.out.println(set2);
		System.out.println("Iterator 사용");
		System.out.print("[ ");
		Iterator<Entry<Integer, String>> itr2 = set2.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		System.out.println(" ]");
		System.out.println("향상된 for문");
		System.out.print("[ ");
		for(Entry<Integer, String> entry : set2) {
			System.out.print(entry + " ");
		}
		System.out.println(" ]");
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("key가 오름차순으로 정렬된 NavigableSet을 리턴 -> 내림차순");
		NavigableSet<Integer> descSet = treeMap.descendingKeySet();
		Iterator<Integer> itr3 = descSet.iterator();
		while(itr3.hasNext()) {
			int key = itr3.next();
			System.out.print(key + " = " + treeMap.get(key));
			if(itr3.hasNext()) {
				//Iterator(순회자)이용시 hasNext를 이용하여
				//남은 값이 있으면 쉼표를 출력, 없으면 넘어가도록 하면 됩니다
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.println("Entry가 내림차순으로 정렬된 NavigableMap을 리턴 -> 내림차순");
		NavigableMap<Integer, String> descMap = treeMap.descendingMap();
		System.out.println(descMap);
		Set<Entry<Integer, String>> eSet = descMap.entrySet();
		for(Entry<Integer, String> entry : eSet) {
			System.out.print(entry.getKey() + "=" + entry.getValue());
			if(entry.getKey() != descMap.lastKey()) {
				//향상된 for문에서 가져온 Key값이 내림차순 정렬된 Map의 마지막 key값과 비교해서
				//같지 않으면 쉼표를 추가, 같으면 마지막 값이라는 뜻이므로 쉼표 추가 하지 아니함
				System.out.print(", ");
			}
		}
		
		
		
		
	}
}
