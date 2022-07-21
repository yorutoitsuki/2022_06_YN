package forex;

import java.util.Scanner;

public class ForWhileDowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("for문 컬랙션 프레임 워크");
		int i;
		for(i = 0; i < 5;i++) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("while문 컬랙션 프레임 워크");
		i=0;
		while(i < 5) {
			System.out.print(" " + i);
			i++;
		}
		System.out.println();
		System.out.println("Dowhile문 컬랙션 프레임 워크");
		i=0;
		do{
			System.out.print(" " + i);
			i++;
		}while(i < 5);
		System.out.println();
		
		System.out.println("1~10까지 더한 합");
		int num = 0;
		for(i = 1; i<=10; i++) {
			num += i;
		}
		System.out.println("1~10까지 더한 합 ver.For = " + num);
		i = 0;
		num = 0;
		while(i<=10) {
			num += i;
			i++;
		}
		System.out.println("1~10까지 더한 합 ver.While = " + num);
		i = 0;
		num = 0;
		do{
			num += i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지 더한 합 ver.DoWhile = " + num);
		
		
		

		sc.close();
	}

}
