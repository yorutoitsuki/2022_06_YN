package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		int[] score = {89, 88, 95, 87};
		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println(score[i]);
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		System.out.println(sum);
		
		char[] ch = {'a', 'b', 'c'};
		
//		for(int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + "\t");
//		}
//		System.out.println();
//		System.out.println(ch);
//		System.out.println(ch.toString());
//		
//		for(int i = 0; i < ch.length; i++) {
//			ch[i] = (char)(ch[i] - 32);
//		}
//		for(int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + "\t");
//		}
//		System.out.println();
//		for(int i = 0; i < ch.length; i++) {
//			ch[i] = (char)(ch[i] + 32);
//			System.out.print(ch[i] + "\t");
//		}
		System.out.println();
		System.out.println(Arrays.toString(ch));
		
		/*
		 * 과제
		 * Arrays.toString()이용하지 않고 [a,b,c]출력(for문 사용)
		 */
		System.out.print("[");
		for(int i = 0; i<ch.length;i++) {
			System.out.print(ch[i]);
			if(i < (ch.length - 1)) {
				System.out.print(", ");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();
		String result = "";
		for(int i = 0; i < ch.length; i++) {
			result += ((i == 0)?ch[i]:("," + ch[i]));
		}
		System.out.println(result);
		
		
		
		
		
		/*
		 * try-catch
		 */
		
		try {
			System.out.println(ch[3]);
		} catch (Exception e) {
			System.out.println("out of length on Array");
		}
		test1(ch);
		System.out.println();
		
		ArrayList<String> Alist = new ArrayList<String>();
		Alist.add("testint0");
		Alist.add("testing1");
		Alist.add("testing2");
		Alist.add("testing3");
		Alist.add("testing4");
		Alist.add("testing5");
		Alist.add("testing6");
		Alist.add("testing7");
		test1(Alist);
		Alist.remove(2);
		test1(Alist);
		Alist.set(5, "new tseting");
		test1(Alist);
		ArrayList<Integer> Alist2 = new ArrayList<Integer>();
		Alist2.add(100);
		
		
		LinkedList<ArrayList<String>> li = new LinkedList<ArrayList<String>>();
		li.add(Alist);
		ArrayList<String> AL = (ArrayList<String>) li.get(0);
		System.out.println("is It work?");
		test1(AL);
		
		int[] sco1 = new int[3];
		boolean[] scoBoolean = null;
		scoBoolean = new boolean[4];
		
		for(int i = 0; i<sco1.length; i++) {
			sco1[i] +=10;
		}
		System.out.println(Arrays.toString(sco1));
		
		sco1 = new int[3];
		for(int i = 0; i< sco1.length; i++) {
			sco1[i] = (i*10);
		}
		System.out.println(Arrays.toString(sco1));
		
		
		/*
		 * 과제2 
		 * 키보드로 부터 학생수를 입력받아 sco2가 참조하는 배열객체 생성한 후
		 * -> 학생들의 점수를 하나씩 입력 받아 배열 객체에 저장
		 * 합과 평균 구하기
		 */
		
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//학생별 점수를 자동으로 넣기 위해서 랜덤 클래스를 이용
		System.out.print("총 학생 수는 몇명인가요?");
		int many = sc.nextInt();
		if(many <= 0) {
			
		}
		int[] sco2 = new int[many];
		double sum = 0;
		double avg = 0;
//		System.out.println("----분할----");
//		for(int i = 0; i < sco2.length; i++) {
//			sco2[i] = random.nextInt(100);
//		}
//		for(int i = 0; i< sco2.length; i++) {
//			sum += sco2[i];
//		}
//		avg = sum/many;
//		System.out.println(avg);
//		System.out.println();
//		sum = 0;
//		avg = 0;
//		System.out.println("----합병----");
//		for(int i = 0; i < sco2.length; i++) {
//			sco2[i] = random.nextInt(100);
//			sum += sco2[i];
//		}
//		avg = sum/many;
//		System.out.println(avg);
//		System.out.println();
//		System.out.println("----각 학생의 점수----");
//		sum = 0;
//		avg = 0;
		for(int i = 0; i < sco2.length; i++) {
//			System.out.println((i+1)  + " 번째 학생의 점수는?");
//			sco2[i] = sc.nextInt();
			sco2[i] = random.nextInt(100);
			//정수 0~100 사이에서 배정
			sum += sco2[i];
			System.out.print((i+1)+"번째 학생의 점수 = " + sco2[i] + "\t");
			if((i+1)%5 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("총 점수 합 = " +sum);
		avg = sum/many;
		
		System.out.print("총 학생 수 = " + many);
		System.out.printf("\t평균 = %.2f",avg);
		
		
		
		sc.close();
		
		
		
		
		
	}
	
	static void test1(ArrayList<String> a) {
		for(int i = 0; i < a.size(); i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(a.get(i));
			if(i < (a.size()- 1)) {
				System.out.print(", ");
			}else {
				System.out.print("]\n");
			}
			if(i%5==0) {
				System.out.println();
			}
		}
	}
	
	static void test1(char[] a) {
		for(int i = 0; i<a.length;i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(a[i]);
			if(i < (a.length - 1)) {
				System.out.print(", ");
			}else {
				System.out.print("]\n");
			}
		}
	}
	static void test1(int[] a) {
		for(int i = 0; i<a.length;i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(a[i]);
			if(i < (a.length - 1)) {
				System.out.print(", ");
			}else {
				System.out.print("]\n");
			}
			if(i>0&&i%4==0) {
				System.out.println();
			}
		}
	}
	static void test1(String[] a) {
		for(int i = 0; i<a.length;i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(a[i]);
			if(i < (a.length - 1)) {
				System.out.print(", ");
			}else {
				System.out.print("]\n");
			}
		}
	}
	
	static void forprint(char[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	static void forspell(char[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)(a[i] + 32);
		}
	}

}
