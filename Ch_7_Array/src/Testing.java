import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int ame = 3000, latte = 4000, chino = 3500;
		int ameN = 0,latteN = 0,chinoN = 0, 
			amePay = 0, lattePay = 0, chinoPay = 0,
			totalN = 0, totalPay = 0, orderN = 0;
		boolean isFirst = true;
		
escape:	do{
			//-------------주문 확인
			System.out.println("메뉴(아메리카노(americano):3000원, 카페라떼(cafelatte):4000원, 카푸치노(cafuchino):3500원)중에서 주문");
			if(isFirst) {
				System.out.println("주문 하시겟습니까?, 주문을 하지 않으실려면 nope을 입력해주세요.");
			}else {
				System.out.println("추가 주문 또는 주문의 변경이 있습니까? 없으면 stop을,모든 주문의 취소는 nope을 입력해주세요");
			}
			
			String order = sc.next().trim().toLowerCase();
			boolean many = true;
			do {
				switch(order) {
				case"nope":
					totalN = 0;
					break escape;
				case"stop":
					break escape;
				case"ame":
				case"아메":
				case"americano":
				case"아메리카노":
					if(ameN>0) {
						System.out.println("아메리카노의 추가 주문 입니까? 주문 변경은 0, 취소는 음수를 넣어주세요");
						System.out.println("현재 아메리카노 " + ameN + " 잔 주문하셨습니다.");
					}else {
						System.out.println("아메리카노 주문 받았습니다. 몇잔 주문하시겠습니까? 주문 변경은 0을 입력해주세요");
					}
					orderN = sc.nextInt();
					if((ameN>=0)&&(ameN + orderN)<0) {
						System.out.println("아메리카노는 " + orderN + " 잔 이상 취소할 수 없습니다.");
						break;
					}else if(orderN > 0){
						System.out.println("아메리카노 " + orderN + " 잔 주문받았습니다.");
						ameN += orderN;
						amePay +=(ame * orderN);
						totalN +=orderN;
						totalPay +=(ame * orderN);
						many = false;
						break;
					}else if(orderN == 0) {
						System.out.println("주문을 변경하겠습니다.");
						many = false;
						break;
					}else if(orderN < 0) {
						System.out.println("아메리카노 " + -orderN +" 잔 취소하겠습니다.");
						ameN += orderN;
						amePay +=(ame * orderN);
						totalN +=orderN;
						totalPay +=(ame * orderN);
						many = false;
						break;
					}
				case"cafu":
				case"카푸":
				case"chino":
				case"치노":
				case"cafuchino":
				case"카푸치노":
					if(chinoN>0) {
						System.out.println("카푸치노의 추가 주문 입니까? 주문 변경은 0, 취소는 음수를 넣어주세요");
						System.out.println("현재 카푸치노 " + chinoN + " 잔 주문하셨습니다.");
					}else {
						System.out.println("카푸치노 주문 받았습니다. 몇잔 주문하시겠습니까? 주문 변경은 0을 입력해주세요");
					}
					orderN = sc.nextInt();
					if((chinoN>=0)&&(chinoN + orderN)<0) {
						System.out.println("카푸치노는 " + orderN + " 잔 이상 취소할 수 없습니다.");
						break;
					}else if(orderN > 0){
						System.out.println("카푸치노 " + orderN + " 잔 주문받았습니다.");
						chinoN += orderN;
						chinoPay +=(chino * orderN);
						totalN +=orderN;
						totalPay +=(chino * orderN);
						many = false;
						break;
					}else if(orderN == 0) {
						System.out.println("주문을 변경하겠습니다.");
						many = false;
						break;
					}else if(orderN < 0) {
						System.out.println("카푸치노 " + -orderN +" 잔 취소하겠습니다.");
						chinoN += orderN;
						chinoPay +=(chino * orderN);
						totalN +=orderN;
						totalPay +=(chino * orderN);
						many = false;
						break;
					}

				case"latte":
				case"라떼":
				case"cafelatte":
				case"카페라떼":
					if(latteN>0) {
						System.out.println("카페라떼의 추가 주문 입니까? 주문 변경은 0, 취소는 음수를 넣어주세요");
						System.out.println("현재 카페라떼 " + latteN + " 잔 주문하셨습니다.");
					}else {
						System.out.println("카페라떼 주문 받았습니다. 몇잔 주문하시겠습니까? 주문 변경은 0을 입력해주세요");
					}
					orderN = sc.nextInt();
					if((latteN>=0)&&(latteN + orderN)<0) {
						System.out.println("카페라떼는 " + orderN + " 잔 이상 취소할 수 없습니다.");
						break;
					}else if(orderN > 0){
						System.out.println("카페라떼 " + orderN + " 잔 주문받았습니다.");
						latteN += orderN;
						lattePay +=(latte * orderN);
						totalN +=orderN;
						totalPay +=(latte * orderN);
						many = false;
						break;
					}else if(orderN == 0) {
						System.out.println("주문을 변경하겠습니다.");
						many = false;
						break;
					}else if(orderN < 0) {
						System.out.println("카페라떼 " + -orderN +" 잔 취소하겠습니다.");
						latteN += orderN;
						lattePay +=(latte * orderN);
						totalN +=orderN;
						totalPay +=(latte * orderN);
						many = false;
						break;
					}
				default:
					System.out.println("메뉴에 없습니다.");
					many = false;
				}
			}while(many);
			isFirst = false;
		}while(true);

		String payment = "";
		if(totalN > 0) {
			System.out.println("-------------payment------------------------");
			if(ameN > 0) {
				payment+=("아메리카노 " + ameN + " 잔\t" + amePay + "\t원, ");
			}
			if(chinoN > 0) {
				payment+=("카푸치노 " + chinoN + " 잔\t" + chinoPay + "\t원, ");
			}
			if(latteN > 0) {
				payment+=("카페라떼 " + latteN + " 잔\t" + lattePay + "\t원, ");
			}
			System.out.println(payment.substring(0, payment.length()-2)+"\n");
			System.out.println("총\t" + totalN + " 잔\t" + totalPay + "\t원");
			System.out.println("-------------payment------------------------");
		}else {
			System.out.println("안녕히 가세요");
		}
//		if(totalN > 0) {
//			System.out.println("-------------payment------------------------");
//			if(ameN > 0) {
//				System.out.print("아메리카노 " + ameN + " 잔\t" + amePay + "\t원, ");
//			}
//			if(chinoN > 0) {
//				System.out.print("카푸치노 " + chinoN + " 잔\t" + chinoPay + "\t원, ");
//			}
//			if(latteN > 0) {
//				System.out.print("카페라떼 " + latteN + " 잔\t" + lattePay + "\t원, ");
//			}
//			System.out.println("총\t" + totalN + " 잔\t" + totalPay + "\t원");
//			System.out.println("-------------payment------------------------");
//		}else {
//			System.out.println("안녕히 가세요");
//		}
		
		sc.close();
	}

}
