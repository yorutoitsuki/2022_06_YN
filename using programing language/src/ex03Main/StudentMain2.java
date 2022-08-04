package ex03Main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ex03.Student;

public class StudentMain2 {

	public static void main(String[] args) {
		// 키보드로 부터 '학생 이름, 국어점수, 영어점수, 수학점수' 입력받음
		// 입력 받은 값으로 Student 객체 생성
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> sList = new ArrayList<Student>();

		System.out.print("이름을 입력해주세요");
		String name = sc.next();
		
		int gugScore;
		int engScore;
		int mathScore;
		
		while (true) {
			try {
				System.out.print("국어 점수를 입력해주세요");
				gugScore = sc.nextInt();
				if(gugScore > 100 || gugScore < 0) {
					System.out.print("점수를 확인 바랍니다 ");
				}
				else {
					break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.print("정수를 입력해주세요 ");
			}
		}
		while (true) {
			try {
				System.out.println("영어 점수를 입력해주세요");
				engScore = sc.nextInt();
				if(engScore > 100 || engScore < 0) {
					System.out.print("점수를 확인 바랍니다 ");
				}
				else {
					break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.print("정수를 입력해주세요 ");
			}
		}
		while (true) {
			try {
				System.out.println("수학 점수를 입력해주세요");
				mathScore = sc.nextInt();
				if(mathScore > 100 || mathScore < 0) {
					System.out.print("점수를 확인 바랍니다 ");
				}
				else {
					break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.print("정수를 입력해주세요 ");
			}
		}
		sList.add(new Student(name,gugScore,engScore,mathScore));
		sList.get(0).showInfo();
		
		
		sc.close();

	}

}
