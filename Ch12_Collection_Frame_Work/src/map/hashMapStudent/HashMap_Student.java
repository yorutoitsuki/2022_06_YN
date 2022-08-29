package map.hashMapStudent;

import java.util.HashMap;

public class HashMap_Student {

	public static void main(String[] args) {
		//학생의 점수를 관리하는 HashMap 객체 : <Student 키 : 중복x, Integer 값 : 중복 O>
		HashMap<Student, Integer> studentMap = new HashMap<Student, Integer>();
		
		studentMap.put(new Student(1, "Hong-gill Dong"), 85);
		studentMap.put(new Student(1, "Hong-gill Dong"), 95);
		
		System.out.println("저장된 총 Entry 객체수 : " + studentMap.size());
		System.out.println(studentMap);
		
	}
}
