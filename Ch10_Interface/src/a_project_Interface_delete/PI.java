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
			System.out.println("관리 범위를 초과합니다");
			return;
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("이름?");// 이름 저장 시작
		String name = MenuViewer.sc.nextLine().trim();
		for (int i = 0; i < name.length(); i++) {// 특수문자, 숫자 입력 감지
			int temp = (int) name.charAt(i);// if문에 들어가기 전 연산이 발생하는 경우, 따로 저장해 놓으면 추가 연산이 필요 없어지므로 연산 효율이 상승
			if ((0 <= temp && temp <= 64) || (91 <= temp && temp <= 96) || (123 <= temp && temp <= 127)) {
				System.out.println("특수 문자와 숫자 입력은 불가능 합니다");
				return;
			}
		} // 이름 저장 끝
			////////////////////////////////////////////////////////////////////////////////////////////
		String frontNumber;
		String rearNumber;
		while (true) {// 주민 등록 번호 앞자리 저장 시작
			System.out.println("주민 등록 번호 앞자리?(7자리)");
			frontNumber = MenuViewer.sc.nextLine().trim();
			if (numberIntegrityCheck(frontNumber)) {// 숫자 무결성 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}
			if (frontNumber.length() != 7) {
				System.out.println("7자리 숫자가 필요합니다");
				continue;
			}
			break;
		} // 주민 등록 번호 앞자리 저장 끝

		while (true) {// 주민 등록 번호 뒷자리 저장 시작
			System.out.println("주민 등록 번호 뒷자리?(7자리)");
			rearNumber = MenuViewer.sc.nextLine().trim();
			if (numberIntegrityCheck(rearNumber)) {// 숫자 무결성 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}
			if (rearNumber.length() != 7) {
				System.out.println("7자리 숫자가 필요합니다");
				continue;
			}
			break;
		} // 주민 등록 번호 뒷자리 저장 끝

		////////////////////////////////////////////////////////////////////////////////////////////
		// 중복 확인 검사
		String serialNumber = frontNumber.concat("-" + rearNumber);
		if (serialNumberPK(serialNumber)) {
			System.out.println("이미 등록된 번호입니다");
			return;
		} // 중복 확인 종료
		// 주민 등록 번호 저장 종료
		////////////////////////////////////////////////////////////////////////////////////////////

		// 전화 번호 저장 시작
		String middleNumber = "";
		while (true) {// 전화번호 앞자리 저장 시작
			System.out.println("전화번호 첫번째 자리?(3자리) skip은 0");
			frontNumber = MenuViewer.sc.nextLine().trim();
			if (frontNumber.equals("0")) {// skip확인
				break;
			}
			if (numberIntegrityCheck(frontNumber)) {// 숫자 무결성 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}
			if (frontNumber.length() != 3) {
				System.out.println("자릿수 확인해주세요(3자리)");
				continue;
			} // 전화번호 앞자리 저장 끝

			System.out.println("전화번호 중간 자리?(4자리) skip은 0");// 전화 번호 중간 자리 저장 시작
			middleNumber = MenuViewer.sc.nextLine().trim();
			if (middleNumber.equals("0")) {// skip확인
				frontNumber = "0";
				break;
			}
			if (numberIntegrityCheck(middleNumber)) {// 숫자 무결성 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}
			if (middleNumber.length() != 4) {
				System.out.println("자릿수 확인해주세요(4자리)");
				continue;
			} // 전화 번호 중간 자리 저장 끝

			System.out.println("전화번호 마지막 자리?(4자리) skip은 0");// 전화 번호 뒷자리 저장 시작
			rearNumber = MenuViewer.sc.nextLine().trim();
			if (rearNumber.equals("0")) {// skip확인
				frontNumber = "0";
				break;
			}
			if (numberIntegrityCheck(rearNumber)) {// 숫자 무결성 검사함수를 통하여 무결성 검사.
				continue;// 문제가 있으면 true를 반환, 문제가 없으면 false를 반환
			}
			if (rearNumber.length() != 4) {
				System.out.println("자릿수 확인해주세요(4자리)");
				continue;
			} // 전화 번호 뒷자리 저장 끝
			break;// 아무 문제 없이 통과 했으면 break에 도달, 전화 번호를 저장하는 반복문에서 탈출
		}
		////////////////////////////////////////////////////////////////////////////////////////////
		// 전화번호 skip 유무 판단
		String phoneNumber = "0";// skip을 하지 않았으면 0대신 전화번호가 저장됨
		if (!frontNumber.equals("0")) {
			phoneNumber = frontNumber.concat("-" + middleNumber).concat("-" + rearNumber);
		}
		// 전화번호 저장완료
		////////////////////////////////////////////////////////////////////////////////////////////
		// 주소 저장 시작
		String address;
		while (true) {
			System.out.println("주소를 입력, skip은 0");
			address = MenuViewer.sc.nextLine();
			if (address.equals("0")) {
				break;// skip
			}
			if (addressCheck(address)) {
				continue;
			}
			break;// 성공적으로 저장되었으면 반복문 탈출
		} // 주소 저장 끝
			////////////////////////////////////////////////////////////////////////////////////////////
		Person temp = inputFinalStep(name, serialNumber, phoneNumber, address);// 최종 단계, 입력을 바탕으로 저장하는 함수에 전달
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
		if(index < 0) {
			System.out.println("저장되어 있는 데이터가 없습니다. 메인으로 돌아갑니다");
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
	// 주민 번호 중복 확인용 함수
	private boolean serialNumberPK(String serialNumber) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				break;
			}
			if (p[i].getSerialNumber().equals(serialNumber)) {
				return true;
			}
		}
		return false;
	}// 주민 번호 중복 확인용 끝
	////////////////////////////////////////////////////////////////////////////////////////////
	// 주민 번호 index 확인용 함수
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
	// 주소 확인 함수 시작
	private boolean addressCheck(String address) {
		for (int i = 0; i < address.length(); i++) {// 특수문자, 숫자 입력 감지
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
	// 입력 문자의 숫자 무결성(Integrity) 확인하는 함수, 문제가 있으면 true, 없으면 false반환
	private boolean numberIntegrityCheck(String number) {
		try {// 숫자 확인//숫자만 있지 않으면 예외 발생, 변환된 숫자를 저장할 필요는 없음 고로 변환된 숫자를 저장할 변수는 안적음
			Double.parseDouble(number);
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
	private String makeKeyWord() {//조회, 삭제용 키워드 생성 시작
		while(true) {
			System.out.println("주민 등록 번호 앞자리 입력");
			String frontNumber = MenuViewer.sc.nextLine();
			if(numberIntegrityCheck(frontNumber)) {
				continue;
			}
			if (frontNumber.length() != 7) {
				System.out.println("7자리가 아닙니다.");
				continue;
			}
			System.out.println("주민 등록 번호 뒷자리 입력");
			String rearNumber = MenuViewer.sc.nextLine();
			if(numberIntegrityCheck(frontNumber)) {
				continue;
			}
			if (rearNumber.length() != 7) {
				System.out.println("7자리가 아닙니다.");
				continue;
			}
			return frontNumber.concat("-"+rearNumber);
		}
	}//조회, 삭제용 키워드 생성 종료
	////////////////////////////////////////////////////////////////////////////////////////////
	private void deleteSequence(int index) {//삭제 함수 시작
		for(int i = index; i < p.length; i++) {//작동개념은 1번부터, 하지만 오류 발생방지와 효율적인 연산을 위해 작성은 3번부터 해야함
			if(index == p.length) {//3.i+1이 p.length를 넘어가면 예외가 발생, 예외 발생을 방지하기 위해서 가장 먼저 확인해야함
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
