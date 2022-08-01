package studentsubjecttest2;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * Student를 각각 생성하여 처리
		 */
		Student s1 = new Student(1001,"hong");
		s1.addSubject("JAVA", 95);
		s1.addSubject("Oracle", 98);
		
		Student s2 = new Student(1002,"G.Lee");
		s2.addSubject("JAVA", 90);
		s2.addSubject("JSP", 88);
		s2.addSubject("HTML", 99);
		
//		s1.showStudentInfo();
//		System.out.println();
//		s2.showStudentInfo();
		
		//-----ArrayList로 Student 처리-------------------------------------------------------------------------
		ArrayList<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s1);
		StudentList.add(s2);
		
//		for(Student student : StudentList) {
//			student.showStudentInfo();
//		}
		System.out.println("-----------------------------------");
		
		for(Student student : StudentList) {
			System.out.println(student);
		}
		
		
		
		
	}

}
