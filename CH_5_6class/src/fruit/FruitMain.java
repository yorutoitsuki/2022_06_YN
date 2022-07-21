package fruit;

public class FruitMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		//멤버변수에 직접접근 하여 값을 변경
		b.money = 30000;
		b.numOfApple = 20;
		b.showBuy();
		
		System.out.println("--멤버변수에 직접 접근, 구매자의 현재 현황 -1 -------------");
		System.out.println(b.money + "원");
		System.out.println(b.numOfApple + "개");
		
		//멤버변수에 간접접근 하여 값을 변경
		b.setMoney(50000);
		b.setNumOfApple(70);
		b.showBuy();
		
		System.out.println("--멤버변수에 간접 접근, 구매자의 현재 현황 -2 -------------");
		System.out.println(b.money + "원");
		System.out.println(b.numOfApple + "개");
		
		Buyer b1 = new Buyer(10000);//사과수는 기본값 0
		Buyer b2 = new Buyer(20000,10);
		
		Seller s1 = new Seller(0, 100, 1000);
		Seller s2 = new Seller(0, 50, 2000);
		
		//3-1. 구매자1이 판매자1 한테 사과 5000원 어치 구매
		b1.buy(s1, 5000);
		//3-2. 구매자1이 판매자2 한테 사과 4000언 어치 구매
		b1.buy(s2, 4000);
		System.out.println("구매자1");
		b1.showBuy();
		System.out.println("판매자1");
		s1.showSeller();
		System.out.println("판매자2");
		s2.showSeller();
		
	}

}
