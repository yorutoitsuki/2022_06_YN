package mathtest2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mathtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) 제곱");
		System.out.println("(2) 제곱");
		System.out.println("(3) 제곱");

		outer: while (true) {
			int menu = 0;
			scan: while (true) {
				while (true) {
					try {
						System.out.print("원하는 메뉴(1~3)을 선택하세요. 종료는 0>");
						menu = sc.nextInt();
						if (menu == 0) {
							break outer;
						}
						if (!(menu == 1 || menu == 2 || menu == 3)) {
							System.out.println("1~3 사이의 숫자를 넣어주세요");
						} else {
							break scan;
						}
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("정수를 입력해주세요");
					}
				}
			}
			String temp = null;
			int menu2;
			while (true) {
				System.out.print("원하는 메뉴(1~3)을 선택하세요. 종료는 stop>");
				temp = sc.next().trim();
				if (temp.equalsIgnoreCase("stop")) {
					break outer;
				}
				if (!(temp.equals("1") || temp.equals("2") || temp.equals("3"))) {
					System.out.println("1~3 사이의 정수를 입력해주세요");
				} else {
					menu2 = Integer.parseInt(temp);
					break;
				}

			}

			int num;
			while (true) {
				System.out.print("계산할 값을 입력하세요 전체 종료는 stop>");
				String temp2 = sc.next().trim();
				if (temp2.equalsIgnoreCase("stop")) {
					break outer;
				}
				if (!(temp2.equals("1") || temp2.equals("2") || temp2.equals("3"))) {
					System.out.println("1~3 사이의 정수를 입력해주세요");
				} else {
					num = Integer.parseInt(temp2);
					break;
				}
			}

			switch (menu) {
			case 1:
				System.out.println(num + " 의 제곱 결과 = " + (num * num));
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
		}
		System.out.println("계산 종료");

		sc.close();
	}

}
