
/*
 * Object의 clone 메서드
 * 1. 얕은 복제 : 멤버변수(=필드)만 복제
 * 1-1. 기본타입(int, double, char, boolean....) : 값을 복사
 * 1-2. 클래스타입(String, Integer..객체의 주소) : 객체의 주소 복사
 * 
 * 2. 얕은 복제의 문제점
 * 복제 객체에서 참조변수가 참조하는 객체의 값 또는 주소를 변경하면
 * 원본 객체도 참조 변수가 참조하는 객체의 값 또는 주소도 함께 변경
 * (단, String은 제외됨)
 */



package clone;

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
	private int[] scores; //깊은 복제 대상
	Computer com; //깊은 복제 대상
	public Student(int studentID, String studentName, int[] scores, Computer com) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.scores = scores;
		this.com = com;
	}
	
	
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		//1. 먼저 얕은 복제로 객체를 통째로 복사
		Student cpyStudent = (Student) super.clone();
		
		//2. 깊은 복제의 대상이 되는 객체들을 복제한다
		//배열복제, Computer 객체 복제
		cpyStudent.scores = Arrays.copyOf(scores, scores.length);
		cpyStudent.com = new Computer(this.com.brand);
		return cpyStudent;
	}



	Student copyStudent() {
		Student cpyStudent = null;
		try {
			cpyStudent = clone();//Object.clone()호출
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

	public static void main(String[] args) throws CloneNotSupportedException {
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
