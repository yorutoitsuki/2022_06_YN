package nestedClass;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		System.out.println();
		
		/*
		 * 1. 멤버 클래스
		 * 
		 * 1-1. 인스턴스 멤버 클래스
		 * 외부 클래스 객체 생성 후 -> 인스턴스 멤버 클래스 객체 생성 가능
		 */
		A.B b = a.new B();
//		A.B b = a.new A.B();//오류, static이 아니라서 오류가 발생
		b.field1 = 6;
		b.method1();
		System.out.println();
		
		/*
		 *  1-2. 정적 멤버(Nested) 클래스
		 *  외부 클래스 객체 생성하지 않고 -> 정적 맴버 클래스 객체 생성 가능
		 *  외부.내부 참조변수 = new 외부.내부();
		 */
		A.C c = new A.C();
		
		c.field1 = 7;
		
		c.field2 = 8;//경고
		A.C.field2 = 8;//권장
		
		c.method1();
		
		c.method2();
		A.C.method2();
		
		System.out.println();
		/*
		 *  1-2. private '정적' 멤버 클래스
		 *  
		 *  외부에서 private 정적 멤버 클래스 객체 생성 불가능
		 */
//		A.D d = new A.D();//에러
		
		/*
		 *  2. 로컬 클래스
		 *  로컬 클래스 객체 생성을 위한 메서드 호출
		 *  
		 */
		a.method();
	}

}
