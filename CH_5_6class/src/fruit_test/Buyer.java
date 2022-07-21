package fruit_test;

public class Buyer {
	int Money;
	int NumOfApple;
	
	Buyer(){};
	
	Buyer(int money){
		this.Money = money;
	}
	Buyer(int money, int NumOfApple){
		this.Money = money;
		this.NumOfApple = NumOfApple;
	}
	
	void Buy(Seller s,int Money, int many){
		if(this.Money < Money) {
			System.out.println("Over budget");
		}else {
			int Get = s.Selling(Money, many);
			if(Get == 0) {
				System.out.println("Oops sorry");
			}else {
				this.Money -= (s.ApplePrice * many);
				NumOfApple += many;
			}
		}
	}
	
	void SetMoney(int Money) {
		this.Money = Money;
	}
	
	void GetMoney() {
		System.out.println("I have money : " + Money);
	}
	
	void SetNumOfApple(int many) {
		this.NumOfApple = many;
	}
	
	void GetNumOfApple() {
		System.out.println("I have Apple : " + NumOfApple);
	}
	
	void ShowBuyer() {
		GetMoney();
		GetNumOfApple();
	}
	
	
}
