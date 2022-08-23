/*
 * ArrayList	: 배열처럼 선언과 동시에 초기화 불가능하다(기본값이 null로 채워짐)
 * 				  그러나 추가나 삭제를 위한 메서드를 통해 쉽게 해결 가능함
 * 
 * Arrays		: 배열을 조작하기 위한 클래스
 * 				  배열처럼 선언과 동시에 초기화 가능
 * 				  그러나 추가나 삭제를 위한 메서드가 없음
 * 
 * 그래서 배열처럼 선언과 동시에 초기화 되면서
 * ArrayList처럼 추가나 삭제를 위한 메서드를 사용할 수 있도록
 * 아래 소스에서 소개
 */

package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {
	public static void main(String[] args) {
		/*
		 * 1.
		 */
		List<String> list1 = Arrays.asList("Name1","Name2","Name3");
		list1 = new ArrayList<String>(list1);
		for(String temp : list1) {
			System.out.println(temp);
		}
		System.out.println("------------------------------------------------");
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		List<Integer> list3 = Arrays.asList(new Integer(1),new Integer(2),new Integer(3));
		list2 = new ArrayList<Integer>(list2);
		list3 = new ArrayList<Integer>(list3);
		for(Integer temp : list3) {//value 주소
			System.out.println(temp);
		}
		for(int temp : list3) {//value 값
			System.out.println(temp);
		}
	}

}
