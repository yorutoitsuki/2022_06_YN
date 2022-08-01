package studentsubject;

public class Subject {//과목
	private String subjectName;//과목명
	private int subjectScore;//과목성적
	public Subject(String subjectName, int subjectScore) {
		super();
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
		return subjectName + " 과목 : " + subjectScore;
	}
	
	
}
