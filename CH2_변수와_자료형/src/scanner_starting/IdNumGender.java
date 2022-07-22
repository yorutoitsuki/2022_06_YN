package scanner_starting.student;

import java.util.Scanner;

public class IdNumGender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호 입력(예 : 010622-4234567 > ");

		String regNo = sc.nextLine().trim();
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 성별 구분 위해 변수 gender에 저장
		char year = regNo.charAt(0); // 입력받은 번호의 0번째 문자를 출생년도 구분 위해 변수 year에 저장
		String genderA = null; // gender를 출력할 공간
		String yearA = null; // year를 출력할 공간
		String yy = regNo.substring(0, 1 + 1); // yy년 출력하기 위해 부분 문자열 생성
		String mm = regNo.substring(2, 3 + 1); // mm월 출력하기 위해 부분 문자열 생성
		String dd = regNo.substring(4, 5 + 1); // dd일 출력하기 위해 부분 문자열 생성
		switch (gender) {
		case '1':
		case '3':
			genderA = "남성";
			break;
		case '2':
		case '4':
			genderA = "여성";
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		} // break;
		switch (year) {
		case '0':
		case '1':
		case '2':
			yearA = "2000년 이후";
			break;
		default:
			yearA = "2000년 이전";
		} // break;
		System.out.println("주민등록번호 입력(예 : 010622-4234567 > " + regNo);
		System.out.println(
				"당신은 " + yy + "년" + " " + mm + "월" + " " + dd + "일" + " " + yearA + "에 태어난 " + genderA + "입니다.");

		sc.close();

	}

}
