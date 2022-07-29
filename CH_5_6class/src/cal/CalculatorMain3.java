package cal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain3 {

	public static void main(String[] args) {
		
		//잘못된 방법
//		Add a = new Add();
//		Sub s = new Sub();
//		Mul m = new Mul();
//		Div d = new Div();
//		
//		new Calculator(a, s, m, d);
		
		
		
		
		/*
		 * 스캐너 객체 생성하여 두 수와 연산자를 입력받아 결과 출력
		 * ->반복 -> stop을 입력 받으면 계산 종료
		 * 실행 횟수출력 + 총 실행횟수도 출력
		 */
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		String temp;
		String opr;
		
		cal:while(true) {
			
//------------------------1st num part--------------------------------------------			
//			while(true) {
//				try {
//					System.out.println("첫번째 숫자를 입력해주세요, 0 입력시 계산 종료");
//					n1 = sc.nextDouble();
//					if(n1 == 0) {
//						break cal;
//					}
//					break;
//				} catch (InputMismatchException e) {
//					System.out.println("실수를 입력해주세요");
//					sc.nextLine();
//				}
//			}
			
			
			while (true) {
				System.out.println("첫번째 숫자를 입력해주세요, stop 입력시 계산 종료");
				temp = sc.next().trim().toLowerCase();
				if (temp.equals("stop")) {
					break cal;
				}
				try {
					n1 = Integer.parseInt(temp);
					break;
				} catch (NumberFormatException e) {
					System.out.println("실수를 입력해주세요");
					sc.nextLine();
				}
			}
			
			
			
//------------------------2nd num part--------------------------------------------			
//			while(true) {
//				try {
//					System.out.println("두번째 숫자를 입력해주세요, 0 입력시 계산 종료");
//					n2 = sc.nextDouble();
//					if(n2 == 0) {
//						break cal;
//					}
//					break;
//				} catch (InputMismatchException e) {
//					System.out.println("실수를 입력해주세요");
//					sc.nextLine();
//				}
//			}
			
			
			while (true) {
				System.out.println("두번째 숫자를 입력해주세요, stop 입력시 계산 종료");
				temp = sc.next().trim().toLowerCase();
				if (temp.equals("stop")) {
					break cal;
				}
				try {
					n2 = Integer.parseInt(temp);
					break;
				} catch (NumberFormatException e) {
					System.out.println("실수를 입력해주세요");
					sc.nextLine();
				}
			}
			
			
//----------------------operation part-----------------------------------------------------		
			opr:while(true) {
				System.out.println("연산자 입력(+, -, *, /), 종료는 stop");
				opr = sc.next().trim().toLowerCase();
				switch(opr) {
				case "+" :
					cal.add(n1, n2);
					break opr;
				case "-":
					cal.sub(n1, n2);
					break opr;
				case"*":
					cal.mul(n1, n2);
					break opr;
				case"/":
					cal.div(n1, n2);
					break opr;
				case"stop":
					System.out.println("연산 종료");
					break cal;
				default:
					System.out.println("연산자 오류, 확인해주세요");
				}
			}
			
		}
		cal.showOperationTimes();
		sc.close();
	}

}
