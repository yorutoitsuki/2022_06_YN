/*
 * Map 인터페이스
 * 1. 키와 값으로 구성된 Map.Entry 객체를 생성
 * 2. 키와 값은 모두 객체
 * 3. 키 : 중복x, 값 : 중복 O
 * 4. 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체된다(업데이트??)
 * 
 * HashMap : 싱글쓰레드
 * HashTable : 멀티쓰레드
 * TreeMap
 */

package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//<키, 값>Map 컬랙션 생성
		HashMap<Integer, String> map =  new HashMap<Integer, String>();
		
		//객체 추가
		map.put(new Integer(6), "Hong");
		map.put(3, "Genaral LEE");
		map.put(7, "Kim-gu");
		
		System.out.println("저장된 총 Entry 객체 수 : " + map.size());
		
		//4.만약 기존에 저장된 키와 동일한 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체된다.
		map.put(6, "유관순");
		System.out.println("저장된 총 Entry 객체수 : " + map.size());
		System.out.println("6의 이름 : " + map.get(6));
		System.out.println();
		
		System.out.println("맵의 주소만으로 모든 값들이 출력 가능함");
		System.out.println(map);//{3=Genaral LEE, 6=유관순, 7=Kim-gu}
		
		System.out.println("저장된 전체 객체를 대상으로 키와 값을 얻고 싶을때(4가지)");
		System.out.println("방법 1 keySet을 이용하여 Set으로 변환 후 향상된 for");
		Set<Integer> key =  map.keySet();
		for(int temp : key) {
			System.out.println(temp + " 번의 이름은 " + map.get(temp));
		}
		System.out.println();
		System.out.println("방법 2 Set을 Iterator로 변환하여 while문으로 출력");
		Iterator<Integer> itr = key.iterator();
		while(itr.hasNext()) {
			int temp = itr.next();
			System.out.println(temp + " 번의 이름은 " + map.get(temp));
//			String value = map.get(temp);
//			System.out.println(temp + " 번의 이름은 " + value);
		}
		System.out.println();
		//----------------------------entrySet() -> 향상된 fro, 순회자 Iterator------------------------------------------
		//entrySet()메서드로 '모든 키와 값인 Map.Entry' 얻어 Set객체로 담아
		System.out.println("방법 3 : entrySet() -> 향상된 for문");
		Set<Entry<Integer, String>> EntrySet = map.entrySet();
		for(Entry<Integer, String> entry : EntrySet) {
			System.out.println(entry.getKey() + " 번의 이름은 " + entry.getValue());
		}
		System.out.println();
		System.out.println("방법 4 : entrySet() -> iterator로 변환");
		Iterator<Entry<Integer, String>> itr2 = EntrySet.iterator();
		while(itr2.hasNext()) {
			Entry<Integer, String> entry = itr2.next();
			System.out.println(entry.getKey() + " 번의 이름은 " + entry.getValue());
		}
		
		System.out.println("저장된 전체 객체를 대상으로 삭제하는 방법");
		System.out.println("3번 객체 삭제 후 값을 리턴 : " + map.remove(3));
		map.clear();
		if(map.isEmpty()) {
			System.out.println("모두 삭제되어 비어있음");
		}
		else {
			System.out.println("비어있지 않음");
		}
		
	}

}
