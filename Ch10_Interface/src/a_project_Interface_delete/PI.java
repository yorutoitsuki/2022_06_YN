package a_project_Interface_delete;


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
	
	private final int testNumber = 2;
	private boolean Booladdress = true;//주소확인용 트리거
	private boolean Boolphone = true;//번호확인용 트리거
	@Override
	public void input() {
		//관리 가능한 범위 확인
		if(PersonIndex == p.length) {
			System.out.println("\n****관리 할 수 있는 범위를 초과합니다****\n");
			return;
		}
		
		//이름 저장
		System.out.print("이름?");
		String name = MenuViewer.sc.nextLine();
		//이름 저장 완료
		
		//주민번호 저장
		String serialNumber;
		String frontNumber;
		String backNumber;
		while(true) {
			System.out.println("주민등록 번호 앞자리?");
			frontNumber = MenuViewer.sc.nextLine().trim();
			if(frontNumber.length()!=testNumber) {
				System.out.println("번호확인 부탁드립니다");
				continue;
			}
			//숫자를 넣었는지 문자를 넣었는지 확인
			try {
				Integer.parseInt(frontNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("번호확인 부탁드립니다.");
				continue;
			}
			
			System.out.println("주민등록 번호 뒷자리?");
			backNumber = MenuViewer.sc.nextLine().trim();
			if(backNumber.length()!=testNumber) {
				System.out.println("번호확인 부탁드립니다");
				continue;
			}
			//숫자를 넣었는지 문자를 넣었는지 확인
			try {
				Integer.parseInt(backNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("번호 확인 부탁드립니다.");
				continue;
			}
			serialNumber = frontNumber.concat("-"+backNumber);
			if(search(serialNumber)) {
				System.out.println("이미 등록된 번호입니다");
				return;
			}
			
			break;
		}//주민 번호 저장 완료
		
		
		//전화번호 저장, 위쪽에서 사용한 변수 재사용
		String phoneNumber = "";
		String middleNumber;
		Boolphone = true;//전화번호 유무 확인용 트리거
		while(true) {
			System.out.println("전화 번호 앞자리? 없으면 0을 입력");
			frontNumber = MenuViewer.sc.nextLine().trim();
			//트리거
			if(frontNumber.equals("0")) {
				Boolphone = false;
				break;
			}//트리거 완료
			if(frontNumber.length()!=testNumber) {
				System.out.println("번호확인 부탁드립니다");
				continue;
			}
			
			
			try {//숫자를 넣었는지 문자를 넣었는지 확인
				Integer.parseInt(frontNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("앞번호 확인 부탁드립니다.");
				continue;
			}

			System.out.println("전화 번호 중간 자리?");
			middleNumber = MenuViewer.sc.nextLine().trim();
			if(middleNumber.length()!=testNumber) {
				System.out.println("번호확인 부탁드립니다");
				continue;
			}
			try {//숫자를 넣었는지 문자를 넣었는지 확인
				Integer.parseInt(middleNumber);
			} catch (NumberFormatException e) {
				MenuViewer.sc.nextLine();
				System.out.println("중간자리 번호 확인 부탁드립니다.");
				continue;
			}

			System.out.println("전화 번호 뒷자리?");
			backNumber = MenuViewer.sc.nextLine().trim();
			if(backNumber.length()!=testNumber) {
				System.out.println("번호확인 부탁드립니다");
				continue;
			}
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
		
		Booladdress = true;
		System.out.println("주소를 입력, 없으면 0");
		String address = MenuViewer.sc.nextLine();
		if(address == "0") {
			Booladdress = false;
		}
		addPerson(name, serialNumber, phoneNumber, address);
	}
	
	private void addPerson(String name, String serialNumber, String phoneNumber, String address) {
		if(Booladdress && Boolphone) {
			p[PersonIndex] = new Person4(name, serialNumber, phoneNumber, address);
		}
		else if (Booladdress) {
			p[PersonIndex] = new Person3(name, serialNumber, address);
		}
		else if (Boolphone) {
			p[PersonIndex] = new Person2(name, serialNumber, phoneNumber);
		}
		else {
			p[PersonIndex] = new Person(name, serialNumber);
		}
		PersonIndex++;
	}

	//고객 저장시 중복 확인
	private boolean search(String number) {
		if(PersonIndex == 0) {//저장되어 있지 않으면 바로 종료
			return false;
		}
		for(int i = 0; i < p.length; i ++) {
			if(p[i] == null) {
				break;
			}
			if( p[i].getSerialNumber().equals(number)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void search() {
		if(PersonIndex == 0) {
			System.out.println("\n****저장된 고객정보 없음****\n");
			return;
		}
		System.out.print("주민 등록번호로 검색을 합니다. 주민등록 번호 입력 > ");
		String keyWord = MenuViewer.sc.nextLine().trim();
		String[] temp = keyWord.split("-");
		if(temp.length > 2) {
			System.out.println("주민 등록 번호 재확인 해주세요");
			return;
		}
		keyWord = String.join("", temp);
		
		System.out.println(search2(keyWord));
	}
	
	private String search2(String keyWord) {
		for(int i = 0; i < p.length; i ++) {
			if(p[i] == null) {
				break;
			}
			String check = String.join("", p[i].getSerialNumber().split("-"));
			if(check.equals(keyWord)) {
				if(p[i] instanceof Person4) {
					return ((Person4)p[i]).toString();
				}
				else if(p[i] instanceof Person3) {
					return ((Person3)p[i]).toString();
				}
				else if(p[i] instanceof Person2) {
					return ((Person2)p[i]).toString();
				}
				else {
					return (p[i]).toString();
				}
			}
		}
			return "\n****일치하는 고객 없음****\n";
	}
	
	private int searchDelete(String number) {
		if(PersonIndex == 0) {//저장되어 있지 않으면 바로 종료
			return -1;
		}
		for(int i = 0; i < p.length; i ++) {
			if(p[i] == null) {
				break;
			}
			if( String.join("", p[i].getSerialNumber().split("-")).equals(number)) {
				return i;
			}
		}
		return -1;
	}
	
	private void deleteFn(int indexNumber) {
		System.out.println("삭제되는 정보 " + p[indexNumber]);
		for(int i = indexNumber; i < p.length; i++) {
			if(p[i] == null) {
				return;
			}
			if(i == (p.length -1)) {
				p[i] = null;
				return;
			}
			p[i] = p[i+1];
		}
	}
	
	@Override
	public void delete() {
		if(p[0] == null) {
			System.out.println("\n*****저장된 고객 정보 없음*****\n");
			return;
		}
		System.out.println("삭제 하고싶은 주민등록번호");
		String keyWord = MenuViewer.sc.nextLine().trim();
		keyWord = String.join("", keyWord.split("-"));
		try {
			Integer.parseInt(keyWord);
		} catch (NumberFormatException e) {
			System.out.println("주민등록번호를 확인해주세요");
			return;
		}
		int indexNumber = searchDelete(keyWord);
		if(indexNumber < 0) {
			System.out.println("\n****해당하는 고객 없음****\n");
			return;
		}
		else {
			deleteFn(indexNumber);
			PersonIndex--;
		}
	}
	
}
