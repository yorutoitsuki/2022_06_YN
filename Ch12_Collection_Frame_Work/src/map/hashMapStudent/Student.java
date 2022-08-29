package map.hashMapStudent;

import java.util.Objects;

public class Student {
	int studentID;//학번
	String studentName;//이름
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(studentID, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(s.studentID == this.studentID && s.studentName.equals(this.studentName)) {
				return true;
			}
			return false;
		}
		else {
			return false;
		}
	}
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return studentID == other.studentID && Objects.equals(studentName, other.studentName);
//	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}
	
	
}
