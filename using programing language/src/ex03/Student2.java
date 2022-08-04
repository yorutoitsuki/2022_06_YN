package ex03;

import java.util.ArrayList;

class subject{
	private String subjectName;
	private int subScore;
	subject(String name, int score){
		this.subjectName = name;
		this.subScore = score;
	}
	String getName() {
		return subjectName;
	}
	int getScore() {
		return subScore;
	}
}

public class Student2 {
	//1.멤버변수
	private String name;
	private ArrayList<subject> subjectList;
	
	public Student2(String name) {
		super();
		this.name = name;
		subjectList = new ArrayList<subject>();
	}
	public void addSubject(String name, int score) {
		subjectList.add(new subject(name, score));
	}
	
	//기능 : 국어, 영어, 수학의 점수를 모두 더해서 그 결과를 반환한다.
	public int getScore() {
		int result = 0;
		for(subject temp : subjectList) {
			result += temp.getScore();
		}
		return result;
	}
	
	public String getName() {
		return this.name;
	}
	
	//기능 : 총점(국어, 영어, 수학)을 과목수로 나눈 평균을 구한다
	
	public void getAvg() {
		double avg = getScore()/subjectList.size();
		System.out.println("평균 : " + avg);
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("총 점수 : " + getScore());
		getAvg();
	}
}
