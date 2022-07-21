package forex;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("1-1. 구구단 출력 : 단 사이에 빈줄 넣기");
		
		
//		for(int i = 2; i<= 9; i++) {
//			System.out.println();
//			System.out.println("-----------"+i+"단 시작"+"-----------");
//			for(int j = 2; j<=9; j++) {
//				System.out.println(i + " X " + j + " = " + (i*j));
//			}
//			System.out.println("-----------"+i+"단 완료"+"-----------");
//		}
		
//		for(int i = 2; i<= 9; i++) {
//			for(int j = 2; j<=9; j++) {
//				System.out.print(j + " X " + i + " = " + (i*j));
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
		
		//[과제_6_21 : ]
		/*
		 * 
		 */
		System.out.println("2-2. 구구단 출력 : 옆으로 출력 + 제 몇단");
		for(int i = 0; i<= 9; i++) {
			for(int j = 2; j<=9; j++) {
				if(i == 0) {//2X0, 3X0,4X0 등에 해당하는 위치에 대신 출력할 문자들
					System.out.print("제 " + j +" 단\t\t");
				}
				else {
					System.out.print(j + " X " + i + " = " + (i*j)+"\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("2-2. 구구단 출력 : 옆으로 출력 + 제 몇단");
		for(int i = 1; i<= 9; i++) {
			if(i==1) {
				for(i = 2; i<=9; i++) {
					System.out.print("제 " + i +" 단\t\t");
				}
				i = 1;
				//for문이 끝난다음 if문을 나서기 전에 i를 1로 초기화 하면
				//i=1인 상태로 바로 밑의 for문을 돌수 있음
				//밑의 for문을 돌고 난 이후에는 위쪽 for문의 i++에 의해 i = 2
				//더이상 if문에 들어가지 않음
				System.out.println();
			}
			for(int j = 2; j<=9; j++) {
					System.out.print(j + " X " + i + " = " + (i*j)+"\t");
			}
			System.out.println();
		}
//		
//		System.out.println("2단에서 입력받은 단까지 아래로 출력");
//		System.out.println("몇단까지 할까요?");
//		int dan = sc.nextInt();
//		if(dan < 2) {
//			System.out.println("불가능함");
//		}
//		else {
//			for(int i = 1; i<= 9; i++) {
//				for(int j = 2; j<=dan; j++) {
//					if(i == 1) {//2X1, 3X1,4X1 등에 해당하는 위치에 대신 출력할 문자들
//						System.out.print("제 " + j +" 단\t\t");
//					}
//					else {
//						System.out.print(j + " X " + i + " = " + (i*j)+"\t");
//					}
//				}
//				System.out.println();
//			}
//		}
//		
//		System.out.println("구구단 중에서 두수를 곱해서 72가 되는 것만 아래로 출력");
//		for(int i = 2; i<=9;i++) {
//			for(int j = 2; j<=9;j++) {
//				if(i == 8 && j == 9) {
//					System.out.println(i + " X " + j + " = " + (i*j));
//				}
//			}
//		}
//		System.out.println("원하는 숫자가 무엇인가요?");
//		int num = sc.nextInt();
//		boolean check_b = false;
//	outer:for(int i = 2; i<=9;i++) {
//			for(int j = 2; j<=9;j++) {
//				if((i*j) == num) {
//					System.out.println(i + " X " + j + " = " + (i*j));
//					check_b = true;
//					break outer;
//				}
//			}
//		}
//		if(!check_b) {
//			System.out.println("2X2~9X9 사이에는 없었습니다");
//		}
//		
		
		sc.close();

	}

}
