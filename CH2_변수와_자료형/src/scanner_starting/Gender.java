package scanner_starting.student;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("주민등록번호 입력(예:010627-3*******)");
//			String idNum = sc.next().trim();
//			if(idNum.equalsIgnoreCase("stop")) {
//				break;
//			}
//			char gender = idNum.charAt(7);
//			switch(gender) {
//			case '1' :
//			case '3' :
//				switch (gender) {
//				case '1' :
//					System.out.print("2000년 이전에 출생한");
//					break;
//				case '3' :
//					System.out.print("2000년 이후에 출생한");
//					break;
//				}
//				System.out.println("male");
//				break;
//			case '2' :
//			case '4' :
//				switch (gender) {
//				case '2' :
//					System.out.print("2000년 이전에 출생한");
//					break;
//				case '4' :
//					System.out.print("2000년 이후에 출생한");
//					break;
//				}
//				System.out.println("female");
//				break;
//			default :
//				System.out.println("cannot");
//				break;
//			}
//		}
//		System.out.println("주민등록번호 판별 끝");
//		
		boolean flag = true;
		while(flag) {
			System.out.println("주민등록번호 입력(예:010627-3*******)");
			String idNum = sc.next().trim();
			
			if(idNum.equalsIgnoreCase("stop")) {
				flag = false;
				break;
			}
			if(idNum.contains("-")) {
				String temp[] = idNum.split("-");
				idNum = String.join("", temp[0],temp[1]);
				
			}
//			if(idNum.length() != 13) {
//				System.out.println("check numbers length");
//				continue;
//			}
			char gender = idNum.charAt(7);
			String result = "あなたは";
			switch(gender) {
			case '1' :
			case '3' :
				switch (gender) {
				case '1' :
					System.out.print(result + "2000년 이전에 출생한");
					break;
				case '3' :
					System.out.print(result + "2000년 이후에 출생한");
					break;
				}
				System.out.println("male");
				break;
			case '2' :
			case '4' :
				switch (gender) {
				case '2' :
					System.out.print("2000년 이전에 출생한");
					break;
				case '4' :
					System.out.print("2000년 이후에 출생한");
					break;
				}
				System.out.println("female");
				break;
			default :
				System.out.println("cannot");
				break;
			}
		}
		sc.close();

	}

}
