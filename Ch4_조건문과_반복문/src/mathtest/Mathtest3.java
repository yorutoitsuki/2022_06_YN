package mathtest;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Mathtest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mathtestEnd : while(true) {
			System.out.println("(1) 제곱");
			System.out.println("(2) 루트");
			System.out.println("(3) 로그");
			
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(전체종료 : stop)");
			//int menu = sc.nextInt();
			String temp = sc.next().trim();
			if(temp.equalsIgnoreCase("stop")) {
				break;
			}
			
			if(!(temp.equals("1")||temp.equals("2")||temp.equals("3"))) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			
			//3.String -> 정수 변환("1" ->)
				int menu = Integer.parseInt(temp);//주의 : "10진수로 된 문자열" ->int로 변환 가능
			
			while(true) {
				System.out.print("계산할 값을 입력하세요(계산종료 : 0)>");
				temp = sc.next();
				if(temp.equalsIgnoreCase("stop")) {
					break mathtestEnd;
				}
				
				int num = 0;
				try {
					num = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("정수를 입력해주세요");
					sc.nextLine();
					continue;
				}
				
				if(num == 0) {
					System.out.println("계산종료");
					break;
				}
				
				
				
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
			}
		}
		System.out.println("프로그램 종료");
		
		
		sc.close();
	}//main

}
