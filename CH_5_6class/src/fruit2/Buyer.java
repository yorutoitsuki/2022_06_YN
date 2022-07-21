package fruit2;

public class Buyer {
	//1. 속성 : 멤버변수 = 필드(filed) (기본값)
	private int firstMoney;//구매자가 처음 가진 돈(=원금)
	private int money; //현재 잔액 = 구매자가 처음가진돈 - 사과를 구매한 돈
	
	int firstNumOfApple; //구매자의 초기 사과수
	int numOfApple;//구매자의 초기 사과수 + 구매한 사과수
	//2. 생성자 : 멤버변수(=필드)에 값을 채워 객체 생성
	
	public Buyer(int money) {
		super();
		this.money = money;
		firstMoney = money;
		//numOfApple : 기본값 0 으로 채워짐
	}
	public Buyer(int money2, int numOfApple) {
		super();
		//this. 생략하는 이유 1 : 같은 클래스안에 있으므로,
		//이유2 : 멤버변수와 매개변수가 이름이 달라서 구분이 되므로
		money = money2;
		firstMoney = money2;
		this.numOfApple = numOfApple;
		firstNumOfApple = numOfApple;
		//this. 자기 자신의 주로소 해당 객체 안에 존재
	}
	public Buyer() {
	}
	//3. 기능 : 메서드
	void askApplePrice(Seller s) {
		System.out.println("Apple Price is " + s.getApple_price());
	}
	
	void buy(Seller s, int money) {
		if(money > this.money) {
			System.out.println("Over budget");
		}else {
			int get = s.sale(money);
			numOfApple += get;
			this.money -= (get * s.getApple_price());
		}
	}
	//사과의 갯수도 지정
	void buy(Seller s, int money, int many) {
		if(money > this.money) {
			System.out.println("Over budget");
		}else {
			int get = s.sale(money, many);
			if(get == 0) {
				System.out.println("Oops sorry");
			}else {
				this.money -= (s.getApple_price() * many);
				this.numOfApple += many;
			}
		}
		
	}
	
	void askNumOfApple(Seller s) {
		System.out.println(s.getNumOfApple());
	}
	
	void showBuy() {
		System.out.println("구매한 사과수 : " + (numOfApple - firstNumOfApple));
		System.out.println("구매한 처음 가진 돈(=원금) : " + firstMoney);
		System.out.println("구매자가 사과를 구매한 돈 : " + (firstMoney - money));
		System.out.println("현재 잔액 : " + money);
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
