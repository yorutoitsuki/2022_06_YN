package string373;
/*
 * StringBuilder와 StringBuffer 클래스
 * 1.String 클래스
 * String 클래스는 한번 생서오디면 내부의 문자열 값이 변경되지 않기 때문에
 * 문자열 concat()또는 + 로 연결하거나
 * subString()등과 같은 메서드로 변경하면
 * 항상 "새로운 문자열 객체가 생성"되어 메모리 낭비가 심하다.
 * 
 * 위 문제를 해결하기 위해서 StringBuilder 와 StringBuffer 클래스가 등장
 * 
 * 2.StringBuilder와 StringBuffer 클래스의 유일한 차이점
 * StringBuilder : 싱글 쓰레드에서 사용 -> 속도 향상(비동기화)(ArrayList?)
 * StringBuffer : 멀티 쓰레드에서 사용 -> 동기화 보장(Vector?)
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");//(List?)
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!!");
		//buffer.insert(4, " program");
		//buffer.setCharAt(4, '4');
		buffer.replace(0, 3+1, "java program");
		
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		System.out.println(System.identityHashCode(buffer.toString()));
		
		System.out.println("javaStr replace 이전 : " + System.identityHashCode(javaStr));
		javaStr = javaStr.replace("java", "java program");
		System.out.println("javaStr replace 이후 : " + System.identityHashCode(javaStr));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

	}

}
