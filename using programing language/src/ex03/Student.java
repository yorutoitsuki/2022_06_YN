package ex03;

public class Student {
	//1.멤버변수
	private String name;
	private int gukScore;
	private int engScore;
	private int mathScore;
	
	public Student(String name, int gukScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.gukScore = gukScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	//기능 : 국어, 영어, 수학의 점수를 모두 더해서 그 결과를 반환한다.
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		int result = gukScore + engScore + mathScore;
		return result;
	}
	
	//기능 : 총점(국어, 영어, 수학)을 과목수로 나눈 평균을 구한다
	
	public void getAvg() {
		double avg = (gukScore + engScore + mathScore)/3;
		System.out.println("평균 = " + avg);
	}
	
	public void showInfo() {
		int result = gukScore + engScore + mathScore;
		double avg = ((double)result)/3;
		System.out.println("이름 : " + this.name);
		System.out.println("총 점수 : " + result);
		System.out.println("평균 : " + avg);
	}
}
