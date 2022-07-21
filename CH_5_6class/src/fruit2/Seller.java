package fruit2;

public class Seller {
	//1.속성 : 멤버변수 = 필드(field) (기본값 -> 명시적값 -> 생성자)
	//간판이름
	final String panel;
	int money;//돈
	private int numOfApple;//판매 가능한 사과 수
	//static final int APPLE_PRICE = 1000;
	private final int apple_price;
	private final int firstMoney;
	private final int firstNumOfApple;
	
	//2.생성자
	
	
	public Seller(String panel, int money, int numOfApple, int apple_price) {
		super();
		this.panel = panel;
		this.money = money;
		this.numOfApple = numOfApple;
		this.apple_price = apple_price;
		this.firstMoney = money;
		this.firstNumOfApple = numOfApple;
	}



	@Override
	public String toString() {
		return panel;
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
		System.out.println("판매 후 남은 사과 수 : " + numOfApple);
		System.out.println("판매한 사과수 : " + (firstNumOfApple - numOfApple));
		System.out.println("판매자가 가진 기존 돈(=원금) : " + firstMoney);
		System.out.println("판매자의 수익1 : " + (money - firstMoney));
		System.out.println("판매자의 수익2 : " + getMargin());
		System.out.println("판매자가 가진 전체 돈 : " + money);
	}


	public int getMargin() {
		return (money - firstMoney);
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

	public void answer() {
		System.out.println(apple_price + "원 입니다");
	}

	public int getApple_price() {
		return apple_price;
	}
}
