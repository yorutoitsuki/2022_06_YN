package studentsubject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {
	//1. 멤버변수 : 속성
	private int studentID;
	private String studentName;
	
	/*
	 * 포함 관계, 수강하는 과목들을 처리해주는 멤버변수(클래스 간의 포함관계)
	 */
	
	private ArrayList<Subject> subjectList;
	
	
	//2. 생성자
	public Student(int studentID, String studentName){
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	//3. 기능
	//수강한 과목과 그 점수를 추가하는 메서드
	public void addSubject(String subjectName, int subjectScore) {
		subjectList.add(new Subject(subjectName, subjectScore));
	}
	//학생이 수강하는 과목들의 성적, 총점과 평균 출력하는 메서드
	/*
	 * 문제 : 
	 * 1번 학생 홍길동의 자바 과목 성적은 95점 입니다.
	 * 1번 학생 홍길동의 오라클 과목 성적은 98점 입니다
	 */
	public void showStudentInfo() {
		double totalScore = 0;
		System.out.println(studentID + "번 학생 " + studentName);
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.println(subjectList.get(i).getSubjectName() + " 과목 성적 : " + subjectList.get(i).getSubjectScore());
			totalScore += subjectList.get(i).getSubjectScore();
		}
		BigDecimal totalBig = new BigDecimal(totalScore);
		BigDecimal size = new BigDecimal(subjectList.size());
		double avgScore = totalBig.divide(size, 2, RoundingMode.HALF_UP).doubleValue();
		
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avgScore);
		//System.out.printf("평균 : %.2f" + avgScore);
	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public String toString() {
		return studentID + "번 학생 " + studentName + "\n" + subjectList + totalScore_Avg();
	}
	
	private String totalScore_Avg()	{
		double totalScore = 0;
		for(int i = 0; i < subjectList.size(); i++) {
			totalScore += subjectList.get(i).getSubjectScore();
		}
		BigDecimal totalBig = new BigDecimal(totalScore);
		BigDecimal size = new BigDecimal(subjectList.size());
		double avgScore = totalBig.divide(size, 2, RoundingMode.HALF_UP).doubleValue();
		
		return "\n총점 : " + totalScore + "점\n" + "평균 : " + avgScore + "점\n";
	}
	
	
}
