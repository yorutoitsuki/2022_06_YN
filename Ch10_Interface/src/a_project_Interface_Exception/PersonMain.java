/*
 * 홍대표는 기다리지 않고 프로젝트를 수행해 나간다
 */
package a_project_Interface_Exception;


public class PersonMain {
//	public static void main(String[] args) throws PersonSizeException//예외처리 방법 2
//	JVM에게 예외를 처리하도록 던지면 e.printStackTrace();호출한 결과로 처리 후 프로그램이 종료
	public static void main(String[] args) {
		
		int personNum = 0;
		
		while(true) {
			try {
				System.out.print("저장할 고객수 > ");
				personNum = MenuViewer.sc.nextInt();
				if(personNum < 1) {
					System.out.println("1이상의 수를 넣어주세요");
					continue;
				}
				break;
			} catch (Exception e) {
				MenuViewer.sc.nextLine();
				System.out.println("정수만 입력");
				continue;
			}
		}
		/*
		 * 홍대표는 a회사에서 알려준 '매니저 클래스'만 알면 된다.
		 * 
		 * 부모 인터페이스 = 구현한 자손클래스 객체
		 * '매니저 클래스'로 객체 생성하고 인터페이스 P로 대입받음
		 * (PI객체가 자동으로 P타입으로 형변환되어 받아들임)
		 */
		MenuViewer.sc.nextLine();
		P p = new PI(personNum);
		while(true) {
			MenuViewer.showMenu();
			String temp = MenuViewer.sc.nextLine().trim();
			int choice = -1;
			if(temp.equals("1")||temp.equals("2")||temp.equals("3")||temp.equals("4")) {
				choice = Integer.parseInt(temp);
			}
			switch(choice) {
			case P.INPUT:
				try {
					p.input();
				} catch (PersonSizeException e) {
					if(e instanceof PersonSizeException) {
						System.out.println(((PersonSizeException)e).getMessage());
					}
				} catch (NumberFormatException e1) {
					//continue 여부와 관계없이 finally는 무조건 실행됨
				} catch (Exception e2) {
					
				}
				break;
			case P.SEARCH:
				p.search();
				break;
			case P.EXIT:
				System.out.println("프로그램을 종료합니다");
				return;
//				System.exit(0);//강제종료
			case P.DELETE:
				p.delete();
				break;
			default:
				System.out.println("\n****1~4사이의 정수를 입력해주세요****\n");
			}
		}
		
	}

}
