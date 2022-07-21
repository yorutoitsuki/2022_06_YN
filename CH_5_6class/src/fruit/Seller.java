package fruit;

public class Seller {
	//1.속성 : 멤버변수 = 필드(field) (기본값 -> 명시적값 -> 생성자)
	int money;//돈
	int numOfApple;//판매 가능한 사과 수
	//static final int APPLE_PRICE = 1000;
	final int apple_price;
	
	//2.생성자
	
	
	public Seller(int money, int numOfApple, int apple_price) {
		super();
		this.money = money;
		this.numOfApple = numOfApple;
		this.apple_price = apple_price;
	}



	//3. 기능 : 메서드
	//돈을 받아 받은 돈 맠므의 사과를 돌려준다.
	int sale(int money){
		int numOfSale = money/apple_price;
		
		numOfApple -= numOfSale;//받은 돈 만큼 판매자의 돈은 증가
		this.money += money;//판매한 사과수 만큼 판매자의 사과수는 감소
		
		return numOfSale;//구매자에게 사과수를 리턴
	}
	int sale(int money,int many){
		if(money < (many * apple_price)) {
			System.out.println("not enough money");
			return 0;
		}
		
		numOfApple -= many;//받은 돈 만큼 판매자의 돈은 증가
		this.money += (many * apple_price);//판매한 사과수 만큼 판매자의 사과수는 감소
		
		return many;//구매자에게 사과수를 리턴
	}
	
	void showSeller() {
		System.out.println("소지금 : " + money);
		System.out.println("사과 재고 : " + numOfApple);
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public int getNumOfApple() {
		return numOfApple;
	}



	public void setNumOfApple(int numOfApple) {
		this.numOfApple = numOfApple;
	}



	public int getApple_price() {
		return apple_price;
	}
}
