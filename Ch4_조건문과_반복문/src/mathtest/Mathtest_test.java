package mathtest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mathtest_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) 제곱");
		System.out.println("(2) 제곱");
		System.out.println("(3) 제곱");
		int menu = 0;
		try {
			System.out.print("원하는 메뉴(1~3)을 선택하세요.>");
			menu = sc.nextInt();
		} catch (InputMismatchException e) {
			sc.nextLine();
		}
		
		
		System.out.print("계산할 값을 입력하세요>");
		int num = sc.nextInt();
		
		
		switch(menu) {
		case 1:
			System.out.println(num + " 의 제곱 결과 = " + (num*num));
			break;
		case 2:
			System.out.println(num + " 의 루트 결과 = " + Math.sqrt(num));
			break;
		case 3:
			System.out.println(num + " 의 로그 결과 = " + Math.log(num));
			break;
		default:
			System.out.println("Not in menu");
		}
		sc.close();
	}

}
