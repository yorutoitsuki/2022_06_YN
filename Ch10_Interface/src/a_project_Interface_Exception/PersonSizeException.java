package a_project_Interface_Exception;
/*
 * 예외 클래스 만드는 방법
 */

//반드시 Exception을 부모로 상속 받는다
public class PersonSizeException extends Exception{
	//2. 멤버 변수 추가(=>옵션)
	
	//3.생성자
	public PersonSizeException() {
		super("\n****관리 범위를 초과합니다****\n");
	}
	
	//4.메서드 추가(=>옵션)
}
