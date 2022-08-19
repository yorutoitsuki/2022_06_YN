package object;

import java.util.HashSet;
import java.util.Objects;

class Student {//super : Object
	private int studentID;//ID
	private String studentName;//Name
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	/*
	 * s.equals(s1)는
	 * Object의 equals()를 호출함
	 * Object의 equals():
	 */

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student temp = (Student)obj;
			return ((this.studentID == temp.getStudentID())&&
					this.studentName == temp.getStudentName());
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentID,studentName);
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Student s = new Student(1, "KMJ");
		Student s1 = s;
		Student s2 = new Student(1, "KMJ");
		
		if(s==s1) {//주소 비교
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		if(s1==s2) {//주소 비교
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		
		if(s.equals(s1)) {
			System.out.println("값이 같다. 동일한 객체");
		}
		else {
			System.out.println("값이 다르다, 다른 객체");
		}
		
		if(s1.equals(s2)) {
			System.out.println("값이 같다. 동일한 객체");
		}
		else {
			System.out.println("값이 다르다, 다른 객체");
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("s가 참조하는 객체의 실제주소값 : " + System.identityHashCode(s));
		System.out.println("s2가 참조하는 객체의 실제주소값 : " + System.identityHashCode(s2));
		
		System.out.println("s가 참조하는 객체의 hashCode값 : " + s.hashCode());
		System.out.println("s2가 참조하는 객체의 hashCode값 : " + s2.hashCode());
		/*
		 * 	Hash~ 로 시작하는 클래스에 객체를 추가할 때 '같은 객체인지 여부를 판단하는 방법'
		 * 	(예)HashSet, HashMap(key값 : 중복을 허용하지 않음, value : 중복을 허용함) 
		 * 
		 * 	객체를 add(), put() (추가 = 저장)하기 전에
		 * 	1. 반드시 hashCode() 매서드 호출
		 *  1.1 -> 리턴된 hashCode값(정수) 비교 : 같으면
		 *  2. 한번더 같은지 확인하기 위해서 equals()메서드 호출
		 *  ->true이면 같은 객체로 인식하여 -> 추가하지 않고
		 *  ->false이면 다른 객체로 인식하여 -> 추가함 
		 *  1.2 -> 리턴된 hashCode값(정수) 비교 : 다르면
		 *  2.-> 서로 다른 객체로 인식하여 추가함
		 *  
		 *  hashCode값(정수) : 객체의 주소로 만듬
		 *  
		 *  [object]
		 *  -Object의 hashCode() : 객체의 '주소값'으로 해쉬코드 만듦
		 *  -제공 받은 Object의 자식 클래스들(예 : String, Integer 등)의 hashCode() : 재정의(객체의 '실제값'으로 해쉬코드 만듦)
		 *  
		 *  -Objectg의 equals() : 객체의 '주소값' 비교
		 *  -제공 받은 Object의 자식 클래스들(예 : String, Integer 등)의 equal() : 재정의(객체의 '실제값'으로 해쉬코드 만듦)
		 *  
		 *  그러나, 우리가 만든 '사용자 정의 클래스'는 Object의 hashCode()와 equals()를 반드시 재정의해서 사용해야 함
		 *  (예 : Set인터페이스를 구현한 클래스(HashSet)를 사용하려면 재정의해야함)
		 */
		HashSet<Student> hset = new HashSet<>();
		hset.add(new Student(1, "KMJ"));
		hset.add(new Student(1, "KMJ"));
		
		System.out.println("저장된 객체 수 : " + hset.size());
		
		HashSet<String> hset2 = new HashSet<>();
		hset2.add(new String("KMJ"));
		hset2.add(new String("KMJ"));
		
		System.out.println("저장된 객체 수 : " + hset.size());
		
		
		
		
	}

}
