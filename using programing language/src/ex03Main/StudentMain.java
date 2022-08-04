package ex03Main;

import ex03.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("이순신", 95, 87, 100);
		System.out.println("이름 : " + s1.getName());
		System.out.println("총점 = " + s1.getScore());
		s1.getAvg();
	}

}
