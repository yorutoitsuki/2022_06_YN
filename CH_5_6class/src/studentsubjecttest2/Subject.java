package studentsubjecttest2;

public class Subject {
	//1. 멤버변수(=field) : 속성- 정보보안 : private
		// 과목명
		 // 과목성적
	private String subjectName;
	private int subjectScore;

		//2.생성자
	
	Subject(String subjectName, int subjectScore){
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getSubjectScore() {
		return subjectScore;
	}

	@Override
	public String toString() {
		return "과목 : " + subjectName + " - 점수 : " + subjectScore;
	}

	               //3. 메서드
		// 외부에서 접근가능한 메서드를 통해 private 멤버변수에 간접접근
	
}
