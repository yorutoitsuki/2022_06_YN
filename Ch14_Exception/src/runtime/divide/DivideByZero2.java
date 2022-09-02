	/*
	 * ArithmeticException은 RuntimeException(실행 오류 예외)의 자식클래스로
	 * 프로그래머의 실수로 발생하는 예외 이므로
	 * try~catch() 로 처리하는 방법보다 실수를 수정하는 방법으로 해결하는 것이 더 좋다.
	 * =>DivideByZero.java
	 */

package runtime.divide;

import java.util.Scanner;

public class DivideByZero2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 정수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		boolean divOK = divider(num1, num2);
		if(divOK) {
			System.out.println("나누기 연산 성공");
		}
		else {
			System.out.println("나누기 연산 실패");
		}
		
		double result = divider2(num1, num2);
		if(result != -1) {
			result += 100;
		}
		System.out.println("나눗셈 결과는 " + result);

		sc.close();
	}
	//두 수를 나누는 divider() 메서드 설계 - 2가지 방법
	static boolean divider(int num1,int num2) {
		if(num2 != 0) {
			System.out.println("나눗셈 결과는 " + (double)num1/num2);
			return true;
		}
		else {
			System.out.println("0으로 나눌 수 없습니다");
			return false;
		}
	}
	
	static double divider2(int num1,int num2) {
		if(num2 != 0) {
			//System.out.println("나눗셈 결과는 " + (double)num1/num2);
			return (double)num1/num2;
		}
		else {
			System.out.println("0으로 나눌 수 없습니다");
			return -1;
		}
	}

}
