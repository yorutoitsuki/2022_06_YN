package forex;

public class Break_test {

	public static void main(String[] args) {
		/*
		 * 과제 1~50사이의 정수를 출력하되 그 중 7의 배수인 것은 제외
		 * 단, 1줄에 5개씩 출력
		 */
		System.out.println("------------for-------------");
		int i;
		int j = 0;
		for(i = 1; i<=50; i++) {
			if(i%7 == 0) {
				continue;
			}
			System.out.print(i + "\t");
			j++;
			if(j%5 == 0) {
				System.out.println();
				//j=0;
				//활성화 해도 되고 안해도 됩니다.
			}
		}
		System.out.println();
		System.out.println("------------while-------------");
		
		i = 1;
		j = 0;
		while(i<=50) {
			if(i%7 == 0) {
				i++;
				continue;
			}
			System.out.print(i + "\t");
			j++;
			if(j%5 == 0) {
				System.out.println();
				//j=0;
				//활성화 해도 되고 안해도 됩니다.
			}
			i++;
		}
		System.out.println();
		System.out.println("------------Do_while-------------");
		i = 0;
		j = 0;
		do{
			i++;
			if(i%7 == 0) {
				continue;
			}
			System.out.print(i + "\t");
			j++;
			if(j%5 == 0) {
				System.out.println();
				//j=0;
				//활성화 해도 되고 안해도 됩니다.
			}
		}while(i<=49);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
