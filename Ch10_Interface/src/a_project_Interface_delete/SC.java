package a_project_Interface_delete;

import java.util.Scanner;

public class SC {
	public static Scanner sc = new Scanner(System.in);
	private SC() {}
	//입력 문자의 숫자 무결성(Integrity) 확인하는 함수, 문제가 있으면 true, 없으면 false반환
	private static boolean numberIntegrityCheck(String number) {
		try {//숫자 확인//숫자만 있지 않으면 예외 발생, 변환된 숫자를 저장할 필요는 없음 고로 변환된 숫자를 저장할 변수는 안적음
			Integer.parseInt(number);
		} catch (NumberFormatException e) {
			SC.sc.nextLine();
			System.out.println("숫자를 넣어주세요");
			return true;
		}
		return false;
	}//무결성 함수 종료
}
