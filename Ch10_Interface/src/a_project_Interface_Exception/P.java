/*
 * 인터페이스 : 클라이언트 프로그램에 '어떤 메서드를 제공하는지' 미리 알려주는 명세 또는 약속
 */

/*
 * 추상 클래스의 인터페이스의 공통점
 * 1. 자손에서 반드시 재정의해야 할 '미완성된 추상 메서드가 존재' 자손에서 재정의 안하면 오류
 * 2. 객체 생성 불가 : 미완성이므로
 * 3. 부모 역할은 가능(UpCasting)
 * 
 * -인터페이스의 예
 * void method(P p) { P 인터페이스를 구현한 PI객체 ->자동으로 P로 형변환되어 받아들임 }
 * 
 * P p = new PI(); //PI:P인터페이스를 구현한 클래스
 * 
 * [추상 클래스만의 특징]
 * 1. 여러 메서드 중 단 1개라도 미완성 된 추상 메서드가 있으면 이 클래스는 추상 클래스가 된다.
 * 
 * [인터페이스만의 특징]
 * 1. 모든 멤버변수가 '상수'
 *  int A = 1;//public static final 이 생략되어 있음
 * 	public static final int A = 1
 * 접근방법 : 인터페이스명.멤버변수명 (예)P.A
 * 
 * 2. 모든 메서드가 미완성된 추상 메서드 : 인터페이스를 구현하는 자손 클래스에서 반드시 재정의
 * void a();//public abstract 생략되어 있음
 * public abstract void a();
 * 
 * 예외1 : static 매서드() - 자체로 완성된 메서드로 "바로 메모리에 올라감". "클래스 생성과 무관하게 사용
 * 		=> 구현한 자손 클래스에서 재정의X (공유용)
 * 		(예) static void 이름표시(){"핸드폰" 출력}
 * 		구현한 100개의 자손 클래스는 재정의 안하고 그냥 '인터페이스이름 접근'
 * 
 * 예외2 : default 매서드() {} - 자체로 완성된 메서드
 * 		=> 구현한 자손 클래스에서 필요하면 재정의하여 사용하면 됨
 * 		(예-1) default void 접는기능() {}
 * 		구현한 100개의 자손 클래스 중 필요한 클래스만 재정의 하면 됨
 * 		
 * 		(예-2) default void 전화를 받는 기능() {"사람이 전화를 받는다."}
 * 		구현한 100개의 자손 클래스 중 99개는 이 기능을 그대로 사용하지만
 * 		1개 클래스는 자기 클래스에 맞게 재정의 할 수 있다.
 * 			(예)default void 전화를 받는 기능() {"AI가 전화를 받는다."}
 * 예외3 : private 매서드() ('JDK1-9 = 자바9' 부터 사용가능)
 * 		- 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
 * 		=> 구현한 자손 클래스에서 사용X 재정의X
 */

/*
 * 홍 대표가
 * a회사에 2개의 매서드를 완성해달라고 의뢰
 * '인터페이스'에 담아서 의뢰
 */

package a_project_Interface_Exception;

public interface P {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
	
	//1. 이름과 주민등록번호(반드시), 전화번호와 주소(옵션)를 입력
	void input() throws PersonSizeException;
	//void input() throws PersonSizeException;//public abstract 생략
	//메서드 오버라이딩(재정의 규칙 3)예외는 부모 클래스 메서드의 예외보다 더 많이 선언할 수 없다.
	
	//2. 주민등록번호를 기반으로 고객의 이름이나 정보를 검색
	void search();//public abstract 생략
	
	void delete();
}





















