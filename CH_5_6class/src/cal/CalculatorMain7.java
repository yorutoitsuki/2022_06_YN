package cal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMain7 {

	public static void main(String[] args) {
		//-------------calculator---------
		Scanner sc = new Scanner(System.in);
		
		

		
		ArrayList<String> operAL = new ArrayList<String>();
		ArrayList<Double> numberAL = new ArrayList<Double>();
		
		while(true) {
			System.out.println("실수와 연산자(+,-,*,/) 입력, 탈출은 stop 입력");
			String temp = sc.next().trim();//1*2-3, 1+2-3, 1+2-3*4, 1+2-3*4/5 등 혼용 가능
			if(temp.equalsIgnoreCase("stop")) {//탈출조건
				break;
			}
			
			
			
			
			boolean isFirstDiv = false;
			
			
			if(temp.charAt(0)=='*') {
				numberAL.add(1.0);
			}else if(temp.charAt(0) == '+' || temp.charAt(0) == '-') {
				numberAL.add(0.0);
			}else if(temp.charAt(0) == '/') {
				isFirstDiv = true;
			}
			
			String tempS = "";
			boolean numberStart = true;
			boolean isNotIntegrity = false;
			double transToDouble = 0;
			boolean checkDoubleOperation = false;
			boolean hasTransToNumber = false;
			
			for(int k = 0; k < temp.length(); k++) {
				if(temp.charAt(k) == '+'||temp.charAt(k) == '-'||
						temp.charAt(k) == '*'||temp.charAt(k) == '/') {
					if(checkDoubleOperation) {
						break;
					}
					if(hasTransToNumber) {
						try {
							transToDouble = Double.parseDouble(tempS);
						} catch (NumberFormatException e) {
							System.out.println("stop 또는 실수만 넣어주세요");
							isNotIntegrity = true;
							break;
						}
						numberAL.add(transToDouble);
						hasTransToNumber = false;
						numberStart = true;
					}
					
					checkDoubleOperation = true;
					
					switch(temp.charAt(k)) {
					case'+':
						operAL.add("+");
						break;
					case'-':
						operAL.add("-");
						break;
					case'*':
						operAL.add("*");
						break;
					case'/':
						operAL.add("/");
						break;
					}
				}
				else {
					if(numberStart) {
						tempS = temp.substring(k, k+1);
						numberStart = false;
					}else {
						tempS += temp.substring(k,k+1);
					}
					
					hasTransToNumber = true;
					checkDoubleOperation = false;
					if(k == temp.length() - 1) {
						try {
							transToDouble = Double.parseDouble(tempS);
							numberAL.add(transToDouble);
						} catch (NumberFormatException e) {
							System.out.println("stop 또는 실수만 넣어주세요");
							isNotIntegrity = true;
							break;
						}
					}
				}
				
			}
			
			if(checkDoubleOperation) {
				System.out.println("연산자 입력 오류가 감지되었습니다.");
				continue;
			}
			
			if(isNotIntegrity) {
				continue;
			}
			
			if(isFirstDiv) {//  A / B = B -> A = B * B
				BigDecimal tempD = new BigDecimal(numberAL.get(0));
				double forDiv = tempD.multiply(tempD).doubleValue();
				numberAL.add(0, forDiv);
			}
			
			
			
			for (int i = 0; i < operAL.size(); i++) {
				switch (operAL.get(i)) {
				case "*":
					BigDecimal mul1 = new BigDecimal(numberAL.get(i));
					BigDecimal mul2 = new BigDecimal(numberAL.get(i+1));
					numberAL.set(i, mul1.multiply(mul2).doubleValue());
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				case "/":
					BigDecimal div1 = new BigDecimal(numberAL.get(i));
					BigDecimal div2 = new BigDecimal(numberAL.get(i+1));
					numberAL.set(i, div1.divide(div2,RoundingMode.HALF_UP).doubleValue());
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				default:
					break;
				}
			}
			
			for(int i = 0; i < operAL.size(); i++) {
				switch(operAL.get(i)) {
				case "+":
					BigDecimal sum1 = new BigDecimal(numberAL.get(i));
					BigDecimal sum2 = new BigDecimal(numberAL.get(i+1));
					numberAL.set(i, sum1.add(sum2).doubleValue());
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				case "-":
					BigDecimal sub1 = new BigDecimal(numberAL.get(i));
					BigDecimal sub2 = new BigDecimal(numberAL.get(i+1));
					numberAL.set(i, sub1.subtract(sub2).doubleValue());
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				}
			}
			//결과출력
			System.out.println(temp + " = " + numberAL.toString());
			numberAL = new ArrayList<Double>();
			operAL = new ArrayList<String>();
		}
		sc.close();
	}

}

		
//		
//		ArrayList<String> OperationAL = new ArrayList<String>();
//		ArrayList<Double> NumberAL = new ArrayList<Double>();
//		while(true) {
//			//연산 종료 후 배열 초기화
//			OperationAL = new ArrayList<String>();
//			NumberAL = new ArrayList<Double>();
//			
//			System.out.println("정수 연산자(+,-,*,/) 정수 입력, 탈출은 stop 입력");
//			String temp = sc.next().trim();//1*2-3, 1+2-3, 1+2-3*4, 1+2-3*4/5 등 혼용 가능
//			
//			if(temp.equalsIgnoreCase("stop")) {
//				break;
//			}
//			
//			//맨 처음에 숫자 대신 연산자가 왔는가?
//			if(temp.charAt(0) == '+' || temp.charAt(0) == '-') {
//				NumberAL.add(0.0);
//			}
//			if(temp.charAt(0)=='*') {
//				NumberAL.add(1.0);
//			}
//			boolean isFirstDiv = false;
//			if(temp.charAt(0)=='/') {
//				isFirstDiv = true;
//				NumberAL.add(null);
//				// a/b = b 가 성립할려면 a = b*b 
//				// 아직 b의 값을 모르기 때문에 나중에 처리 하도록 표시만 해놓음
//			}
//			
//			boolean isNotIntegrity = false;
//			double transToN = 0;
//			boolean isTrans = false;
//			boolean doubleOperation = false;
//			for(int i = 0; i < temp.length(); i++) {
//				if(temp.charAt(i) == '+'||temp.charAt(i) == '-'||temp.charAt(i) == '*'||temp.charAt(i) == '/') {
//					if(doubleOperation) {
//						break;
//					}
//					if(isTrans) {
//						NumberAL.add(transToN);
//						transToN = 0;
//					}
//					OperationAL.add(temp.substring(i, i+1));
//					doubleOperation = true;
//				}
//				else {
//					transToN *= 10;
//					try {
//						transToN += Double.parseDouble(temp.substring(i, i+1));
//					} catch (NumberFormatException e) {
//						System.out.println("stop 또는 실수를 입력해주세요");
//						isNotIntegrity = true;
//						break;
//					}
//					if(i == temp.length()-1) {
//						NumberAL.add(transToN);
//					}
//					isTrans = true;
//					doubleOperation = false;
//				}
//			}
//			if(doubleOperation) {
//				System.out.println("연산자의 입력에 문제가 있습니다.");
//				continue;
//			}
//			if(isNotIntegrity) {
//				continue;
//			}
//			
//			
//			for(int i = 0; i < OperationAL.size(); i++) {
//				
//			}
//		}
//		
//		
		
		






