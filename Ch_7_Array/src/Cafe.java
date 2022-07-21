import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int ame = 3000, latte = 4000, cafu = 3500;
		int ameN = 0, latteN = 0, cafuN = 0, amePay = 0, lattePay = 0, cafuPay = 0, orderN = 0, totalN = 0,
				totalPay = 0;
		esc: do {
			System.out.println();
			System.out.println("메뉴 : 아메리카노 3000 원, 카페라떼 4000 원, 카푸치노 3500 원");
			if(totalN > 0) {
				System.out.println("추가 주문 또는 주문 변경이 있습니까?(stop = 추가 주문 없음)(no = 모든 주문 취소)");
			}else {
				System.out.println("주문하시겠습니까? 주문하지 않으실려면 no를 입력해주세요");
			}
			
			
			String order = sc.next().trim().toLowerCase();
			boolean howMany = true;
			do {
				switch (order) {
				case "ame":
				case "americano":
				case "아메리카노":
					System.out.println("아메리카노 주문받았습니다. 몇잔 주문하시겠습니까?");
					System.out.println("주문의 변경은 0 입니다.");

					orderN = sc.nextInt();

					if (orderN == 0) {
						System.out.println("주문 변경 하겠습니다.");
						howMany = false;
						break;
					} else if (ameN + orderN < 0) {
						System.out.println(-orderN + " 만큼 주문 취소는 불가능 합니다.");
						System.out.println("현재 아메리카노의 주문 수량은 " + ameN + "입니다");
						break;
					} else if (orderN > 0) {
						System.out.println("아메리카노 " + orderN + " 잔 주문 받았습니다.");
						ameN += orderN;
						amePay += (orderN * ame);
						totalN += orderN;
						totalPay += (orderN * ame);
						howMany = false;
						break;
					} else if (orderN < 0) {
						System.out.println("아메리카노 " + -orderN + " 잔 주문 취소하겠습니다.");
						ameN += orderN;
						amePay += (orderN * ame);
						totalN += orderN;
						totalPay += (orderN * ame);
						howMany = false;
						break;
					}
				case"카푸치노":
				case"cafu":
				case"chino":
				case"cafuchino":
					System.out.println("카푸치노 주문받았습니다. 몇잔 주문하시겠습니까?");
					System.out.println("주문의 변경은 0 입니다.");

					orderN = sc.nextInt();

					if (orderN == 0) {
						System.out.println("주문 변경 하겠습니다.");
						howMany = false;
						break;
					} else if (cafuN + orderN < 0) {
						System.out.println(-orderN + " 만큼 주문 취소는 불가능 합니다.");
						System.out.println("현재 카푸치노의 주문 수량은 " + cafuN + "입니다");
						break;
					} else if (orderN > 0) {
						System.out.println("카푸치노 " + orderN + " 잔 주문 받았습니다.");
						cafuN += orderN;
						cafuPay += (orderN * cafu);
						totalN += orderN;
						totalPay += (orderN * cafu);
						howMany = false;
						break;
					} else if (orderN < 0) {
						System.out.println("카푸치노 " + -orderN + " 잔 주문 취소하겠습니다.");
						cafuN += orderN;
						cafuPay += (orderN * cafu);
						totalN += orderN;
						totalPay += (orderN * cafu);
						howMany = false;
						break;
					}
				case"latte":
				case"cafelatte":
				case"라떼":
				case"카페라떼":
					System.out.println("카페라떼 주문받았습니다. 몇잔 주문하시겠습니까?");
					System.out.println("주문의 변경은 0 입니다.");

					orderN = sc.nextInt();

					if (orderN == 0) {
						System.out.println("주문 변경 하겠습니다.");
						howMany = false;
						break;
					} else if (latteN + orderN < 0) {
						System.out.println(-orderN + " 만큼 주문 취소는 불가능 합니다.");
						System.out.println("현재 카페라떼의 주문 수량은 " + latteN + "입니다");
						break;
					} else if (orderN > 0) {
						System.out.println("카페라떼 " + orderN + " 잔 주문 받았습니다.");
						latteN += orderN;
						lattePay += (orderN * latte);
						totalN += orderN;
						totalPay += (orderN * latte);
						howMany = false;
						break;
					} else if (orderN < 0) {
						System.out.println("카페라뗴 " + -orderN + " 잔 주문 취소하겠습니다.");
						latteN += orderN;
						lattePay += (orderN * latte);
						totalN += orderN;
						totalPay += (orderN * latte);
						howMany = false;
						break;
					}
				case "no":
					totalN = 0;
					break esc;
				case "stop":
					break esc;
				default:
					System.out.println("메뉴에 없습니다.");
					howMany = false;
				}

			} while (howMany);

		} while (true);

		String result = "";
		if (totalN > 0) {
			System.out.println("--------------payment------------------");
			if (ameN > 0) {
				result += ("아메리카노 " + ameN + " 잔 " + amePay + " 원\n");
			}
			if (latteN > 0) {
				result += ("카페라떼 " + latteN + " 잔 " + lattePay + " 원\n");
			}
			if (cafuN > 0) {
				result += ("카푸치노 " + cafuN + " 잔 " + cafuPay + " 원\n");
			}
			System.out.println(result);
			System.out.println("주문한 음료 총 " + totalN + " 잔\t총합 " + totalPay + " 원");
			System.out.println("--------------payment------------------");
		} else {
			System.out.println("안녕히가세요");
		}

		sc.close();

	}

}
