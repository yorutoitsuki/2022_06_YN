package producttest;

import java.util.ArrayList;
import java.util.Scanner;

interface ProductInter{
	public static final int TV = 1, COMPUTER = 2, AUDIO = 3, REFUND = 4;
	
	static void buyerEnter(){
		System.out.println("구매자가 전자마트에 입장하셨습니다");
	}
	
	void menu();
}

abstract class Product{
	final String makeCountry = "대한민국";
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	abstract void show();
}

class TV extends Product{
	final String maker = "삼성";
	public TV() {
		super(200);
	}
	@Override
	void show() {
		System.out.println("TV 제조국 : " + makeCountry + ", TV 제조사 : " + maker +
				", TV 가격 : " + price + ", TV 보너스포인트 : " + bonusPoint);
	}
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	final String brand = "LG 그램";
	public Computer() {
		super(100);
	}
	@Override
	void show() {
		System.out.println("Computer 제조국 : " + makeCountry + ", Computer 브랜드 : " 
	+ brand + ", Computer 가격 : " + price + ", Computer 보너스포인트 : " + bonusPoint);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	public Audio() {
		super(50);
	}
	@Override
	void show() {
		System.out.println("Audio 제조국 : " + makeCountry + ", Audio 가격 : " + 
	price + ", Audio 보너스포인트 : " + bonusPoint);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money;
	int bonusPoint = 0;
	ArrayList<Product> item = new ArrayList<Product>();
	
	Buyer(int money){
		this.money = money;
	}
	
	void askInfo(Product p){
		System.out.println(p + " 제품에 대한 정보 부탁드립니다");
	}
	
	void buy(Product p) {
		if(p.price > this.money) {
			System.out.println("잔액이 부족하여 " + p + " 제품을 구매할 수 없습니다");
			return;
		}
		else {
			this.money -= p.price;
			this.bonusPoint += p.bonusPoint;
			item.add(p);
			System.out.println(p + "제품을(를) 구입하셨습니다");
		}
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			this.money += p.price;
			this.bonusPoint -= p.bonusPoint;
			System.out.println(p + " 제품을(를) 반품하셨습니다");
		}
		else {
			System.out.println("구입하신 제품은 저희 제품 목록 중에 없습니다");
		}
	}
	
	void summary() {
		if(item.isEmpty()) {
			System.out.println("구매자는 제품을 구매하지 않았습니다");
		}
		else {
			String itemList = "[ ";
			int totalPrice = 0;
			int tvCnt = 0, computerCnt = 0, audioCnt = 0;
			for(int i = 0; i < item.size(); i++) {
				Product temp = item.get(i);
				if(temp instanceof TV) {
					if(tvCnt == 0) {
						itemList += "TV, ";
					}
					tvCnt++;
				}
				else if(temp instanceof Computer) {
					if(computerCnt == 0) {
						itemList += "Computer, ";
					}
					computerCnt++;
				}
				else if(temp instanceof Audio) {
					if(audioCnt == 0) {
						itemList += "Audio, ";
					}
					audioCnt++;
				}
				totalPrice += temp.price;
			}
			itemList = itemList.substring(0, itemList.length() - 2);
			itemList += " ]";
			System.out.println("**********구입한 제품목록과 총금액**********");
			System.out.println("구매하신 제품은 " + itemList + " 이고\n구입하신 제품의 총 금액은 " + totalPrice + "만원 입니다");
		}
	}
}


public class ProductMain implements ProductInter {

	@Override
	public void menu() {
		System.out.println("**********가전제품 목록**********");
		System.out.println("1.TV\t2.Computer\t3.Audio\t\t4.환불");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Buyer b = new Buyer(1000);
		TV tv = new TV();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		ProductMain pm = new ProductMain();
		ProductInter.buyerEnter();
		while(b.money > 0) {
			System.out.println();
			pm.menu();
			System.out.print("원하시는 가전제품 번호 입력(단, 끝내려면 stop입력) > ");
			String inputString = sc.nextLine().trim().toUpperCase();
			if(inputString.equalsIgnoreCase("stop")) {
				break;
			}
			int selector = 0;
			try {
				selector = Integer.parseInt(inputString);
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값을 입력하셨습니다. For input String : " + inputString);
				continue;
			}
			switch(selector) {
			case TV:
				b.askInfo(tv);
				tv.show();
				b.buy(tv);
				break;
			case COMPUTER:
				b.askInfo(computer);
				computer.show();
				b.buy(computer);
				break;
			case AUDIO:
				b.askInfo(audio);
				audio.show();
				b.buy(audio);
				break;
			case REFUND:
				System.out.print("환불할 제품 입력(TV, Computer, Audio) > ");
				String refunding = sc.nextLine().trim().toLowerCase();
				switch(refunding) {
				case"tv":
					b.refund(tv);
					break;
				case"computer":
					b.refund(computer);
					break;
				case"audio":
					b.refund(audio);
					break;
				default:
					System.out.println("제품 확인 해주세요");
				}
				break;
			default:
				System.out.println("1~4 사이의 정수 또는 stop을 입력해주세요");
			}
		}
		System.out.println();
		System.out.println("---------가전제품 판매를 종료합니다--------------------------");
		b.summary();
		sc.close();
	}
}