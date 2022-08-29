package productSaleInterface_arrayList;

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
	//1. 멤버변수
	int money;//돈
	int bonusPoint;//구매자의 보너스 포인트
	
	//구매자의 구매목록
	ArrayList<Product> list;
//	Product[] list = new Product[10];
	
	//2. 생성자
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
		if(p.productPrice > this.money) {//잔액 확인
			System.out.println("잔액 부족");
			return;//잔액 부족 main으로 복귀
		}
		else {
//			for(int i = 0; i < list.length; i++) {
//				if(list[i] == null) {//list에서 비어 있는곳이 있으면
//					list[i] = p;
//					this.money -= p.productPrice;
//					this.bonusPoint += p.bonusPoint;
//					System.out.println(p + " 구매완료");
//					return;//list에 저장, 잔액 감소, 보너스 적립 완료, 복귀
//				}
//			}
//			//list에서 비어 있는 곳이 없으면
//			System.out.println("더이상 구매하실 수 없습니다");
			if(productCnt == 10) {
				System.out.println("더이상 구매하실 수 없습니다");
				return;
			}
			else {
				list.add(p);
				productCnt++;
				this.money -= p.productPrice;
				this.bonusPoint += p.bonusPoint;
				System.out.println(p + " 구매완료");
			}
		}
	}
	
	void summary() {
		if(list.size() == 0) {
			System.out.println("아무것도 구매하지 않으셨습니다");
			return;
		}
		int tvCnt = 0;
		int computerCnt = 0;
		int audioCnt = 0;
		int totalPrice = 0;
//		String buyList = "";
		String productList = "";
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof TV) {
				tvCnt++;
//				buyList = addingTotalList(tvCnt, list[i].toString(), buyList);
			}
			else if(list.get(i) instanceof Computer) {
				computerCnt++;
//				buyList = addingTotalList(computerCnt, list[i].toString(), buyList);
			}
			else if(list.get(i) instanceof Audio) {
				audioCnt++;
//				buyList = addingTotalList(audioCnt, list[i].toString(), buyList);
			}
			totalPrice += list.get(i).productPrice;
		}
		if(tvCnt > 0) {
			productList += "TV, ";
		}
		if(computerCnt > 0) {
			productList += "Computer, ";
		}
		if(audioCnt > 0) {
			productList += "Audio, ";
		}
		productList = productList.substring(0, productList.length()-2);
		System.out.println("구매하신 제품은 [ " + productList + "] 이고");
//		System.out.println("구매하신 제품은 [" + buyList + "] 이고");
		System.out.println("총 구매액은 " + totalPrice + "입니다");
		if(tvCnt > 0) {
			System.out.println("TV " + tvCnt + "대");
		}
		if(computerCnt > 0) {
			System.out.println("Computer " + computerCnt + "대");
		}
		if(audioCnt > 0) {
			System.out.println("Audio " + audioCnt + "대");
		}
		System.out.println("총 " +(tvCnt + computerCnt + audioCnt) + "대 입니다");
	}
	
//	private String addingTotalList(int cnt, String product, String buyList) {
//		if(cnt == 1) {
//			if(buyList.length() > 1) {
//				buyList +=",";
//			}
//			return buyList += " " + product;
//		}
//		else {
//			return buyList;
//		}
//	}
	void refund(Product p) {
		//해당 제품을 목록에서 찾아서 있으면 제거
		if(list.isEmpty()) {
			System.out.println("구매하신 제품이 없으십니다");
			return;
		}else if(list.remove(p)) {
			this.money += p.productPrice;
			this.bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품 완료");
		}
		else {
			System.out.println("해당 제품은 구매하지 않으셨습니다");
		}
		//환불 받은 돈을 구매자의 돈에 추가
		//구매자의 보너스 포인트는 감소
		
		//해당 제품을 목록에서 찾았는데 없으면
		
	}
	
}

public class ProductInterfaceArray implements ProductInterface {
	
	@Override
	public void menu() {
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("1.TV\t2.Computer\t3.Audio");
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//키보드로부터 입력
		
		//1000만원 가진 구매자 생성
		Buyer b=new Buyer(1000);
		//구매자가 전자마트에 입장
		ProductInterface.buyerEnter();
		
		//TV,Computer,Audio 객체 생성
		TV tv=new TV();
		Computer com=new Computer();
		Audio audio=new Audio();
		
		//menu() 호출
		ProductInterfaceArray pi = new ProductInterfaceArray();
		
		while(b.money != 0) {
			pi.menu();
			
			//재정의-1(예)
			//ProductInterfaceArray pi2 = (ProductInterfaceArray) pi.menu2();
			//ProductInterfaceArray pi2 = pi.menu2();//강제형변환하는 번거로움이 사라져 편리함
			
			System.out.print("구매하고 싶은 가전제품 번호 입력. 반품은 4 종료는 stop>");
			//정수 1~3(O), 1보다 작은 수 or 3보다 큰수(x) / 실수1.23(x)  문자 a ㅁ(x) / stop StOp
			String tmp = sc.nextLine();
			
			//stop StOp
			if(tmp.equalsIgnoreCase("stop")) break;
			
			//실수1.23(x)  문자 a ㅁ(x)
			int num = 0;//지역변수 초기화
			try {
				num = Integer.parseInt(tmp);
			} catch (NumberFormatException e) {				
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println(e.getMessage());//예외메세지 출력
				continue;//반복문의 제일 위로
			}
			
			//정수 1~3(O), 1보다 작은 수 or 3보다 큰수(x)
			//방법-1			
			if(!(1<=num && num<=4)) {
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요~");
				continue;//반복문의 제일 위로
			}
			
			switch(num) {
			case ProductInterface.TV :      b.askInfo(tv); 
			                           		b.buy(tv); 
			                           		break;
			case ProductInterface.COMPUTER :b.askInfo(com);			                      
									        b.buy(com);
									        break;
			case ProductInterface.AUDIO :   b.askInfo(audio);			                      
									        b.buy(audio);
									        break;
			case ProductInterface.REFUND:
				System.out.println("환불 하실려는 제품의 이름을 입력해주세요");
				String refundRequest = sc.nextLine().trim().toLowerCase();
				switch(refundRequest) {
				case"tv":
					b.refund(tv);
					break;
				case"computer":
					b.refund(com);
					break;
				case"audio":
					b.refund(audio);
					break;
				default:
					System.out.println("구입하신 제품은 저희 매장 제품이 아닙니다.");
				}
            //방법-2
			//default : System.out.println("잘못된 번호입니다. 다시 입력해 주세요~");
                     //break;				        
			}//switch문 끝
			
		}//while문 끝
		System.out.println("\n************** 가전제품 판매 종료 ****************");
		
		b.summary();
		sc.close();

	}
}
