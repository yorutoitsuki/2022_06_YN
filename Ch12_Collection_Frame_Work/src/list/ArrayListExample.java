/*
 * 컬렉션 프레임워크 : 배열의 문제점을 해결하고 널리 알려진 자료구조를 바탕으로
 * 					객체들을 효율적으로 추가, 삭제, 검색 할 수 있도록
 * 					java.util 패키지에 컬렉션과 관련된 인터페이스와 클래스들을 포함시켜 놓고
 * 					이들을 총칭해서 '프레임 워크' 라고 부름
 * 					(반드시 객체만 관리)
 * 					
 * 	Collection 인터페이스
 *       |--------------------------------------|
 *       |										|
 *       |										|	
 * 	List 인터페이스----------------------------Set인터페이스                      Map인터페이스(독립)
 * 		|										|									|
 * 배열과 유사하여 index로 관리					index로 관리하지 않음				키와 값의 쌍(=엔트리)으로 저장
 * ->순서를 유지하면서 저장						->순서 없이 저장					키와 값 : 객체
 * 	중복저장 가능								(iterator(순회자) 사용)			키 : 중복X, 값:중복 허용
 * 		|									중복 저장 불가능							|
 * 	클래스										|							HashMap : 싱글쓰레드
 * 	ArrayList								클래스							HashTable : 멀티쓰레드
 * 	Vector									HashSet							TreeMap
 * 	LinkedList								TreeSet
 * 
 * List 인터페이스를 구현한 클래스
 * <공통점> 1. 배열과 유사하여 index로 관리 -> 순서를 유지하면서 저장
 * 			=>for문 사용가능
 * 			2. 중복 저장 가능
 * 1.ArrayList : (1) 앞에서 부터 차례대로 추가나 검색할 때 효율적
 * 				 (2) 중간에 추가나 삭제가 빈번히 일어나는 곳에서는 비효율적 ->속도가 느리다.
 * 				 '싱글 스레드'
 * 
 * 2.Vector : (1)(2)ArrayList와 특징이 같다.(단,'멀티 쓰레드'에 사용)
 * 
 * 3.LinkedList : (1) 앞에서 부터 검색할 때 비효율적
 * 				  (2) 중간에 추가나 삭제가 빈번히 일어나는 곳에서는 효율적 -> 속도가 빠르다
 * 
 */

package list;
import java.util.List;
import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		/*
		 * 부모 인터페이스 = 자식객체가 부모타입(List)으로 자동 형변환 되어 대입
		 * 컴파일러 입장 : 모든 자식객체들을 부모타입인 List로 인식하여
		 * 				List에 선언된 추상메서들만 호출할 수 있다.
		 * 
		 * 그런데 자식 클래스들을 클래스의 특징에 맞게 추상메서드를 재정의하였으므로
		 * 재정의 된 메서드가 호출됨
		 */
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>();
		
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("----추가 후 값을 얻기----");
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		
		list.add(1, "String 4 to 1");
		list.add("String 1");//중복허용
		
		System.out.println("저장된 총 객체 수 : " + list.size());
		
		if(list.contains("String 1")) {//주어진 객체가 저장되어 있으면 true, 없으면 false
			System.out.println("\"String 1\" is exist");
		}
		System.out.println();
		System.out.println("index 2의 값 : " + list.get(2));
		
		System.out.println("List객체의 주소만");
		System.out.println(list);//list.toString()호출 -> 각 객체(ArrayList, Vector)에서 재정의된 toString()호출
		System.out.println();
		
		System.out.println("--for문으로 모든 객체 값 출력--");
		for(int i = 0; i < list.size(); i++) {//=>Set 계통에는 이 for문 사용 못함(index로 관리하므로...)
			System.out.println("index " + i + "의 값 : " + list.get(i));
		}
		System.out.println();
		/*
		 * 향상된 for문 : index로 값을 접근하지 않으므로 값을 참조할 때만 사용함
		 * 				값을 변경할 때는 사용불가(이유? 값을 변경하려면 index로 접근해야 하기 때문)
		 */
		System.out.println("향상된 for문으로 출력");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("delete");
		System.out.println("function 1 using index");
		System.out.println("index 1에 저장 후 삭제한 문자열 : " + list.remove(1));
		
		System.out.println("--삭제2(Object 이용)--");
		if(list.remove("String 2")) {
			System.out.println("찾아서 있으면 삭제후 true -> 삭제 됨");
		}
		else {
			System.out.println("찾아서 없으면 false -> 삭제 안되");
		}
		System.out.println();
		if(list.remove("String 2")) {
			System.out.println("찾아서 있으면 삭제후 true -> 삭제 됨");
		}
		else {
			System.out.println("찾아서 없으면 false -> 삭제 안됨");
		}
		System.out.println("모두 삭제");
		if(list.removeAll(list)) {
			System.out.println("모두 삭제");
		}
		
	}

}
