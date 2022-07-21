package ifswitch;

import java.util.Scanner;

public class Cafe4 {


	public static void main(String[] args) {
		/**
		 * [과제] 출력결과 stop 입력받으면 아메리카노 2잔에 6000원, 카페라떼 1잔에 4000원(주의 : ,콤마 없어요~~) 총 3잔, 총
		 * 가격은 10000원 입니다.
		 */

		// System.out.println("--do~while문 카페 주문 처리 시작-------------------------------");
		Scanner sc = new Scanner(System.in);

		String order = null;

		final int priceAmericano = 3000, priceCaferate = 4000, priceCafuchino = 3500;// 가격 변경 불가

		int cntAmericano = 0;// 아메리카노 주문 횟수
		int cntCaferate = 0;// 카페라떼 주문 횟수
		int cntCafuchino = 0;// 카푸치노 주문 횟수

		int totalPrice = 0;// 총 지불 가격
		int totalCnt = 0;// 총 주문 횟수

		do {
			System.out.print("------메뉴------------------\n" + "아메리카노(=Americano) 3000원\n" + "카페라떼              4000원\n"
					+ "카푸치노              3500원\n" + "주문종료              stop\n" + "주문안함    주문안함(=NoOrder)\n"
					+ "-------------------------\n" + "--손님 주문해주세요> ");

			order = sc.next().trim().toLowerCase();

			if (order.equalsIgnoreCase("NoOrder") || order.equals("주문안함"))
				break;

			switch (order) {
			case "아메리카노":
			case "americano":
				System.out.println(order + "를 주문하셨습니다.");

				System.out.print("-- 몇 잔을 주문하시겠습니까? > ");
				cntAmericano = sc.nextInt();
				if (cntAmericano > 0) {
					System.out.println(order + " " + cntAmericano + "잔을 주문하셨습니다.");
				} else {
					System.out.println("0보다 큰 수를 입력해주세요~");
				}

				totalCnt += cntAmericano;
				totalPrice += (cntAmericano * priceAmericano);

				break;

			case "카페라떼":
				System.out.println(order + "를 주문하셨습니다.");

				System.out.print("-- 몇 잔을 주문하시겠습니까? > ");
				cntCaferate = sc.nextInt();
				if (cntCaferate > 0) {
					System.out.println(order + " " + cntCaferate + "잔을 주문하셨습니다.");
				} else {
					System.out.println("0보다 큰 수를 입력해주세요~");
				}

				totalCnt += cntCaferate;
				totalPrice += (cntCaferate * priceCaferate);

				break;

			case "카푸치노":
				System.out.println(order + "를 주문하셨습니다.");

				System.out.print("-- 몇 잔을 주문하시겠습니까? > ");
				cntCafuchino = sc.nextInt();
				if (cntCafuchino > 0) {
					System.out.println(order + " " + cntCafuchino + "잔을 주문하셨습니다.");
				} else {
					System.out.println("0보다 큰 수를 입력해주세요~");
				}

				totalCnt += cntCafuchino;
				totalPrice += (cntCafuchino * priceCafuchino);

				break;

			case "stop":
				System.out.println("그만 주문하겠습니다.");
				/*
				 * System.out.println("---------영수증------------------------------"); String
				 * result = ""; if(cntAmericano>=1) { result +=
				 * "아메리카노 "+cntAmericano+"잔에 "+(priceAmericano*cntAmericano)+"원, ";
				 * //if(cntCaferate>=1 || cntCafuchino>=1) System.out.print(", ");//, 처리 }
				 * 
				 * if(cntCaferate>=1) { result +=
				 * "카페라떼 "+cntCaferate+"잔에 "+(priceCaferate*cntCaferate)+"원, ";
				 * //if(cntCafuchino>=1) System.out.print(", ");//, 처리 }
				 * 
				 * if(cntCafuchino>=1) { result +=
				 * "카푸치노 "+cntCafuchino+"잔에 "+(priceCafuchino*cntCafuchino)+"원, "; }
				 * 
				 * System.out.println(result.substring(0, result.length()-2));
				 * System.out.println("\n총 "+ totalCnt +"잔, 총 가격 = "+ totalPrice +"원");
				 * 
				 * 
				 * System.out.println("---------영수증------------------------------");
				 * 
				 */
				break;// switch문 빠져나감

			default:
				System.out.println("메뉴에 없습니다.");// break;
			}// switch문 끝

		} while (!order.equalsIgnoreCase("stop"));
		// }while(order.toLowerCase().compareTo("stop") != 0);

		if (!(order.equalsIgnoreCase("NoOrder") || order.equals("주문안함"))&&(totalPrice>0)) {
			System.out.println("---------[영수증]------------------------------");
			String result = "";
			if (cntAmericano >= 1) {
				result += "아메리카노 " + cntAmericano + "잔에 " + (priceAmericano * cntAmericano) + "원, ";
				// if(cntCaferate>=1 || cntCafuchino>=1) System.out.print(", ");//, 처리
			}

			if (cntCaferate >= 1) {
				result += "카페라떼 " + cntCaferate + "잔에 " + (priceCaferate * cntCaferate) + "원, ";
				// if(cntCafuchino>=1) System.out.print(", ");//, 처리
			}

			if (cntCafuchino >= 1) {
				result += "카푸치노 " + cntCafuchino + "잔에 " + (priceCafuchino * cntCafuchino) + "원, ";
			}
			if ((result.length()) > 0) {
				System.out.println(result.substring(0, result.length() - 2));
			}

			System.out.println("\n총 " + totalCnt + "잔, 총 가격 = " + totalPrice + "원");

			System.out.println("---------[영수증]------------------------------");
		}

		// System.out.println("--do~while문 카페 주문 처리 끝--------------------------------");

	}

}

