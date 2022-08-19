package object;

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
	}

}
