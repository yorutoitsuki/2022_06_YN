package ex05;

public class MyExceoption {

	public static void main(String[] args) {
		String[] arr = {"12", "37", "1.23", "99"};
		
		for(int i = 0; i < arr.length; i++) {
			int num = 0;
			try {
				num = Integer.parseInt(arr[i]);
			} catch (NumberFormatException e) {
				System.out.println(arr[i] + "는 정수로 변환 할 수 없습니다");
				continue;
			}
			System.out.println("정수로 변환된 값은 " + num);
		}

	}

}
