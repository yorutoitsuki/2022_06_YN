package interface_abstract_inherit;

public class CompleteCalc extends Calculator{

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double div(int num1, int num2) {
		if(num2 != 0) {
			return ((double)num1) / num2;
		}else {
			return ERROR;
		}
	}
	
	//추가
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현함");
	}

	@Override
	public void description() {
		System.out.println("계산기를 구현합니다");
	}
	
	

}
