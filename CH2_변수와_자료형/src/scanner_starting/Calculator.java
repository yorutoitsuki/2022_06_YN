package scanner_starting.student;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		while(true) {
			System.out.println("숫자 연산자(+,-,*,/) 숫자 입력, 탈출은 연산자 넣지 말것");
			System.out.println("연산자는 무조건 같은 것으로 사용할것! 에러 유발됨");
			String temp = sc.next().trim();//"  1+2    ", "  1+2    ", "  1+2    ", "  1+2    "
			if(temp.equalsIgnoreCase("stop")) {
				System.out.println("탈출!");
				break;
			}
			if(temp.contains("+")) {
				String[] temp2 = temp.split("\\+");
				double num = cal.addA(temp2);
				System.out.println(temp + " = " + num);
//				int num = Integer.parseInt(temp2[0]);
//				for (int j = 1; j < temp2.length; j++) {
//					num += Integer.parseInt(temp2[j]);
//				}
//				System.out.println(temp + " = " + num);
			}
			else if(temp.contains("-")) {
				String[] temp2 = temp.split("\\-");
				double num = cal.subA(temp2);
				System.out.println(temp + " = " + num);
//				int num = Integer.parseInt(temp2[0]);
//				for (int j = 1; j < temp2.length; j++) {
//					num -= Integer.parseInt(temp2[j]);
//				}
//				System.out.println(temp + " = " + num);
			}
			else if(temp.contains("*")) {
				String[] temp2 = temp.split("\\*");
				double num = cal.mulA(temp2);
				System.out.println(temp + " = " + num);
//				int num = Integer.valueOf(temp2[0]);
//				for (int j = 1; j < temp2.length; j++) {
//					num *= Integer.valueOf(temp2[j]);
//				}
//				System.out.println(temp + " = " + num);
			}
			else if(temp.contains("/")) {
				String[] temp2 = temp.split("/");
				double num = cal.divA(temp2);
				System.out.println(temp + " = " + num);
//				for (int j = 1; j < temp2.length; j++) {
//					num /= Double.parseDouble(temp2[j]);
//				}
//				System.out.println(temp + " = " + num);
			}
			else {
				System.out.println("탈출!");
				break;
			}
			
		}
		
		
//		System.out.println("얼마까지?");
//		int dan = sc.nextInt();
//		for(int i = 1; i<=dan; i++) {
//			System.out.println("5 X "+ i + " = " + (5*i));
//		}
		System.out.println("몇단?");
		int dan = sc.nextInt();
		System.out.println("얼마까지?");
		int many = sc.nextInt();
		for(int i = 1; i<=many; i++) {
			System.out.println(dan + " X "+ i + " = " + (dan*i));
		}
		
		
		
		

		sc.close();

	}
	double addA(String[] a) {
		double result = Double.parseDouble(a[0]);
		for(int i = 1; i < a.length; i++) {
			result += Double.parseDouble(a[i]);
		}
		return result;
	}
	double subA(String[] a) {
		double result = Double.parseDouble(a[0]);
		for(int i = 1; i < a.length; i++) {
			result -= Double.parseDouble(a[i]);
		}
		return result;
	}
	double mulA(String[] a) {
		double result = Double.parseDouble(a[0]);
		for(int i = 1; i < a.length; i++) {
			result *= Double.parseDouble(a[i]);
		}
		return result;
	}
	double divA(String[] a) {
		double result = Double.parseDouble(a[0]);
		for(int i = 1; i < a.length; i++) {
			result /= Double.parseDouble(a[i]);
		}
		return result;
	}
	
	

}
