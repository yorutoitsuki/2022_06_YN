package localclass2;

interface Readable {
	void read();
}

class Outer {
	
	private String myName;

	Outer(String myName) {
		super();
		this.myName = myName;
	}

	public String getMyName() {
		return myName;
	}
	/*
	 * 로컬 클래스
	 * 1. 메서드가 실행할 때만 사용할 수 있다.
	 * 2. 메서드 내에서만 객체 생성하고 사용해야 한다
	 * 3. 접근 제한자(public, private) 및 static 붙일 수 없음
	 * 	  이유, 메서드 내에서만 사용되므로 접근을 제한할 필요가 없기 때문
	 * 4. A$1E.class(바이트 코드 파일)로 생성됨
	 * 5. 이때 사용되는 지역변수는 final
	 */
	Readable method(int ID) {//주의 : 리턴 타입으로 Local 사용 불가
		class Local implements Readable {

			@Override
			public void read() {
				//외부클래스의 private 멤버에도 접근 가능
				System.out.println("외부 객체 name : " + myName);
				
				//메서드의 매개변수(지역변수) 값 출력
				System.out.println("로컬 객체 ID : " + ID);
			}
			
		}//Local 클래스 끝
		
		return new Local();
	}//method() 끝
	
	
}//Outer 클래스 끝

public class LocalParamClassTest {

	public static void main(String[] args) {
		Outer out1 = new Outer("First");
		Readable local1 = out1.method(111);
		local1.read();
		
		Outer out2 = new Outer("Second");
		Readable local2 = out2.method(222);
		local2.read();

	}

}
