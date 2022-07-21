package mathtest;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Mathtest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) 제곱");
		System.out.println("(2) 제곱");
		System.out.println("(3) 제곱");
		int menu = sc.nextInt();
		
		while(true) {
			System.out.print("계산할 값을 입력하세요(계산종료 : 0)>");
			int num = sc.nextInt();
			if(num == 0) {
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
		
		sc.close();
	}

}
