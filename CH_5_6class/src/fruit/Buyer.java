package fruit;

public class Buyer {
	//1. 속성 : 멤버변수 = 필드(filed) (기본값)
	int money; //돈(기본값 -> 명시적인 값)
	int numOfApple;//사과 바구니
	//2. 생성자 : 멤버변수(=필드)에 값을 채워 객체 생성
	
	public Buyer(int money) {
		super();
		this.money = money;
		//numOfApple : 기본값 0 으로 채워짐
	}
	public Buyer(int money2, int numOfApple) {
		super();
		//this. 생략하는 이유 1 : 같은 클래스안에 있으므로,
		//이유2 : 멤버변수와 매개변수가 이름이 달라서 구분이 되므로
		money = money2;
		this.numOfApple = numOfApple;
		//this. 자기 자신의 주로소 해당 객체 안에 존재
	}
	public Buyer() {
	}
	//3. 기능 : 메서드
	void buy(Seller s, int money) {
		numOfApple += s.sale(money);
		this.money -= money;
	}
	//사과의 갯수도 지정
	void buy(Seller s, int money, int many) {
		if(money > this.money) {
			System.out.println("Not Enough money");
		}else {
			int get = s.sale(money, many);
			if(get == 0) {
				System.out.println("Oops sorry");
			}else {
				this.money -= (s.apple_price * many);
				this.numOfApple += many;
			}
		}
		
	}
	
	void showBuy() {
		System.out.println("가진 사과 수 : " + numOfApple);
		System.out.println("가진 전체 돈 : " + money);
	}
	public int getNumOfApple() {
		return numOfApple;
	}
	public void setNumOfApple(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	
}
