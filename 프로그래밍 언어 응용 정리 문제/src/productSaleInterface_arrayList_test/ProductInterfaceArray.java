package productSaleInterface_arrayList_test;

import java.util.ArrayList;
import java.util.Scanner;

//제품 인터페이스
interface ProductInterface {
	// 멤버변수 : 모두 상수(public static final 생략 되어 있음)
	int TV = 1;
	int COMPUTER = 2;
	int AUDIO = 3;
	int REFUND = 4;

	// 2. 메서드 : 미완성 추상 메서드(예외 1:static, default, private(1.9버전 이상부터))

	static void buyerEnter() {
		System.out.println("구매자가 전자마트에 입장하였습니다");
	}// 공유용,재정의 불가

	default void defaultMethod() {
	};// 필요하면 재정의

	// 이외는 1.8버전에서는 모두 미완성된 추상 메서드
	void menu();// public abstract 생략

}

abstract class Product {
	// 부모의 멤버 변수
	// 제조국가 = "korea"
	final String makeCountry = "korea";
	// 제품가격
	int productPrice;
	// 포인트 점수
	int bonusPoint;

	// 2.매개변수가 있는 생성자 : 가격이 있는 제품 생성
	public Product(int productPrice) {
		super();
		this.productPrice = productPrice;
		bonusPoint = (int) (productPrice / 10.0);
	}

	abstract void show();// 미완성된 추상 메서드 : 상속한 자식클래스에서 반드시 재정의
}// Product 클래스 끝

class TV extends Product {

	final String makeCompany = "SamSung";
	// 만든 회사 = "SamSung" 명시적 초기화 후 변경 불가

	public TV() {
		super(200);
	}

	public TV(int productPrice) {
		super(productPrice);
		bonusPoint = (int) (productPrice / 5.0);
	}

	@Override
	void show() {
		System.out.println("TV [makeCompany=" + makeCompany + ", 제조국=" + makeCountry + ", productPrice=" + productPrice
				+ ", bonusPoint=" + bonusPoint + "]");
	}

	@Override
	public String toString() {
		return "TV";
	}

}

class Computer extends Product {
	final String brand = "LG 그램";

	public Computer() {
		super(100);
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	void show() {
		System.out.println("Computer [제조국=" + makeCountry + ", productPrice=" + productPrice + ", bonusPoint="
				+ bonusPoint + ", brand=" + brand + "]");
	}

	@Override
	public String toString() {
		return "Computer";
	}

}

class Audio extends Product {

	public Audio() {
		super(50);
	}

	@Override
	void show() {
		System.out.println("Audio [makeCountry=" + makeCountry + ", productPrice=" + productPrice + ", bonusPoint="
				+ bonusPoint + "]");

	}

	@Override
	public String toString() {
		return "Audio";
	}
	

}

class Buyer {
	// 1. 멤버변수
	int money;// 돈
	int bonusPoint;// 구매자의 보너스 포인트

	// 구매자의 구매목록
	ArrayList<Product> list;

	// 2. 생성자
	Buyer(int money) {
		super();
		this.money = money;
		list = new ArrayList<Product>();
	}

	void askInfo(Product p) {
		System.out.println(p + "제품에 대한 정보 요청");
	}

	int productCnt = 0;

	void buy(Product p) {
		if (this.money < p.productPrice) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		list.add(p);
		this.money -= p.productPrice;
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구매하셨습니다");
	}

	void summary() {
		if (list.isEmpty()) {
			System.out.println("아무것도 구매하지 않으셨습니다");
			return;
		}
		int tvCnt = 0;
		int computerCnt = 0;
		int audioCnt = 0;
		int totalPrice = 0;
		String itemList = "[ ";
		for (int i = 0; i < list.size(); i++) {
			Product p = list.get(i);
			if (p instanceof TV) {
				if (tvCnt == 0) {
					itemList.concat("TV, ");
				}
				tvCnt++;
				totalPrice += p.productPrice;
			} else if (p instanceof Computer) {
				if (computerCnt == 0) {
					itemList.concat("Computer, ");
				}
				computerCnt++;
			} else if (p instanceof Audio) {
				if (audioCnt == 0) {
					itemList.concat("Audio, ");
				}
				audioCnt++;
			}
		}
		itemList = itemList.substring(0, itemList.length() - 2);
		itemList.concat(" ]");
		System.out.println("구매하신 상품은 " + itemList);
		System.out.println("총 구매하신 수량 : " + (tvCnt + computerCnt + audioCnt));
		System.out.println("총 금액 : " + totalPrice);
	}

	void refund(Product p) {
		if (list.isEmpty()) {
			System.out.println("아무것도 구매하지 않으셨습니다");
			return;
		}
		if (list.remove(p)) {
			this.money += p.productPrice;
			this.bonusPoint -= p.bonusPoint;
		} else {
			System.out.println("해당 제품을 구매하지 않으셨습니다");
		}
	}

	boolean emptyCheck() {
		return list.isEmpty();
	}

}

public class ProductInterfaceArray implements ProductInterface {

	@Override
	public void menu() {
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("1.TV\t2.Computer\t3.Audio\t 4.refund");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 키보드로부터 입력
		ProductInterfaceArray pi = new ProductInterfaceArray();
		// 1000만원 가진 구매자 생성
		Buyer buyer = new Buyer(1000);
		// 구매자가 전자마트에 입장
		ProductInterface.buyerEnter();
		// TV,Computer,Audio 객체 생성
		TV tv = new TV();
		Computer computer = new Computer();
		Audio audio = new Audio();

		// menu() 호출
		while (buyer.money > 0) {
			pi.menu();
			String choice = sc.nextLine().trim();
			if(choice.equals("stop")) {
				break;
			}
			switch (choice) {
			case "1":
				buyer.buy(tv);
				break;
			case "2":
				buyer.buy(computer);
				break;
			case "3":
				buyer.buy(audio);
				break;
			case "4":
				if(buyer.emptyCheck()) {
					System.out.println("아무것도 사지 않으셨습니다");
					break;
				}else {
					System.out.println("반품을 원하시는 제품은 무엇인가요?");
					String item = sc.nextLine().trim().toLowerCase();
					switch (item) {
					case "tv":
						buyer.refund(tv);
						break;
					case "computer":
						buyer.refund(computer);
						break;
					case "audio":
						buyer.refund(audio);
						break;
					default:
						System.out.println("해당 제품은 저희 매장에서 취급하지 않습니다");
					}
					sc.close();
				}
				break;
			default:
				System.out.println("1~4 사이 또는 stop만 입력해주세요");
			}
		}
		buyer.summary();

		sc.close();
	}
}
