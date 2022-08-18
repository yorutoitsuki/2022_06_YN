package interface_abstract_inherit;
//추상클래스가 된 이유? 인터페이스 Calc의 추상메서드를 모두 재정의 하지 않아서
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO 자동 생성된 메소드 스텁
		return num1 - num2;
	}
	
}
