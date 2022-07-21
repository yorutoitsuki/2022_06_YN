package fruit2;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		//멤버변수에 직접접근 하여 값을 변경
		b.setMoney(30000);
		b.numOfApple = 20;
		b.showBuy();
		
		System.out.println("--멤버변수에 직접 접근, 구매자의 현재 현황 -1 -------------");
		System.out.println(b.getMoney() + "원");
		System.out.println(b.numOfApple + "개");
		
		//멤버변수에 간접접근 하여 값을 변경
		b.setMoney(50000);
		b.setNumOfApple(70);
		b.showBuy();
		
		System.out.println("--멤버변수에 간접 접근, 구매자의 현재 현황 -2 -------------");
		System.out.println(b.getMoney() + "원");
		System.out.println(b.numOfApple + "개");
		
		Scanner sc = new Scanner(System.in);
		
		Buyer b1 = new Buyer(10000);//사과수는 기본값 0
		Buyer b2 = new Buyer(20000,10);
		
		Seller s1 = new Seller("판매자 1", 3000, 100, 1000);
		Seller s2 = new Seller("판매자 2", 4000, 50, 2000);
		
		while(b1.getMoney() >= 1000) {
			System.out.println("(1) 판매자 1");
			System.out.println("(2) 판매자 2");
			System.out.print("선택하세요 (구매를 종료하려면 stop)");
			
			String order = sc.next().trim();
			if(order.equalsIgnoreCase("stop")) {
				break;
			}
			if(!(order.equals("1")||order.equals("2"))) {
				System.out.println("not in option");
				continue;
			}
			int many;
			while(true) {
				try {
					System.out.println("얼마만큼 구매하시겠습니까?");
					many = sc.nextInt();
					break;
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("정수를 입력해주세요");
					continue;
				}
			}
			
			
			switch(order) {
			case"1":
				b1.buy(s1, many);
				b1.showBuy();
				System.out.println("------------");
				break;
			case"2":
				b1.buy(s2, many);
				b1.showBuy();
				System.out.println("------------");
				break;
			}
			
			
		}
		System.out.println("Done");
		
		sc.close();
	}

}
