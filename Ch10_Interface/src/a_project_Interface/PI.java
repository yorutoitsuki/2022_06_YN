package a_project_Interface;

import java.util.ArrayList;

/*
 * PI클래스는 P인터페이스를 구현함.
 * 
 */

class Person {//이름과 주민등록번호를 가진 고객 클래스
	//private : 고객 정보를 보안하기 위해
	//이름
	private String name;
	//주민번호
	private String serialNumber;
	
	Person(String name, String serialNumber) {
		super();
		this.name = name;
		this.serialNumber = serialNumber;
	}
	
	//메서드 추가
	String getName() {
		return name;
	}
	String getSerialNumber() {
		return serialNumber;
	}
	@Override
	public String toString() {
		return "\n[ 이름 : " + name + ", 주민등록 번호 : " + serialNumber + " ]\n";
	}
}

class Person2 extends Person {
	private String phoneNumber;
	Person2(String name, String serialNumber, String phoneNumber) {
		super(name, serialNumber);
		this.phoneNumber = phoneNumber;
	}//이름, 주민등록번호, 전화번호를 가진 고객 클래스
	//멤버변수 추가
	//전화번호
	
	//메서드 추가
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public String toString() {
		return "\n[ 이름 : " + super.getName() + ", 주민등록 번호 : " + super.getSerialNumber() +
				", 전화번호 : " + phoneNumber + " ]\n";
	}
}

class Person3 extends Person {
	private String address;
	//멤버변수 추가
	//주소

	public Person3(String name, String serialNumber, String address) {
		super(name, serialNumber);
		this.address = address;
	}
	//메서드 추가
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "\n[ 이름 : " + super.getName() + ", 주민등록 번호 : " + super.getSerialNumber() + ", 주소 : " + address + " ]\n";
	}
}

class Person4 extends Person {
	private String phoneNumber;
	private String address;
	//멤버변수 추가
	//전화번호
	//주소
	public Person4(String name, String serialNumber, String phoneNumber, String address) {
		super(name, serialNumber);
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	//메서드 추가
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "\n[ 이름 : " + super.getName() + ", 주민등록 번호 : " + super.getSerialNumber() +
				", 전화번호 : " + phoneNumber + ", 주소 : " + address + " ]\n";
	}
	
}

public class PI implements P {//PI : 고객 클래스를 관리하는 '매니저 클래스'(이 클래스만 외부에 알리면 됨)
//	private ArrayList<Person> person;
	private Person[] p;
	private int PersonIndex = 0;
	
	public PI(int personNum) {
//		person = new ArrayList<>();
		p = new Person[personNum];//고객수 만큼 배열 객체 생성
	}
	
	
	@Override
	public void input() {
		//관리 가능한 범위 확인
		if(PersonIndex == p.length) {
			System.out.println("\n****관리 할 수 있는 범위를 초과합니다****\n");
			return;
		}
		
		//이름 저장
		System.out.print("이름?");
		String name = MenuViewer.sc.next();
		//이름 저장 완료
		
		//주민번호 저장
		String serialNumber;
		String frontNumber;
		String backNumber;
		while(true) {
			System.out.println("주민등록 번호 앞자리?");
			frontNumber = MenuViewer.sc.next();
			//숫자를 넣었는지 문자를 넣었는지 확인
			try {
				Integer.parseInt(frontNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("번호확인 부탁드립니다.");
				continue;
			}
			
			System.out.println("주민등록 번호 뒷자리?");
			backNumber = MenuViewer.sc.next();
			//숫자를 넣었는지 문자를 넣었는지 확인
			try {
				Integer.parseInt(backNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("번호 확인 부탁드립니다.");
				continue;
			}
			serialNumber = frontNumber.concat("-"+backNumber);
			break;
		}//주민 번호 저장 완료
		
		//전화번호 저장, 위쪽에서 사용한 변수 재사용
		String phoneNumber = "";
		String middleNumber;
		boolean Boolphone = true;//전화번호 유무 확인용 트리거
		while(true) {
			System.out.println("전화 번호 앞자리? 없으면 0을 입력");
			frontNumber = MenuViewer.sc.next();
			//트리거
			if(frontNumber.equals("0")) {
				Boolphone = false;
				break;
			}//트리거 완료
			
			
			try {//숫자를 넣었는지 문자를 넣었는지 확인
				Integer.parseInt(frontNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("앞번호 확인 부탁드립니다.");
				continue;
			}

			System.out.println("전화 번호 중간 자리?");
			middleNumber = MenuViewer.sc.next();
			try {//숫자를 넣었는지 문자를 넣었는지 확인
				Integer.parseInt(middleNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("중간자리 번호 확인 부탁드립니다.");
				continue;
			}

			System.out.println("번화 번호 뒷자리?");
			backNumber = MenuViewer.sc.next();
			
			try {//숫자를 넣었는지 문자를 넣었는지 확인
				Integer.parseInt(backNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("뒷자리번호 확인 부탁드립니다.");
				continue;
			}
			phoneNumber = frontNumber.concat("-"+middleNumber).concat("-"+backNumber);
			break;
		}
		
		boolean Booladdress = true;
		System.out.println("주소를 입력, 없으면 0");
		String address = MenuViewer.sc.next();
		if(address.charAt(0) == '0') {
			Booladdress = false;
		}
		
		if(Booladdress && Boolphone) {
			p[PersonIndex] = new Person4(name, serialNumber, phoneNumber, address);
			PersonIndex++;
		}
		else if (Booladdress) {
			p[PersonIndex] = new Person3(name, serialNumber, address);
			PersonIndex++;
		}
		else if (Boolphone) {
			p[PersonIndex] = new Person2(name, serialNumber, phoneNumber);
			PersonIndex++;
		}
		else {
			p[PersonIndex] = new Person(name, serialNumber);
			PersonIndex++;
		}
	}

	@Override
	public void search() {
		if(p[0] == null) {
			System.out.println("\n****저장된 고객정보 없음****\n");
			return;
		}
		System.out.print("주민 등록번호로 검색을 합니다. 주민등록 번호 입력 > ");
		String keyWord = MenuViewer.sc.next().trim();
		String[] temp = keyWord.split("-");
		if(temp.length > 2) {
			System.out.println("주민 등록 번호 재확인 해주세요");
			return;
		}
		keyWord = String.join("", temp);
		
		for(int i = 0; i < p.length; i ++) {
			if(p[i] == null) {
				break;
			}
			String tempA[] = p[i].getSerialNumber().split("-");
			String check = String.join("", tempA);
			if(check.equals(keyWord)) {
				if(p[i] instanceof Person4) {
					System.out.println((Person4)p[i]);
				}
				else if(p[i] instanceof Person3) {
					System.out.println((Person3)p[i]);
				}
				else if(p[i] instanceof Person2) {
					System.out.println((Person2)p[i]);
				}
				else if(p[i] instanceof Person) {
					System.out.println(p[i]);
				}
				return;
			}
		}
			System.out.println("일치하는 번호 없음");
	}

}
