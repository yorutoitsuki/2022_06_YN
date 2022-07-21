package fruit_test;

public class Seller {
	final int ApplePrice;
	private int NumOfApple;
	private int Money;
	
	Seller(int price, int numOfApple, int money){
		this.Money = money;
		this.NumOfApple = numOfApple;
		this.ApplePrice = price;
	}
	
	Seller(int price){
		this.ApplePrice = price;
		this.NumOfApple = 100;
	}
	
	int Selling(int Money) {
		if(NumOfApple == 0) {
			System.out.println("Sold Out");
			return 0;
		}
		if(Money < ApplePrice) {
			System.out.println("Not Enough Money");
			return 0;
		}
		int many = (Money / ApplePrice);
		if(many > this.NumOfApple) {
			System.out.println("I can sell only " + NumOfApple);
			return 0;
		}
		this.Money += (many * ApplePrice);
		this.NumOfApple -= many;
		return many;
	}
	
	int Selling(int money, int many) {
		if(NumOfApple == 0) {
			System.out.println("Sold Out");
			return 0;
		}
		if(many > this.NumOfApple) {
			System.out.println("I can sell only " + NumOfApple);
			return 0;
		}
		if(money < (many * ApplePrice)) {
			System.out.println("Not Enough Money");
			return 0;
		}else {
			this.Money += (many * ApplePrice);
			this.NumOfApple -= many;
			return many;
		}
	}
		
	void get_NumOfApple() {
		System.out.println("NumOfApple : " + NumOfApple);
	}
	
	void get_Money() {
		System.out.println("NumOfApple : " + Money);
	}
	
	void ShowSellerInfo() {
		System.out.println("Apple Price : " + ApplePrice);
		get_NumOfApple();
		get_Money();
	}
}
