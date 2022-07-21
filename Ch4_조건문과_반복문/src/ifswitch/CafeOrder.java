package ifswitch;

import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isNextOrder = true;
		boolean hadOrdered = false;
		final int amePrice = 3000, lattePrice = 4000, cafuPrice = 3500;
		int amePay = 0, lattePay = 0, cafuPay = 0;
		int ameN = 0, latteN = 0, cafuN = 0;
		int orderN = 0, totalpay = 0, totalorderN = 0;
		boolean isFirst = true;
		do{
			//-------------주문 확인
			System.out.println("메뉴(Americano:3000원, 카페라떼:4000원, 카푸치노:3500원)중에서 주문");
			if(isFirst) {
				System.out.println("주문하시겠습니까? 주문을 하지 않으실거면 noorder를 입력해주세요");
			}else {
				System.out.println("더 주문하시겠습니까? 추가 주문이 없으시면 stop을 입력해주세요");
				System.out.println("모든 주문을 취소하실려면 noorder를 입력해주세요");
			}
			String order = sc.next().trim().toLowerCase();
			if(order.equalsIgnoreCase("noorder")) {
				hadOrdered = false;
				break;
			}
			//--------------주문 확인
			boolean many = true;
			do {
				switch(order) {
				case "stop":
					isNextOrder = false;
					many = false;
					break;
				case "아메리카노":
				case "americano":
					hadOrdered = true;
					System.out.println("몇잔 주문 하시겠습니까?");
					orderN = sc.nextInt();
					if(orderN<1) {
						System.out.println("1잔 이상 주문해주시길 바랍니다.");
						continue;
					}
					ameN += orderN;
					amePay +=(amePrice * orderN);
					totalorderN += orderN;
					totalpay += (amePrice * orderN);
					System.out.println(order + " " + orderN +" 잔 주문받았습니다.");
					many = false;
					break;
				case "카페라떼":
					hadOrdered = true;
					System.out.println("몇잔 주문 하시겠습니까?");
					orderN = sc.nextInt();
					if(orderN<1) {
						System.out.println("1잔 이상 주문해주시길 바랍니다.");
						continue;
					}
					latteN += orderN;
					lattePay +=(lattePrice * orderN);
					totalorderN += orderN;
					totalpay += (lattePrice * orderN);
					System.out.println(order + " " + orderN +" 잔 주문받았습니다.");
					many = false;
					break;
				case "카푸치노":
					hadOrdered = true;
					System.out.println("몇잔 주문 하시겠습니까?");
					orderN = sc.nextInt();
					if(orderN<1) {
						System.out.println("1잔 이상 주문해주시길 바랍니다.");
						continue;
					}
					cafuN += orderN;
					cafuPay +=(cafuPrice * orderN);
					totalorderN += orderN;
					totalpay += (cafuPrice * orderN);
					System.out.println(order + " " + orderN +" 잔 주문받았습니다.");
					many = false;
					break;
				default:
					System.out.println(order+" 는 메뉴에 없습니다");
					many = false;
				}
			}while(many);
			
			isFirst = false;
			System.out.println("");
		}while(isNextOrder);
		
		

		String result = "";
		if(hadOrdered) {
			System.out.println("-------Payment-----------");
			if(ameN>0) {
				result += ("아메리카노 " + ameN + " 잔 " + amePay + " 원, ");
			}
			if(latteN>0) {
				result += ("카페라떼 " + latteN + " 잔 " + lattePay + " 원, ");
			}
			if(cafuN>0) {
				result += ("카푸치노 " + cafuN + " 잔 " + cafuPay + " 원, ");
			}
			System.out.println();
			System.out.println("총 " + totalorderN + " 잔, 총 가격 = " + totalpay + "원");
			System.out.println(result.substring(0, result.length()-2));
			System.out.println("-------Payment-----------");
		}else {
			System.out.println("안녕히 가세요");
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
