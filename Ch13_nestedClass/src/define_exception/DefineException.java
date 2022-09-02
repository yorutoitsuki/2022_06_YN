package define_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeInputException extends Exception {
	AgeInputException() {
		super("유효하지 않은 나이");
	}
}

public class DefineException {

	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			System.out.println("나이 입력 > ");
			try {
				readAge();
			} catch (AgeInputException | InputMismatchException e) {
				if(e instanceof AgeInputException) {
					System.out.println(e);
				}else if(e instanceof InputMismatchException) {
					System.out.println("문자나 실수는 나이로 적합하지 않습니다");
				}
			}
		}

	}

	private static int readAge() throws AgeInputException, InputMismatchException {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		if(age < 0) {
			throw new AgeInputException();
		}
		return age;
		
	}

}
