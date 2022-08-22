package wrapper;
/*
 * Wrapper 클래스 : 기본 자료형(int, double....)을 위한 클래스
 * 				자동 Boxing과 자동 UnBoxing이 됨
 * 
 * 1. 수와 관련된 Wrapper 클래스의 부모 : Number
 * 		(int : Integer, double : Double....등)
 * 
 * 2. 수와 관련되지 않은 Wrapper 클래스(2개, Character, Boolean)의 부모 : Object
 * 
 * 3. Character만 parseCharacter("문자열"); 문자열 -> 문자 1개로 변환 하는 메서드가 없다.
 * 	(이유? "abc"(문자가 여러개) ->문자 여러 개)
 * 	그래서 String 클래스의 charAt(int index) 메서드로 문자열에서 특정 문자 1개를 추출함
 */
public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		System.out.println("-----------------자 동--------------------");
		//자동 Boxing(기본타입 - wrapper 클래스 로 자동변환) wrapper 객체 = 기본타입값
		Integer i = 100;
		System.out.println(i.intValue());
		System.out.println(i.toString());
		
		i+=7;
		
		int i2 = i;
		System.out.println(i2);
		System.out.println("--Number 테스트 --");
		
		Number number = 100;//자동 Boxing : (int)100->(Integer)100->(Number)100
		System.out.println(number.toString());
		
		/*
		 * 연산시 자동 unBoxing 안되는 이유? 수와 관련된 Wrapper 클래스가 여러개 있으므로,
		 * 원하는 해당 자식 클래스로 강제로 형변환 해야 함
		 */
		if(number instanceof Integer) {
			int result = (Integer)(number) + 7;
			System.out.println(result);
		}
		
		
		if(number instanceof Double) {//
			Double result2 = (Double)number + 7;
			System.out.println(result2);
			// java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Double
		}
		
		
		System.out.println("-----------------수 동--------------------");
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer("200");
		
		try {
			Integer strInteger2 = new Integer("ab");
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		
		Integer integer3 = Integer.valueOf(300);
		Integer integer4 = Integer.valueOf("400");
		try {
			Integer strInteger2 = Integer.valueOf("400");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("-----------------수 동 unboxing--------------------");
		int value1 = integer1.intValue();
		int value2 = integer2.intValue();
		
		int value3 = integer3;//자동 unboxing
		int value4 = integer4;//자동 unboxing
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		System.out.println("------------문자열 -> 기본타입으로, 기본타입 -> 문자열로 ----------------");
		int iValue = Integer.parseInt("10");
		double d = Double.parseDouble("3.14");
		
		/*
		 * 2. 수와 관련되지 않은 Wrapper 클래스(2개, Character, Boolean)의 부모 : Object
		 */
		
		Character ch = 'a';
		char ch2 = ch;
		
		char ch3 = "abc".charAt(0);
		
		//기본타입 -> 문자열로
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(1232.45);
		String s3 = String.valueOf(false);
		String s4 = String.valueOf('A');
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/*
		 * 포함 객체에 정확이 어떤 값이 저장될지 모르는 상황이라면
		 * == != 연산자는 사용하지 않는것이 좋음
		 */
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println("[-128~127 이외의 값일 경우]");
		Integer b1 = 300;
		Integer b2 = 300;
		
		System.out.println("==결과" + (b1==b2));//hashCode로 비교 하기 때문에 false
		System.out.println("언박싱 후 == 결과" + (b1.intValue() == b2.intValue()));//언박싱 하면 내부의 값으로 비교하기 때문에 true
		System.out.println("equals()결과 : " + b1.equals(b2));//equals는 내부의 값을 비교하도록 오버라이드 되어 있음 고로 true
		
		
		
	}

}
