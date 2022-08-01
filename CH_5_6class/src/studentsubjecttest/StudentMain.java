package studentsubjecttest;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		
		studentList.add(new Student(0005,"NS5"));
		studentList.get(0).addSubject("Freedom", 85);
		studentList.get(0).addSubject("Physics", 75);
		studentList.get(0).addSubject("Math", 95);
		studentList.get(0).addSubject("Art", 80);
		
		studentList.add(new Student(0001,"NS1"));
		studentList.get(1).addSubject("Freedom", 95);
		studentList.get(1).addSubject("Physics", 65);
		studentList.get(1).addSubject("Math", 99);
		studentList.get(1).addSubject("Art", 50);

		studentList.get(0).showInfo();
		
		
	}

}
