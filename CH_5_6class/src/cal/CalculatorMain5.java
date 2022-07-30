package cal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMain5 {

	public static void main(String[] args) {
		//-------------calculator---------
		Scanner sc = new Scanner(System.in);
		
		

		
		ArrayList<String> operAL = new ArrayList<String>();
		ArrayList<Double> numberAL = new ArrayList<Double>();
		
		while(true) {
			System.out.println("정수 연산자(+,-,*,/) 정수 입력, 탈출은 stop 입력");
			System.out.println("split을 사용한 계산기와 달리 1+2-3*4/5 처럼 연산자 혼용 가능함");
			String temp = sc.next().trim();//1*2-3, 1+2-3, 1+2-3*4, 1+2-3*4/5 등 혼용 가능
			if(temp.equalsIgnoreCase("stop")) {//탈출조건
				break;
			}

			//숫자 배열과 연산자 배열 길이를 설정하기 위해 연산자의 숫자를 검색
			//ex)1+2+3*4 => 연산자 총 3개
			//이때 필요한 연산자 배열 길이 = 연산자 총 갯수
			//숫자 배열 길이 = 연산자 총 갯수 + 1
			
			//총 연산자 갯수 확인
			int opers = 0;//연산자 갯수를 칭하는 변수
			for(int k = 0; k < temp.length(); k++) {
				if(temp.charAt(k) == '+'||temp.charAt(k) == '-'||
						temp.charAt(k) == '*'||temp.charAt(k) == '/') {
					opers++;
				}
			}
			
			
			
			int number = 0;//숫자 배열의 index
			int N = 0;//숫자 배열에 들어갈 숫자
			String operA[] = new String[opers];//연산자 배열
			double numberA[] = new double[(opers+1)];//숫자 배열
			
			

			//연산자와 숫자를 연산자배열과 숫자 배열로 분리 하는 과정
			//첫번째 숫자가 음수일 경우 연산자 갯수와 숫자의 갯수가 동일
			boolean isNotIntegrity = false;
			//stop, 숫자 이외의 문자가 포함되어서 변환에 실패했는지
			//무결성 검사를 위한 boolean값
			boolean checkDoubleOperation = false;
			//--,++,**,//, *-,+-,/+,--+등 연산자의 중복사용 확인
			for(int k = 0; k < temp.length(); k++) {
				if(temp.charAt(k) == '+' || temp.charAt(k) == '-' ||
						temp.charAt(k) == '*' || temp.charAt(k) == '/') {
					if(checkDoubleOperation) {
						break;
					}
					//연산자 위치와 종류를 저장
					switch(temp.charAt(k)) {
					case'+':
						operA[number] = temp.substring(k, k+1);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						checkDoubleOperation = true;
						break;
					case'-':
						operA[number] = temp.substring(k, k+1);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						checkDoubleOperation = true;
						break;
					case'*':
						operA[number] = temp.substring(k, k+1);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						checkDoubleOperation = true;
						break;
					case'/':
						operA[number] = temp.substring(k, k+1);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						checkDoubleOperation = true;
						break;
					}
				}
				else {
					//숫자를 저장
					N *= 10;
					try {
						N += Double.parseDouble(temp.substring(k, k+1));
					} catch (NumberFormatException e) {
						System.out.println("stop 또는 정수를 입력해주세요");
						isNotIntegrity = true;
						break;
					}
					numberA[number] = N;
					checkDoubleOperation = false;
					//해당 위치에 연산자가 없으면 숫자가 있는것
					//625 숫자는 (6*10*10)+(2*10)+5로 만들어짐
					//6을 읽고 저장하면 N = 6
					//그다음 2를 읽고 저장하기전에 N에 10을 곱하면
					//60 + 2 = 62 -> N에 저장
					//다음 숫자를 읽기 전에 N에 10을 곱함
					//620 + 5 = 625 ->N에 저장
					//625 숫자를 온전히 저장 가능함
				}
			}
			if(checkDoubleOperation) {
				System.out.println("연산자 입력 오류가 감지되었습니다.");
				continue;
			}
			if(isNotIntegrity) {
				continue;
			}
			//첫 문자가 숫자 대신 연산자 일 경우
			//'+', '-'는 상관 없지만 '*', '/'일 경우 계산에 문제가 생김
			//고로 원할한 계산을 위하여 numverA[0]에 따로 값을 넣어주어야 함
			//첫번째 숫자 앞에 연산자가 있는가?
			boolean isFirstMul = false;
			if(temp.charAt(0)=='*') {
				isFirstMul = true;
			}
			boolean isFirstDiv = false;
			if(temp.charAt(0)=='/') {
				isFirstDiv = true;
			}
			if(isFirstMul) {
				numberA[0] = 1;
			}
			if(isFirstDiv) {//   a/b = b 를 만족하기 위해서는 a = b*b
				numberA[0] = numberA[1]*numberA[1];
			}
			operAL = new ArrayList<String>(Arrays.asList(operA));
			numberAL = new ArrayList<Double>();
			for(double num : numberA) {
				numberAL.add(num);
			}
			//숫자배열과 연산자 배열을 이용하여 계산
			//첫번째 숫자 +(첫번째 연산자 + 두번째 숫자) + (두번째 연산자 + 세번째 숫자)......
			//k=0        k=0          k=0+1        k= 1         k= 1+1
			//
			
			for (int i = 0; i < operAL.size(); i++) {
				switch (operAL.get(i)) {
				case "*":
					numberAL.set(i, (numberAL.get(i) * numberAL.get(i + 1)));
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				case "/":
					numberAL.set(i, (numberAL.get(i) / numberAL.get(i + 1)));
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
					numberAL.set(i, Double.sum(numberAL.get(i),numberAL.get(i + 1)));
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				case "-":
					numberAL.set(i, Double.sum(numberAL.get(i), (-numberAL.get(i + 1))));
					operAL.remove(i);
					numberAL.remove(i + 1);
					i--;
					break;
				}
			}
			//결과출력
			System.out.print(temp + " = ");
			System.out.println(numberAL.toString());
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
		
		






