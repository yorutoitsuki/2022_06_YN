import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			int test;
			System.out.println("정수를 입력해주세요");
			try {
				while(true) {
					test = sc.nextInt();
					if(test<10) {
						System.out.println("10 이상의 정수를 입력해주세요");
					}
					else {
						System.out.println(test);
						break;
					}
				}
			}catch (InputMismatchException e) {
				System.out.println("불가능, 정수를 입력");
				sc = new Scanner(System.in);
				continue;
			}
			if(test == 100) {
				break;
			}
		}while(true);
		
		
		
		sc.close();

	}

}
