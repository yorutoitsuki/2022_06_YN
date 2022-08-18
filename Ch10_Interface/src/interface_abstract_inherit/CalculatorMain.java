package interface_abstract_inherit;

public class CalculatorMain {

	public static void main(String[] args) {
		CompleteCalc comploeteCalc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("10+3=" + comploeteCalc.add(num1, num2));
		System.out.println("10-3=" + comploeteCalc.sub(num1, num2));
		System.out.println("10*3=" + comploeteCalc.mul(num1, num2));
		System.out.println("10/3=" + comploeteCalc.div(num1, num2));
		
		comploeteCalc.showInfo();
		/*
		 * 부모 인터페이스 = 자식객체;
		 */
		
		Calc calc = comploeteCalc;
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.hap(arr));
		//주의 부모 인터페이스의 static 멤버
	}

}
