package cal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {

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
		cal:while(true) {
			double n1;
			while(true) {
				try {
					System.out.println("첫번째 숫자를 입력해주세요, 0 입력시 계산 종료");
					n1 = sc.nextDouble();
					if(n1 == 0) {
						break cal;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("실수를 입력해주세요");
					sc.nextLine();
				}
			}
			
			
			
			double n2;
			while(true) {
				try {
					System.out.println("두번째 숫자를 입력해주세요, 0 입력시 계산 종료");
					n2 = sc.nextDouble();
					if(n2 == 0) {
						break cal;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("실수를 입력해주세요");
					sc.nextLine();
				}
			}
			
			opr:while(true) {
				System.out.println("연산자 입력(+, -, *, /), 종료는 stop");
				String opr = sc.next().trim().toLowerCase();
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
		cal.showOperationgTimes();
		/*---------매서드 수정----------------
		 * 
	void showOperationgTimes() {
		if(a.getCntAdd()!=0) {
			System.out.println("덧셈 횟수 : " + a.getCntAdd());
		}
		if(s.getCntSub()!=0) {
			System.out.println("뺄셈 횟수 : " + s.getCntSub());
		}
		if(m.getCntMul()!=0) {
			System.out.println("곱셈 횟수 : " + m.getCntMul());
		}
		if(d.getCntDiv()!=0) {
			System.out.println("나눗셈 횟수 : " + d.getCntDiv());
		}
		int total = a.getCntAdd() + s.getCntSub() + m.getCntMul() + d.getCntDiv();
		if(total != 0) {
			System.out.println("총 연산 횟수 = " + total);
		}
		else {
			System.out.println("시행된 연산 없음");
		}
	}
	
		 */
		sc.close();
	}

}
