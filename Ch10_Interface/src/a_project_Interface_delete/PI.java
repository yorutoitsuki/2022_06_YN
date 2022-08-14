package a_project_Interface_delete;

class Person {// 이름과 주민등록번호를 가진 고객 클래스
	// private : 고객 정보를 보안하기 위해
	// 이름
	private String name;
	// 주민번호
	private String serialNumber;

	Person(String name, String serialNumber) {
		super();
		this.name = name;
		this.serialNumber = serialNumber;
	}

	// 메서드 추가
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
	}// 이름, 주민등록번호, 전화번호를 가진 고객 클래스
		// 멤버변수 추가
		// 전화번호

	// 메서드 추가
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "\n[ 이름 : " + super.getName() + ", 주민등록 번호 : " + super.getSerialNumber() + ", 전화번호 : " + phoneNumber
				+ " ]\n";
	}
}

class Person3 extends Person {
	private String address;
	// 멤버변수 추가
	// 주소

	public Person3(String name, String serialNumber, String address) {
		super(name, serialNumber);
		this.address = address;
	}

	// 메서드 추가
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

	// 멤버변수 추가
	// 전화번호
	// 주소
	public Person4(String name, String serialNumber, String phoneNumber, String address) {
		super(name, serialNumber);
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	// 메서드 추가
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "\n[ 이름 : " + super.getName() + ", 주민등록 번호 : " + super.getSerialNumber() + ", 전화번호 : " + phoneNumber
				+ ", 주소 : " + address + " ]\n";
	}
}




/*
 * 중복되거나 가독성이 떨어지는 코드는 전부 함수로 치환하여 밑에 따로 빼놓았습니다.
 * 함수가 어떻게 작성 되었는지 보고 싶으면 ctrl + 왼쪽 클릭
 * 함수가 쓰인 곳을 알고 싶으면 함수 이름에 마우스를 클릭하면
 * 오른쪽 슬라이드 바 에서 표시되는 지점이 있습니다, 그곳이 함수가 쓰인곳 입니다.
 */
public class PI implements P {// PI : 고객 클래스를 관리하는 '매니저 클래스'(이 클래스만 외부에 알리면 됨)
//	private ArrayList<Person> person;
	private Person[] p;
	private int PersonIndex = 0;

	public PI(int personNum) {
//		person = new ArrayList<>();
		p = new Person[personNum];// 고객수 만큼 배열 객체 생성
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void input() {
		if(p.length == PersonIndex) {
			System.out.println("\n****관리 범위를 초과합니다****\n");
			return;
		}
		////////////////////////////////////////////////////////////////////////////////////////////
		String name = "0";// 이름 저장 시작
		while(name.equals("0")) {
			System.out.println("이름?");
			name = name(); 
		}// 이름 저장 끝
		////////////////////////////////////////////////////////////////////////////////////////////
		String serialNumber = makeKeyWord();//makeKeyWord 함수를 통해 주민등록번호를 입력받음
		// 중복 확인 검사
		if (serialNumberIndex(serialNumber) >= 0) {
			System.out.println("이미 등록된 번호입니다");
			return;
		} // 중복 확인 종료
		// 주민 등록 번호 저장 종료
		////////////////////////////////////////////////////////////////////////////////////////////
		// 전화 번호 저장 시작
		String phoneNumber = phoneNumber();
		if (!phoneNumber.equals("0")) {// skip을 하지 않았으면 0대신 전화번호가 저장됨
			phoneNumber = phoneNumber.concat("-" + phoneNumber).concat("-" + phoneNumber);
		}
		// 전화번호 저장완료
		////////////////////////////////////////////////////////////////////////////////////////////
		// 주소 저장 시작
		String address;
		while (true) {
			System.out.println("주소를 입력, skip은 0");
			address = MenuViewer.sc.nextLine();
			if (address.equals("0")) {//주소 스킵 확인
				break;// skip
			}
			if (addressCheck(address)) {//주소에 "-",공백 문자 외 특수문자 존재하는지 검색
				continue;
			}
			break;// 성공적으로 저장되었으면 반복문 탈출
		} // 주소 저장 끝
			////////////////////////////////////////////////////////////////////////////////////////////
		Person temp = inputFinalStep(name, serialNumber, phoneNumber, address);// 최종 단계, 입력을 바탕으로 임시 객체 생성
		while (true) {
			System.out.println(showPersonToString(temp));
			System.out.println("고객 정보가 맞습니까? Y/N");
			String YorN = MenuViewer.sc.nextLine().trim().toLowerCase();
			switch (YorN) {
			case "y":
				p[PersonIndex] = temp;
				PersonIndex++;
				System.out.println("저장 되었습니다.");
				return;
			case "n":
				System.out.println("재입력을 위해 메인으로 돌아갑니다");
				return;
			default:
				System.out.println("Y 또는 N을 입력해주세요");
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void search() {
		if(emptyCheck()) {
			return;
		}
		while (true) {
			String keyWord = makeKeyWord();
			for (int i = 0; i < p.length; i++) {
				if (p[i] == null) {
					break;
				}
				if (p[i].getSerialNumber().equals(keyWord)) {
					System.out.println(showPersonToString(p[i]));
					return;
				}
			}
			System.out.println("일치하는 고객 없음");
			return;
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void delete() {
		if(emptyCheck()) {
			return;
		}
		System.out.println("삭제 하고 싶은 고객의 주민 번호 입력");
		int index = serialNumberIndex(makeKeyWord());
		//makeKeyWord 함수로 KeyWord 생성, 만들어진 KeyWord를 인덱스 검사 함수에 바로 전달, 인덱스 번호 획득
		if(index < 0) {
			System.out.println("일치하는 데이터가 없습니다. 메인으로 돌아갑니다");
			return;
		}
		while (true) {
			System.out.println(showPersonToString(p[index]));
			System.out.println("삭제 되는 데이터 입니다. 진행하겠습니까? Y/N");
			String YorN = MenuViewer.sc.nextLine().trim().toLowerCase();
			switch (YorN) {
			case "y":
				deleteSequence(index);
				System.out.println("삭제 되었습니다.");
				return;
			case "n":
				System.out.println("삭제를 취소합니다.");
				return;
			default:
				System.out.println("Y 또는 N을 입력해주세요");
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	// 비어있는지 없는지 확인
	private boolean emptyCheck() {
		if(PersonIndex == 0) {
			System.out.println("\n저장된 고객 정보 없음\n");
			return true;
		}
		return false;
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	// 주민 번호 index 확인용 함수, 중복 확인도 가능, 존재하지 않으면 -1을 반환, 반환받은게 0이상이면 존재(중복)
	private int serialNumberIndex(String serialNumber) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				break;
			}
			if (p[i].getSerialNumber().equals(serialNumber)) {
				return i;
			}
		}
		return -1;
	}// 주민 번호 index 확인용 끝
	////////////////////////////////////////////////////////////////////////////////////////////
	private String phoneNumber() {//전화번호 저장 함수
		while (true) {// 전화번호 앞자리 저장 시작
			String frontNumber;
			String rearNumber = "";
			String middleNumber = "";
			System.out.println("전화번호 첫번째 자리?(3자리) skip은 0");
			frontNumber = MenuViewer.sc.nextLine().trim();
			if (frontNumber.equals("0")) {// skip확인
				return "0";
			}
			if (frontNumber.length() != 3) {
				System.out.println("자릿수 확인해주세요(3자리)");
				continue;
			}
			if (isExceptionStringToNumber(frontNumber)) {// 숫자 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}// 전화번호 앞자리 저장 끝

			System.out.println("전화번호 중간 자리?(4자리) skip은 0");// 전화 번호 중간 자리 저장 시작
			middleNumber = MenuViewer.sc.nextLine().trim();
			if (middleNumber.equals("0")) {// skip확인
				return "0";
			}
			if (middleNumber.length() != 4) {
				System.out.println("자릿수 확인해주세요(4자리)");
				continue;
			}
			if (isExceptionStringToNumber(middleNumber)) {// 숫자 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}// 전화 번호 중간 자리 저장 끝

			System.out.println("전화번호 마지막 자리?(4자리) skip은 0");// 전화 번호 뒷자리 저장 시작
			rearNumber = MenuViewer.sc.nextLine().trim();
			if (rearNumber.equals("0")) {// skip확인
				return "0";
			}
			if (rearNumber.length() != 4) {
				System.out.println("자릿수 확인해주세요(4자리)");
				continue;
			}
			if (isExceptionStringToNumber(rearNumber)) {// 숫자 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}// 전화 번호 뒷자리 저장 끝
			return frontNumber.concat("-"+middleNumber).concat("-"+rearNumber);// 아무 문제 없이 통과 했으면 도달
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	private String name() {//이름 저장 함수
		String name = MenuViewer.sc.nextLine().trim();
		for (int i = 0; i < name.length(); i++) {// 특수문자, 숫자 입력 감지
			int temp = (int) name.charAt(i);//여러조건에서 연산이 발생하는 경우 미리 연산되는 값을 저장해 놓으면 연산 효율이 상승 
			if ((0 <= temp && temp <= 64) || (91 <= temp && temp <= 96) || (123 <= temp && temp <= 127)) {
				System.out.println("특수 문자와 숫자 입력은 불가능 합니다");
				return "0";
			}
		}
		return name;
	}//이름 저장함수 종료
	////////////////////////////////////////////////////////////////////////////////////////////
	// 주소 확인 함수 시작
	private boolean addressCheck(String address) {
		for (int i = 0; i < address.length(); i++) {// 특수문자 입력 감지
			int temp = (int) address.charAt(i);
			// if문에 들어가기 전 연산이 발생하는 경우, 따로 저장해 놓으면 추가 연산이 필요 없어지므로 연산 효율이 상승
			// 공백은 아스키 코드로 32
			if ((0 <= temp && temp <= 31)||(33 <= temp && temp <= 44) || (46 <= temp && temp <= 47) 
					|| (58 <= temp && temp <= 64)|| (91 <= temp && temp <= 96) || (123 <= temp && temp <= 127)) {
				System.out.println("경고 '-' 문자 제외 특수 문자입력은 불가능 합니다");
				return true;
			}
		}
		return false;
	}// 주소 확인 함수 끝
	////////////////////////////////////////////////////////////////////////////////////////////
	// 입력 문자의 숫자 확인하는 함수, 문제가 있으면 true, 없으면 false반환
	private boolean isExceptionStringToNumber(String number) {
		try {// 숫자 확인//숫자만 있지 않으면 예외 발생, 변환된 숫자를 저장할 필요는 없음 고로 변환된 숫자를 저장할 변수는 안적음
			if(Integer.parseInt(number)<0) {
				System.out.println("음수는 안됩니다.");
				return true;
			}
		} catch (NumberFormatException e) {
			System.out.println("입력된것 : " + number);
			System.out.println("숫자를 넣어주세요");
			return true;
		}
		return false;
	}// 무결성 함수 종료
	////////////////////////////////////////////////////////////////////////////////////////////
	// 저장 하는 마지막 단계 함수
	private Person inputFinalStep(String name, String serialNumber, String phoneNumber, String address) {
		if (address.equals("0") && phoneNumber.equals("0")) {
			return new Person(name, serialNumber);
		} else if (address.equals("0")) {
			return new Person2(name, serialNumber, phoneNumber);
		} else if (phoneNumber.equals("0")) {
			return new Person3(name, serialNumber, address);
		} else {
			return new Person4(name, serialNumber, phoneNumber, address);
		}
	}// 저장의 마지막 단계 함수 종료
	////////////////////////////////////////////////////////////////////////////////////////////
	// 데이터 확인용 함수
	private String showPersonToString(Person person) {
		if (person instanceof Person4) {
			return ((Person4) person).toString();
		} else if (person instanceof Person3) {
			return ((Person3) person).toString();
		} else if (person instanceof Person2) {
			return ((Person2) person).toString();
		} else {
			return (person).toString();
		}
	}// 데이터 확인용 함수 종료
	////////////////////////////////////////////////////////////////////////////////////////////
	private String makeKeyWord() {//저장, 조회, 삭제용 키워드 생성 시작
		while(true) {
			System.out.println("주민 등록 번호 앞자리 입력(7자리)");
			String frontNumber = MenuViewer.sc.nextLine();
			if (frontNumber.length() != 7) {
				System.out.println("7자리가 숫자가 아닙니다.");
				continue;
			}
			if(isExceptionStringToNumber(frontNumber)) {
				continue;
			}
			
			System.out.println("주민 등록 번호 뒷자리 입력(7자리)");
			String rearNumber = MenuViewer.sc.nextLine();
			if (rearNumber.length() != 7) {
				System.out.println("7자리 숫자가 아닙니다.");
				continue;
			}
			if(isExceptionStringToNumber(rearNumber)) {
				continue;
			}
			return frontNumber.concat("-"+rearNumber);
		}
	}//조회, 삭제용 키워드 생성 종료
	////////////////////////////////////////////////////////////////////////////////////////////
	private void deleteSequence(int index) {//삭제 함수 시작
		for(int i = index; i < p.length; i++) {//작동개념은 1번부터, 하지만 오류 발생방지와 효율적인 연산을 위해 작성은 3번부터 해야함
			if(index == p.length-1) {//3.i가 p.length-1과 같으면 배열이 끝나는곳, 예외 발생을 방지하기 위해서 가장 먼저 확인해야함
				p[i] = null;
			}
			if(p[i] == null) {//2.i번째 데이터를 덮어씌우다가 null을 만나면 그 이후의 데이터는 전부 null, 함수 종료
				break;
			}
			p[i] = p[i+1];//1.i번째 데이터를 i+1번째 데이터로 덮어씌움
		}
		PersonIndex--;
	}//삭제 함수 종료
	////////////////////////////////////////////////////////////////////////////////////////////
}
