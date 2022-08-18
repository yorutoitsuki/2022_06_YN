package interface_abstract_inherit;

public interface Calc {
	final double PI = 3.14;
	final int ERROR = -99999999;
	
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
	
	//추상메서드 아닌 예외 : 완성된 메서드
	//static 메서드 : 공유용 => 재정의 불가
	static int hap(int[] arr) {
		int hap = 0;
		for(int value:arr) {
			hap += value;
		}
		return hap;
	}
	
	//default 필요시 재정의
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
	
	//private 메서드 : 해당 인터페이스 안에서만 사용가능 (1.9 버전 이상에서만 가능)
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
}
