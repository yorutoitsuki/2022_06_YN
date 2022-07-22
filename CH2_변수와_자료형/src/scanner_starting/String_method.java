package scanner_starting;

import java.util.Scanner;

public class String_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String_method test = new String_method();
//		System.out.println(test);
//		System.out.println(test.toString());
//		
//		String s1 = " ";
//		String s2 = null; //null : only can insert on class-Type, no reference on class == null
//		
//		//2 ways to generate String
//		String str1 = "문자열 상수";
//		//1."문자열 상수"로 객체 생성 -> "공유 상수 풀"에 등록
//		String str2 = "문자열 상수";
//		String str3 = new String("문자열 상수");
//		System.out.println(str1);//str1 : String 객체의 주소 => 주소가 참조하는 값이 출력
//		//Object의 toString() 매서드를 대부분의 라이브러리 클래스에서는 재정의하여 우리에게 제공함
//		System.out.println(str1.toString());//
//				
//		if(str1 == str2)
//		{
//			System.out.println("같은 주소이므로 같은 문자열 객체를 참조한다");
//		}
//		else {
//			System.out.println("다른 주소이므로 다른 문자열 객체를 참조한다.");
//		}
//		if(str1 == str3)
//		{
//			System.out.println("같은 주소이므로 같은 문자열 객체를 참조한다");
//		}
//		else {
//			System.out.println("다른 주소이므로 다른 문자열 객체를 참조한다.");
//		}
//		if(str1.equals(str3)) {
//			System.out.println("same");
//		}
//		
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(0));
//		
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		
//		/*
//		 * 주소를 비교하는것은 중요하지 않음
//		 * 주소가 참조하는 객체의 값을 비교하는 것이 중요하다.
//		 * equals(Object 타입 매개변수) upcasting
//		 * equalsIgnoreCase(String string)
//		 */
//		
//		if(str1.equals(str2)) {
//			System.out.println("same char array");
//		}else {
//			System.out.println("not same char array");
//		}
//		
//		if(str1.equals(str3)) {
//			System.out.println("same char array");
//		}else {
//			System.out.println("not same char array");
//		}
//		
//		
//		if("AB".equals("ab")) {//equalsIgnoreCase대소문자 구분 무시
//			System.out.println("same char array, not Ignored Case");
//		}else {
//			System.out.println("not same char array, not Ignored Case");
//		}
//		
//		if("AB".equalsIgnoreCase("ab")) {//equalsIgnoreCase대소문자 구분 무시
//			System.out.println("same char array, Ignored Case");
//		}else {
//			System.out.println("not same char array, Ignored Case");
//		}
//		
//		/*
//		 * 
//		 */
//		
//		s1 = "AB";
//		s2 = "AC";
//		if(s1.compareTo("AC") == 0) {
//			System.out.println("same");
//		}else {
//			System.out.println(s1.compareTo("AC"));
//		}
//		if(s1.compareTo(s2) > 0) {
//			System.out.println("뒤의 문자열이 앞선다");
//		}else if(s1.compareTo(s2)<0) {
//			System.out.println("앞의 문자열이 앞선다");
//		}else {
//			System.out.println("두 문자열이 같다");
//		}
//		
//		if("ac".compareTo("ab") > 0) {
//			System.out.println("뒤의 문자열이 앞선다");
//		}else if("ac".compareTo("ab")<0) {
//			System.out.println("앞의 문자열이 앞선다");
//		}else {
//			System.out.println("두 문자열이 같다");
//		}
//		
//		if("ab".compareToIgnoreCase("AB") != 0)
//			System.out.println("Ignored case, same");
//		else
//			System.out.println("Ignored case, not same");
//		
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		
//		/*
//		 * concat()
//		 * catenate
//		 */
//		s1 = "everyone ";
//		String s = "get a rest";
//		s1 = s1.concat(s);
//		System.out.println(s1);
//		
//		/*
//		 * length()
//		 */
//		
//		System.out.println("\"hiru mesi\" 의 문자열 길이 = " + "hiru mesi".length());// ||
//		
//		
//		/*
//		 * indexof() : 찾고자 하는 해당문자열이 있으면
//		 *             해당문자열의 시작index번호를 결과로 돌려줌(없으면 -1 리턴)
//		 *             자바에서 index번호는 0부터 시작
//		 *             SQL에서 index번호는 1부터 시작(오라클 에서는 instr)
//		 */
//		int indexNumber = s1.indexOf("one");
//		System.out.println(indexNumber);
//		
//		System.out.println(s1.indexOf("test"));
//		
//		if(s1.indexOf("every") != -1) {
//			System.out.println("Words in sentence");
//		}else {
//			System.out.println("No words in sentence");
//		}
//		
//		/*
//		 * replace("기존","대체") : 다른 문자열로 대체하여 "하나의 새로운 문자열 객체" 생성
//		 */
//		
//		s2 = s1.replace('v','b');
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		s1 = s1.replace("rest", "work");
//		System.out.println(s1);
//		
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		System.out.println("---------------------------------");
//		
//		/*
//		 * trim() : 앞뒤 공백 제거
//		 */
//		String tel1 = "     010";
//		String tel2 = "1234    ";
//		String tel3 = "  5678  ";
//		
//		String tel = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();// ||
//		System.out.println(tel1);
//		System.out.println(tel2);
//		System.out.println(tel3);
//		System.out.println(tel);
//		
//		/*
//		 * toLowerCase() : 소문자로, toUpperCase() : 대문자로
//		 */
//		String str4 = "java";
//		String str5 = "JAVA";
//		String s4 = str4.toUpperCase();
//		System.out.println(s4);
//		if(str4.equals(str5)) {
//			System.out.println("same sentence");
//		}else {
//			System.out.println("not same sentence");
//		}
//		if(str4.equalsIgnoreCase(str5)) {
//			System.out.println("same sentence, Ignored case");
//		}else {
//			System.out.println("not same sentence, Ignored case");
//		}
//		
//		
//		if(str4.toUpperCase().equals(str5)) {
//			System.out.println("same");
//		}else {
//			System.out.println("not same");
//		}
//		
//		str5 = str5.toLowerCase();
//		System.out.println(str5);
//		
//		if(str4.toUpperCase().equalsIgnoreCase(str5)) {
//			System.out.println("same sentence, Ignored case");
//		}else {
//			System.out.println("not same sentence, Ignored case");
//		}
//		/*
//		 * 기본타입(int, double, char, boolean...)을 "문자열"로 변환하는 방법 - 2가지
//		 */
//		
//		//method 1 : valueOf()
//		int i = 10;
//		String str6 = String.valueOf(i);
//		System.out.println(str6.charAt(0));
//		char ch = str6.charAt(0);
//		System.out.println("ch = " + ch + ", ch의 코드값 = " + (int)ch);
//		
//		ch = String.valueOf(12.3).charAt(2);
//		System.out.println("ch = " + ch + ", ch의 코드값 = " + (int)ch);
//		
//		boolean b = true;
//		str6 = String.valueOf(b).substring(1);
//		System.out.println("true 의 부분 문자열 = " + str6);
//		
//		//자바 매서드 특징 : 매개변수가 2개이고 둘다 index 번호를 가진다면 
//		//(시작index, end_index+1)
//		
//		str6 = String.valueOf(b).substring(1,2+1);
//		System.out.println("true 의 부분 문자열 = " + str6);
//		
//		ch = String.valueOf(b).substring(2).charAt(0);
//		System.out.println("true 의 부분 문자 = " + ch);
//		
//		//method 2
//		int i2 = 10;
//		String str7 = i2 + "";
//		str7 = "" + 12.3;
//		str7 = false + "";
//		
//		System.out.println(str7.substring(1, 3+1));
//		System.out.println(str7.substring(1, 3+1).charAt(0));
//		System.out.println(str7.charAt(1));
//		/*
//		 * 문자열 => 기본타입으로 변환
//		 * 모든 기본 타입에는 1:1로 대응하는 Wrapper Class가 존재한다.
//		 * (예)int : Integer, double : Double, char : Character, boolean : Boolean....
//		 */
//		//Method 1. 각 Wrapper Class의 valueOf() 이용 : "문자열" => 해당 기본타입의 값으로 변환
//		//"정수나 실수 문자열"에 공백이 있으면 "*자동으로 공백 제거" 후 기본 타입으로 변환
//		//기본타입 = Wrapper Class (자동 언박싱 unboxing되어 대입됨)
//		double d3 = Double.valueOf("   12.3   ");//"12.3" => 객체(Double)12.3 => 자동 언박싱
//		System.out.println("d3+10 = " +(d3+10));
//		
//		d3 = Double.valueOf("   12.3   ");//"12.3" => 객체(Double)12.3 => 자동 언박싱
//		System.out.println("d3+10 = " +(d3+10));
//		
//		//Method 2. 각 Wrapper Class의 parse~()메서드 이용 :
//		//"문자열" => 해당 기본 타입의 값으로 변환
//		d3 = Double.parseDouble("  12.3   ".trim());//"12.3" => 12.3
//		System.out.println("d3+10 = " +(d3+10));
//		
//		d3 = Double.parseDouble("  12.3   ");//"12.3" => 12.3
//		System.out.println("d3+10 = " +(d3+10));
//		
//		int i3 = Integer.valueOf("10");
//		System.out.println("i3 + i2 = " +(i3 + i2));
//		
//		i3 = Integer.parseInt("10");
//		System.out.println("i3 + i2 = " +(i3 + i2));
//		
//		if(Boolean.valueOf("12.3")) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		if(Boolean.parseBoolean("false")) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		/*
//		 * 주의 : Character Class에는 "문자열"을 '문자1개'로 변경하는 매서드는 존재하지 않음
//		 * 이유? 문자열을 문자1개로 변환 불가
//		 * 문자열에서 문자 1개를 추출하여 해결방법 :
//		 * "abc".CharAt(index)
//		 */
//		char ch2 = Character.valueOf('a'); //Pointless, no need to use
//		System.out.println("ch2 = " + ch2 + ", ch의 코드값 = " + (int)ch2);
//		
//		ch2 = 'a';
//		System.out.println("ch2 = " + ch2 + ", ch의 코드값 = " + (int)ch2);
//		
////		ch2 = Character.valueOf("abc")//컴파일 오류
////		ch2 = Character.parseCharacter("ABC")//parse매서드 존재하지 않음
//		
//		/*
//		 * substring() : 문자열에서 원하는 부분만큼 "부분 문자열"로 생성
//		 * substring(init_index) : init_index~end_line 문자열 생성
//		 * substring(init_index,end_index+1) : init_index~end_index 문자열 생성
//		 * 
//		 * 자바의 매서드 특징 : 매개변수가 2개이고 둘다 index번호를 가진다면 (init_index,end_index+1)
//		 */
//		
//		String subStr = "Happy, Health, Hope".substring(7);
//		System.out.println(subStr);
//		System.out.println(subStr.substring(0, 6));
//		
//		/*
//		 * split() : 문자열 분리.
//		 */
//		String slice = ", ";
//		String animals = "dog, cat, rabbit";
//		String[] animalSplit = animals.split(", ");
//		for(int n = 0; n < animalSplit.length; n++) {
//			System.out.println(animalSplit[n]);
//		}
//		
//		String testing = "test, case, shell, fire, powder, head";
//		String[] testing_split = testing.split(slice);
//		for(int n = 0; n < testing_split.length; n++) {
//			System.out.println(testing_split[n] + slice + (n+1) + " 번째");
//		}
//		
//		/*
//		 * 중요 ... 가변인수 : 여러 매개값들을 "배열"로 처리 (인수 = 인자 = 매개값)
//		 * join(문자열, 문자열 가변인수) : 여러 문자열 사이에 "구분자"를 넣어서 하나의 문자열로 결합
//		 * 			static 매서드 : 클래스 이름으로 접근(예)String.join()
//		 */
//		String animalJoin = String.join(slice, animalSplit);
//		System.out.println("-------test!-----");
//		System.out.println("연결된 하나의 문자열 = "+animalJoin);
//		System.out.println("-------test!-----");
//		animalJoin = String.join(slice, animalSplit).toUpperCase();
//		System.out.println(animalJoin);
		
		/*
		 * 대상 "문자열" 안에 찾고자 하는 문자열이 존재하는지 확인하는 방법
		 * 1."대상 문자열".indexof("찾고자 하는 문자열") => 찾는 문자열의 시작 index번호 리턴받음
		 * 없으면 -1
		 * 
		 * 2. "대상 문자열"contains("찾고자 하는 문자열")
		 * boolean 타입으로 리턴 true or false
		 */
		
		//-------------calculator---------
		
		
		
		while(true) {
			System.out.println("정수 연산자(+,-,*,/) 정수 입력, 탈출은 0만 입력");
			System.out.println("split을 사용한 계산기와 달리 1+2-3*4/5 처럼 연산자 혼용 가능함");
			String temp = sc.next().trim();//1*2-3, 1+2-3, 1+2-3*4, 1+2-3*4/5 등 혼용 가능
			if(temp.charAt(0) == '0') {//탈출조건
				break;
			}
			//첫번째 숫자가 음수인가?
			boolean isFirstNav = false;
			if(temp.charAt(0)=='-') {
				isFirstNav = true;
			}
			//숫자 배열과 연산자 배열 길이를 설정하기 위해 연산자의 숫자를 검색
			//ex)1+2+3*4 => 연산자 총 3개
			//이때 필요한 연산자 배열 길이 = 연산자 총 갯수
			//숫자 배열 길이 = 연산자 총 갯수 + 1
			
			//총 연산자 갯수 확인
			int opers = 0;//연산자 갯수를 칭하는 변수
			for(int k = 0; k < temp.length(); k++) {
				if(temp.charAt(k) == '+'||temp.charAt(k) == '-'||
						temp.charAt(k) == '*'||temp.charAt(k) == '/') {
					opers++;
				}
			}
			
			
			
			int number = 0;//숫자 배열의 index
			int N = 0;//숫자 배열에 들어갈 숫자
			char operA[] = new char[opers];//연산자 배열
			double numberA[] = new double[(opers+1)];//숫자 배열
			
			

			//연산자와 숫자를 연산자배열과 숫자 배열로 분리 하는 과정
			//첫번째 숫자가 음수일 경우 연산자 갯수와 숫자의 갯수가 동일
			for(int k = 0; k < temp.length(); k++) {
				if(temp.charAt(k) == '+' || temp.charAt(k) == '-' ||
						temp.charAt(k) == '*' || temp.charAt(k) == '/') {
					//연산자 위치와 종류를 저장
					switch(temp.charAt(k)) {
					case'+':
						operA[number] = temp.charAt(k);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						break;
					case'-':
						operA[number] = temp.charAt(k);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						break;
					case'*':
						operA[number] = temp.charAt(k);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						break;
					case'/':
						operA[number] = temp.charAt(k);
						number++;
						//연산자 이후에는 숫자가 나오기 때문에 N을 0으로 초기화 해야함
						N = 0;
						break;
					}
				}
				else {
					//숫자를 저장
					N *= 10;
					N += Double.parseDouble(temp.substring(k, k+1));
					numberA[number] = N;
					//해당 위치에 연산자가 없으면 숫자가 있는것
					//625 숫자는 (6*10*10)+(2*10)+5로 만들어짐
					//6을 읽고 저장하면 N = 6
					//그다음 2를 읽고 저장하기전에 N에 10을 곱하면
					//60 + 2 = 62 -> N에 저장
					//다음 숫자를 읽기 전에 N에 10을 곱함
					//620 + 5 = 625 ->N에 저장
					//625 숫자를 온전히 저장 가능함
				}
			}
			//첫번째 숫자가 음수일 경우
			//numberA[0]에는 아무것도 안들어가 있음
			//고로 원할한 계산을 위하여 numverA[0]에 0을 넣어주어야 함
			if(isFirstNav) {
				numberA[0] = 0;
			}
			
			//숫자배열과 연산자 배열을 이용하여 계산
			//첫번째 숫자 +(첫번째 연산자 + 두번째 숫자) + (두번째 연산자 + 세번째 숫자)......
			//k=0        k=0          k=0+1        k= 1         k= 1+1
			//
			double result = numberA[0];
			for(int k = 0; k<opers;k++) {
				switch(operA[k]) {
				case '+':
					result += numberA[k+1];
					break;
				case '-':
					result -= numberA[k+1];
					break;
				case '*':
					result *= numberA[k+1];
					break;
				case '/':
					result /= numberA[k+1];
					break;
				}
			}
			//결과출력
			System.out.println(temp + " = ");
			System.out.println(result);
		}
		
		
		while(true) {
			System.out.println("숫자 연산자(+,-,*,/) 숫자 입력, 탈출은 연산자 넣지 말것");
			System.out.println("연산자는 무조건 같은 것으로 사용할것! 에러 유발됨");
			String temp = sc.next();//"  1+2    ", "  1+2    ", "  1+2    ", "  1+2    "
			temp = temp.trim();//
			if(temp.contains("+")) {
				String[] temp2 = temp.split("\\+");
				int num = Integer.valueOf(temp2[0]);
				for (int j = 1; j < temp2.length; j++) {
					num += Integer.valueOf(temp2[j]);
				}
				System.out.println(temp + " = " + num);
			}
			else if(temp.contains("-")) {
				String[] temp2 = temp.split("\\-");
				int num = Integer.valueOf(temp2[0]);
				for (int j = 1; j < temp2.length; j++) {
					num -= Integer.valueOf(temp2[j]);
				}
				System.out.println(temp + " = " + num);
			}else if(temp.contains("*")) {
				String[] temp2 = temp.split("\\*");
				int num = Integer.valueOf(temp2[0]);
				for (int j = 1; j < temp2.length; j++) {
					num *= Integer.valueOf(temp2[j]);
				}
				System.out.println(temp + " = " + num);
			}else if(temp.contains("/")) {
				String[] temp2 = temp.split("/");
				double num = Double.valueOf(temp2[0]);
				for (int j = 1; j < temp2.length; j++) {
					num /= Double.valueOf(temp2[j]);
				}
				System.out.println(temp + " = " + num);
			}else {
				System.out.println("탈출!");
				break;
			}
			
		}
		
//		while(true) {
//			System.out.println("숫자 연산자(+,-,*,/) 숫자 입력, 탈출은 연산자 넣지 말것");
//			System.out.println("연산자는 무조건 같은 것으로 사용할것! 에러 유발됨, 아직은");
//			String temp = sc.next();//"  1+2    ", "  1+2    ", "  1+2    ", "  1+2    "
//			temp = temp.trim();//
//			int start = 0;
//			int tempn = 0;
//			double result = 0;
//			//첫번째 숫자 추출
//			for(int o = 0; o < temp.length(); o++) {
//				if(temp.charAt(o+1) == '+' || temp.charAt(o+1) == '-' || 
//						temp.charAt(o+1) == '*'||temp.charAt(o+1) == '/' ) {
//					result += Integer.valueOf(temp.substring(start, o+1));
//					break;
//			}
//				start=temp.length();//변수 재사용을 위한 초기화
//			for(int k = temp.length(); k > o;k--) {
//				if(temp.charAt(k-1) == '+' || temp.charAt(k-1) == '-' || 
//						temp.charAt(k-1) == '*'||temp.charAt(k-1) == '/' ) {
//					tempn = Integer.valueOf(temp.substring(k, start+1));
//					//연산자 분류
//					switch(temp.charAt(k-1)) {
//					case '+':
//						break;
//					case '-':
//						break;
//					case '*':
//						break;
//					case '/':
//						break;
//					}
//					k--;
//					start = k-1;
//				}
//			}
//		}
		
		
		//주민등록번호를 입력받아 yyyy년 mm월 dd일에 태어난 남성/여성
		while(true) {
			System.out.print("주민등록번호 입력, (-상관없음,8자리 미만은 종료)");
			String socialN = sc.next().trim();
			//입력 길이 확인
			if(socialN.length() < 8) {
				System.out.println("탈출!");
				break;
			}
			//-문자가 있다면 제거함
			if(socialN.contains("-")) {
				String temp[] = socialN.split("-");
				String temp2 = temp[0];
				for(int i = 1; i<temp.length;i++) {
					temp2 = String.join("", temp2,temp[i]);
				}
				socialN = temp2;
				
			}
			//입력 번호 분할
			char socialN_G = socialN.charAt(6); //성별확인
			if(socialN_G != '1' && socialN_G != '2' 
					&& socialN_G != '3' && socialN_G != '4') {
				System.out.println("7번째 번호를 확인해주세요");
				continue;
			}
			String socialN_Y = socialN.substring(0, 2);//year확인
			String socialN_M = socialN.substring(2, 4);//month 확인
			if(Integer.parseInt(socialN_M)<1 || Integer.parseInt(socialN_M)>12) {
				System.out.println("번호를 확인해주세요");
				System.out.println(Integer.parseInt(socialN_M)+"월은 없습니다");
				continue;
			}
			String socialN_D = socialN.substring(4, 6);//day 확인
			if(Integer.parseInt(socialN_D)<1 || Integer.parseInt(socialN_D)>31) {
				System.out.println("번호를 확인해주세요");
				System.out.println(Integer.parseInt(socialN_D) + "일은 없습니다");
				continue;
			}
			//분류 및 결과
			switch(socialN_G) {
			case '1':
				System.out.println("19"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 남성 이십니다.");
				break;
			case '2':
				System.out.println("19"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 여성 이십니다.");
				break;
			case '3':
				System.out.println("20"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 남성 이십니다.");
				break;
			case '4':
				System.out.println("20"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 여성 이십니다.");
				break;
			default:
				System.out.println("번호를 재확인 해주세요.");
				break;
			}
		}
		
		while(true) {
			System.out.print("주민등록번호 입력, (ex)123456-8)(8자리 미만은 종료)");
			String socialN = sc.next().trim();
			//입력 길이 확인
			if(socialN.length() < 8) {
				System.out.println("탈출!");
				break;
			}
			//입력 번호 분할
			char socialN_G = socialN.charAt(8); //성별확인
			if(socialN_G != '1' && socialN_G != '2' 
					&& socialN_G != '3' && socialN_G != '4') {
				System.out.println("7번째 번호를 확인해주세요");
				continue;
			}
			String socialN_Y = socialN.substring(0, 2);//year확인
			String socialN_M = socialN.substring(2, 4);//month 확인
			int socialN_M_int = Integer.parseInt(socialN_M);
			if(socialN_M_int<1 || socialN_M_int>12) {
				System.out.println("번호를 확인해주세요");
				System.out.println(socialN_M_int+"월은 없습니다");
				continue;
			}
			String socialN_D = socialN.substring(4, 6);//day 확인
			int socialN_D_int = Integer.parseInt(socialN_D);
			if(socialN_D_int<1 || socialN_D_int>31) {
				System.out.println("번호를 확인해주세요");
				System.out.println(socialN_D_int + "일은 없습니다");
				continue;
			}
			//분류 및 결과
			switch(socialN_G) {
			case '1':
				System.out.println("19"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 남성 이십니다.");
				break;
			case '2':
				System.out.println("19"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 여성 이십니다.");
				break;
			case '3':
				System.out.println("20"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 남성 이십니다.");
				break;
			case '4':
				System.out.println("20"+socialN_Y+"년 " + socialN_M+"월 "+socialN_D+"일에 출생한 여성 이십니다.");
				break;
			}
		}
		sc.close();
		
		
	}
	
	
	

//	@Override
//	public String toString() {
//		return "Hi";
//	}

}

