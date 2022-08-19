package object.clone;

import java.util.Arrays;

class Computer{
	String brand;

	public Computer(String brand) {
		super();
		this.brand = brand;
	}
	
}


/*
 * cloneable 구현하지 않고 clone()메서드 호출하면
 * CloneNotSupportedException 예외객체 발생, 복제 실패
 * cloneable 인터페이스를 구현해야 하는 이유>
 * clone() 메서드를 사용하면 객체의 정보(멤버변수 값)가 같은 객체가 하나 더 생성되는 것이므로
 * 객체 지향 프로그램의 정보은닉, 객체 보호의 관점에서 위배될 수 있으므로
 * 객체의 clone()메서드 사용을 허용한다는 의미로 Cloneable 인터페이스를 명시해줌
 */
class Student implements Cloneable{//super : Object
	int studentID;//ID
	String studentName;//Name
	private int[] scores;
	Computer com;
	public Student(int studentID, String studentName, int[] scores, Computer com) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.scores = scores;
		this.com = com;
	}
	
	Student copyStudent() {
		Student cpyStudent = null;
		try {
			cpyStudent = (Student) clone();//Object.clone()호출
		} catch (CloneNotSupportedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return cpyStudent;
	}
	
	void showStudentInfo() {
		System.out.println("Id : " + studentID);
		System.out.println("Name : " + studentName);
		System.out.println("Score : " + Arrays.toString(scores));
		System.out.println("Computer's Brand : " + com.brand);
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
}

public class StudentClone {

	public static void main(String[] args) {
		Student orgStudent = new Student(3,"G.Lee",new int[] {99,93}, new Computer("LG") );
		System.out.println("Original");
		orgStudent.showStudentInfo();
		
		System.out.println();
		
		Student cpyStudent = orgStudent.copyStudent();
		System.out.println("[복제 학생]");
		cpyStudent.showStudentInfo();
		
		System.out.println("--복제 학생 값 변경--");
		cpyStudent.studentID = 2;
		cpyStudent.studentName = "Won";
		cpyStudent.setScores(new int[] {0,0});
		cpyStudent.com.brand = "SamSung";
		
		System.out.println("복제 학생 값 변경 후 원본 학생");
		orgStudent.showStudentInfo();
		System.out.println();
		System.out.println("복제 학생 값 변경 후 복제 학생");
		cpyStudent.showStudentInfo();
	}

}
