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
		return "[ 이름 : " + super.getName() + ", 주민등록 번호 : " + super.getSerialNumber() +
				", 전화번호 : " + getPhoneNumber() + ", 주소 : " + getAddress() + " ]";
	}
	
}

public class PI implements P {//PI : 고객 클래스를 관리하는 '매니저 클래스'(이 클래스만 외부에 알리면 됨)
	private ArrayList<Person> person;
	private Person[] p;
	private int PersonIndex = 0;
	
	public PI(int personNum) {
		person = new ArrayList<>();
		p = new Person[personNum];//고객수 만큼 배열 객체 생성
	}
	
	
	@Override
	public void input() {
		if(PersonIndex == p.length) {
			System.out.println("관리 할 수 있는 범위를 초과합니다");
			return;
		}
		System.out.print("이름?");
		String name = MenuViewer.sc.next();
		
		String serialNumber;
		while(true) {
			System.out.println("주민등록 번호?");
			serialNumber = MenuViewer.sc.next();
			String[] serialCheckTemp = serialNumber.trim().split("-");
			if(serialCheckTemp.length>2) {
				System.out.println("주민등록번호를 재확인 해주세요");
				continue;
			}
			int check = 0;
			for(String temp:serialCheckTemp) {
				try {
					check = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("주민등록번호를 재확인 해주세요");
					check = 0;
					break;
				}
			}
			if(check > 0) {
				break;
			}
		}
		
		String phoneNumber;
		boolean Boolphone = true;
		while(true) {
			System.out.println("전화번호 입력, 없으면 0");
			phoneNumber = MenuViewer.sc.next();
			String[] phoneNumberTemp = phoneNumber.trim().split("-");
			if(phoneNumberTemp[0] == "0") {
				Boolphone = false;
				break;
			}
			if(phoneNumberTemp.length>3) {
				System.out.println("전화 번호를 재확인 해주세요");
				continue;
			}
			int check = 0;
			for(String temp:phoneNumberTemp) {
				try {
					check = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("전화 번호를 재확인 해주세요");
					check = 0;
					break;
				}
			}
			if(check > 0) {
				break;
			}
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
		System.out.print("주민 등록번호로 검색을 합니다. 주민등록 번호 입력 > ");
		String keyWord = MenuViewer.sc.next();
		boolean match = false;
		for(int i = 0; i < p.length; i ++) {
			if(p[i] == null) {
				break;
			}
			if(p[i].getSerialNumber().equals(keyWord)) {
				if(p[i] instanceof Person4) {
					
				}
			}
		}
	}

}
