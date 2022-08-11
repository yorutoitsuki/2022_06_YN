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
}

public class PI implements P {//PI : 고객 클래스를 관리하는 '매니저 클래스'(이 클래스만 외부에 알리면 됨)
	private ArrayList<Person> person;
	private Person[] p;
	
	public PI(int personNum) {
		person = new ArrayList<>();
		p = new Person[personNum];//고객수 만큼 배열 객체 생성
	}
	
	
	@Override
	public void input() {
		
	}

	@Override
	public void search() {
		
	}

}
