package copyRandom;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayCopyRandomExample {

	public static void main(String[] args) {
		/*
		 * 정수형 배열
		 */
		
		int a1[] = new int[5];
		a1[0] = 2;
		a1[1] = 2;
		a1[2] = 2;
		a1[3] = 2;
		a1[4] = 2;
		for(int i = 0; i < a1.length; i++) {
			a1[i] = 5;
		}
		Arrays.fill(a1, 7);
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = ((int)(Math.random()*10+1));
		}
		System.out.println(Arrays.toString(a1));
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = ((int)(Math.random()*(29-11+1)+11));
		}
		System.out.println(Arrays.toString(a1));
		System.out.println();
		char ch[] = new char[3];
		System.out.println(Arrays.toString(ch));
		Arrays.fill(ch, 'a');
		System.out.println(Arrays.toString(ch));
		for(int i = 0; i < ch.length; i++) {
			ch[i] -=32;
		}
		System.out.println(Arrays.toString(ch));
		
		
		/*
		 * 배열 복사 방법
		 */
		
		char[] arr = {'J','A','V','A'};
		char[] arr1 = new char[arr.length+2];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[4] = '~';
		arr1[5] = '!';
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("배열 복사방법 2");
		char[] arr2 = new char[arr.length+2];
		//void arraycopy(1.원본, 2.원본의 시작index, 3.도착지, 4.도착지의 시작 index, 5.복사할 개수)
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr2));
		char[] arr2_2 = new char[arr.length+2];
		System.arraycopy(arr, 1, arr2_2, 0, 2);
		System.out.println(Arrays.toString(arr2_2));
		
		
		System.out.println("배열 복사 방법 3");
		char[] arr3 = null;
		
		//char[] copyOf(원본, 새배열객체의 길이)
		arr3 = Arrays.copyOf(arr, arr.length+2);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("배열 복사 방법 4(원하는 부분만 복사하여 배열객체 생성/ 원본 배열 크기보다 더 큰 배열도 생성 가능)");
		char[] arr4 = null;
		
		//char[] copyOf(원본, 새배열객체의 길이)
		arr4 = Arrays.copyOfRange(arr, 1, 2+1);//부분배열
		//T : 클래스 타입이 결정되지 않았음. 언제 결정되는냐? 객체가 생성될 때 타입이 결정됨
		//T[] Arrays.copyOfRange(T[] 원본, 복사 시작할 index, 복사가 끝날 index + 1)
		System.out.println(Arrays.toString(arr4));
		arr4 = Arrays.copyOfRange(arr, 0, arr.length+2);
		System.out.println(Arrays.toString(arr4));
		
		/*
		 * 과제2 단계1과 2를 합치기(향상된 for로 처리) [과제-2] 각 반의 java 성적의 합과 평균 구하기 java 성적의 총 합과 총
		 * 평균 구하기 단계 1, 2 를 (향상된 for문 이용)하여 합치기 for(:)
		 */
		int[][] java = {
				{95, 97},
				{98, 100, 99, 75},
				{100, 88, 92}
		};
		int totalN = 0;
		int totalHap = 0;
		double totalAvg;
		int hap;//각 반의 점수 합
		double avg;//각 반의 평균
		int cls = 1;//반, 바깥쪽 for문을 몇번 돌았는가 확인 가능한 변수
		for(int[] n1:java) {
			//n1 : java[]에 해당하는 값
			hap = 0;//각 반의 점수를 누적시키기 위해 초기화
			for(int n2:n1) {
				//n2 : java[][]에 해당하는 값
				hap += n2;//각java[][]에 해당하는 값을 누적
				totalHap += n2;
			}
			totalN += n1.length;
			avg = ((double)hap/n1.length);//평균 계산
			System.out.printf("%d반의 점수 총합 : %d, 평균 : %.2f\n",cls,hap,avg);//평균 출력
			cls++;//다음 반으로 이동
		}
		totalAvg = ((double)totalHap/totalN);
		System.out.printf("총 인원 %d명의 점수 총합 : %d, 평균 : %.2f\n",totalN,totalHap,totalAvg);//총 평균 출력
		

		/*
		 * 7-4 과제 1
		 * 키보드로 증가할 배열크기를 입력받아 새 배열 객체 생성함(기본 값으로 채워짐)
		 * arr이 참조하는 배열의 항목 값을 복사하여 새배열에 대입
		 * 그리고
		 * 기본값으로 채워진 곳은 사용자가 입력한 값으로 채움
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		int plusN;//증가시킬 값을 넣을 변수.
		//스캔 시작
scanN:	while (true) {//try-catch를 반복시키기 위한 반복문
			try {//input(입력)mismatch(불일치)를 해결하기 위한 try-catch
				while (true) {//1이상의 정수를 받아들이기 위한 반복문
					
					System.out.println("증가시킬 배열 크기는?");
					plusN = sc.nextInt();
					
					if (plusN < 1) {
						System.out.println("1이상의 수를 넣어주세요");
					} else {
						break scanN;// 1이상의 정수이므로 탈출
					}
				}
			} catch (InputMismatchException e) {//정수가 아닌 실수, 문자 등일 경우
				sc = new Scanner(System.in);// 스캐너를 초기화 시켜서 잘못 입력된 값을 날림
				//sc.nextLine();//버퍼날리기
				System.out.println("정수를 입력해주세요");
			}
		}
		//새 배열 생성
		char[] arr5 = new char[arr.length+plusN];
		//배열 복사
		System.arraycopy(arr, 0, arr5, 0, arr.length);
		
		//정상적으로 배열이 복사되었는가 확인
		System.out.println("증가된 새 배열 생성 완료");
		System.out.println(Arrays.toString(arr5));
		
		System.out.println("----------------------------------------------------------");
		
		//new 배열에 추가할 문자 받아들일 밑준비
		int stopper = arr.length;//while문을 빠져나가기 위한 트리거,배열에 추가할 위치도 겸함
		String temp = null;//Scanner에서 문자를 받아 들이기 위한 변수
		char addChar;//Scanner에서 받아들인 문자열을 문자형으로 변환후 저장할 변수
		
		while(stopper<arr5.length) {
			//전부 문자열로 받아들이기에 try-catch 안함
			System.out.println("추가로 입력하실것이 있으십니까? 없으시다면 no를 입력해주세요 현재 " + (arr5.length-stopper) + "만큼 추가 가능합니다");
			temp = sc.next().trim();
			
			if(temp.toLowerCase().equals("no")) {
				break;//탈출 조건
			}
			
			if(temp.length()>1) {
				System.out.println("1글자가 아닙니다");
			}else {
				addChar = temp.charAt(0);
				arr5[stopper] = addChar;
				stopper++;
			}
		}
		//추가된 된 문자열이 정확하게 들어갔나 확인
		System.out.println(Arrays.toString(arr5));
		
		char[] inputCharArray = temp.toCharArray();
		System.out.println();

		sc.close();
		

	}

}
