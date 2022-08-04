package ex01;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * for문과 if문을 이용하여 1~20 사이의 수 중 4의 배수를 제외하고 출력하시오
		 * (단, 출력줄에 5개씩 TAB으로 줄바꿈)
		 */
		
		int j = 0;
		for(int i = 1; i < 21; i++) {
			if(i%4 == 0) {
				continue;
			}
			System.out.print(i + "\t");
			j++;
			if(j%5 == 0) {
				System.out.println();
			}
		}

	}

}
