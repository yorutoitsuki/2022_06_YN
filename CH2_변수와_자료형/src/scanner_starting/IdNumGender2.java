package scanner_starting;



import java.util.Scanner;

public class IdNumGender2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[숙제-2] 주민등록번호 판별");
		System.out.println();

		for (int k = 1; k <= 5; k++) {// 확인용으로 5회 반복
			System.out.println("주민등록번호 입력(예: 011111-3234567) > ");// 숫자아님
			String idNum = sc.next();
			idNum = idNum.trim();

			String idNum1 = idNum.substring(7, 8);
			int iN = Integer.parseInt(idNum1);
			// 뒷자리 첫번째 자리를 정수로 변환
			String yy = idNum.substring(0, 2);
			// 년도는 00~99 이므로 문자로 바로 대입해도 문제 없음
			String mm = idNum.substring(2, 4);
			int mm1 = Integer.parseInt(mm);
			// 12월까지 13이상의 정수 오기입 표시를 위해 정수 변환. if문에서 비교하기위해
			String dd = idNum.substring(4, 6);
			int dd1 = Integer.parseInt(dd);
			// 월과 마찬가지로 31일 초과한 날짜 오기입 파악을 위해 정수변환

			if (mm1 > 12) {

				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			} else if (dd1 > 31) {

				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			} else if (mm1 == 2 && dd1 > 28) {

				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			} else if (iN == 1) {

				System.out.println("\"당신은 " + "19" + yy + "년 " + mm + "월 " + dd + "일 '2000년 이전'에 태어난 남성입니다.");
				System.out.println();
			} else if (iN == 2) {

				System.out.println("\"당신은 " + "19" + yy + "년 " + mm + "월 " + dd + "일 '2000년 이전'에 태어난 여성입니다.");
				System.out.println();
			} else if (iN == 3) {
				System.out.println();
				System.out.println("\"당신은 " + "20" + yy + "년 " + mm + "월 " + dd + "일 '2000년 이후'에 태어난 남성입니다.");
				System.out.println();
			} else if (iN == 4) {

				System.out.println("\"당신은 " + "20" + yy + "년 " + mm + "월 " + dd + "일 '2000년 이후'에 태어난 여성입니다.");
				System.out.println();
			}

			else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
			}
		} // for문의 끝

	}

}
