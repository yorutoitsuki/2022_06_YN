package ex02;

public class Test02 {

	public static void main(String[] args) {
		/*
		 * [보기]에서 알맞는 메서드를 선택하여 결과가 나오도록 채우기
		 */
		String s1 = "JAVA";
		String s2 = s1.concat("프로그램");
		System.out.println(s2);
		
		//주어진 문자나 문자열의 존재 여부 확인 기능()
		if(s2.contains("JAVA")) {
			System.out.println("자바와 관련된 책");
		}
		else {
			System.out.println("자바와 관련 없는 책");
		}
		if(s2.indexOf("JAVA") != -1) {
			System.out.println("자바와 관련된 책");
		}
		else {
			System.out.println("자바와 관련 없는 책");
		}
		
		//JAVA를 찾아서 "자바" 로 변경
		String s3 = s2.replace("JAVA", "자바");
		System.out.println(s3);
		
		//"JAVA" 대문자를 -> 소문자로 변경
		String s4 = s2.toLowerCase();
		System.out.println(s4);
		
		//두 문자열을 대소문자 무시하고 비교
		System.out.println(s2.equalsIgnoreCase(s4));
		
		//문자열을 구분자로 분리
		String s = "개, 고양이, 토끼";
		String[] arr = s.split(", ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		String s5 = String.join("-", arr);
		System.out.println(s5);
	}

}
