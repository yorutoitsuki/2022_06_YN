package runtime.divide;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			System.out.println("나눗셈 결과의 몫 : " + (num1/num2));
			System.out.println("나눗셈 결과의 나머지 : " + (num1%num2));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} finally {
			System.out.println("try{영역}에 진입하면 예외발생유무에 관계없이 무조건 처리");
		}
		/*
		 * ArithmeticException은 RuntimeException(실행 오류 예외)의 자식클래스로
		 * 프로그래머의 실수로 발생하는 예외 이므로
		 * try~catch() 로 처리하는 방법보다 실수를 수정하는 방법으로 해결하는 것이 더 좋다.
		 * =>DivideByZero.java
		 */
		System.out.println("두 개의 실수 입력 > ");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		
		System.out.println("나눗셈 결과의 몫 : " + (num3/num4));//Infinity
		System.out.println("나눗셈 결과의 나머지 : " + (num3%num4));//NaN, Not a Number
		
		double result1 = num3/num4;
		double result2 = num3%num4;
		//Infinity나 NaN의 값은 더 이상 연산을 진행하면 안되므로 아래와 같은 절차를 거친다.
		if(Double.isFinite(result1) || Double.isNaN(result1)) {
			System.out.println("연산 결과값으로 불가합니다");
		}else {
			System.out.println(result1 + 10000);
		}
		
		if(Double.isFinite(result2) || Double.isNaN(result2)) {
			System.out.println("연산 결과값으로 불가합니다");
		}else {
			System.out.println(result2 + 10000);
		}
		
		sc.close();
	}

}
