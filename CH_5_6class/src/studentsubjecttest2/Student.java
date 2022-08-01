package studentsubjecttest2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {
	//1. 멤버변수(=field) : 속성
		//학생ID
		//학생이름
		private int studentID;
		private String studentName;
		//★★ 수강하는 과목들을 처리해주는 멤버변수(클래스 간의 포함관계)
		ArrayList<Subject> subject;
		
		
		//2. 생성자
		Student(int studentID, String studentName){
			this.studentID = studentID;
			this.studentName = studentName;
			subject = new ArrayList<Subject>();
		}
		
		@Override
		public String toString() {
			return studentID + "번 학생 " + studentName + "\n" + subject + totalScore_Avg();
		}
		
		private String totalScore_Avg()	{
			double totalScore = 0;
			for(int i = 0; i < subject.size(); i++) {
				totalScore += subject.get(i).getSubjectScore();
			}
			BigDecimal totalBig = new BigDecimal(totalScore);
			BigDecimal size = new BigDecimal(subject.size());
			double avgScore = totalBig.divide(size, 2, RoundingMode.HALF_UP).doubleValue();
			
			return "\n총점 : " + totalScore + "점\n" + "평균 : " + avgScore + "점\n";
		}

		//3. 메서드(=소문자로시작~()) : 기능
		//학생이 수강하는 과목과 그 해당 점수를 추가하는 메서드
		public void addSubject(String subjectName, int subjectScore) {
			subject.add(new Subject(subjectName, subjectScore));
		}
		
		public void showInfo() {
			int total = 0;
			System.out.println(studentID + " 번 학생" + studentName);
			for(Subject temp : subject) {
				System.out.println(temp.toString());
				temp.getSubjectScore();
				total += temp.getSubjectScore();
			}
			System.out.println("총 점수 : " + total);
			System.out.println("평균 : " + (total/subject.size()));
		}
		
		/* 학생이 수강하는 과목들의 성적, 총점과 평균 출력하는 메서드
		 * ------------------
		 *  < 1번 학생 홍길동 > 
		 * 자바 과목 성적 : 95점
		 * 오라클 과목 성적 : 98점
		 * -------------------	
		 * 총점 : 193점
		 * 평균 : 96.5점
		 * -------------------
		 */
		public void showStudentInfo(){
			
		}
}
