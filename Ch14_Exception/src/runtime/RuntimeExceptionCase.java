/*
 * 오류
 * 1. 컴파일 오류 : 문법적인 오류
 * 2. 실행 오류
 * 	(1) 시스템 오류 = Error 클래스 : JVM에서 발생 (예)메모리 문제 -> 프로그램에서 제어불가능?(C, C++ 에서는 가능하지)
 * 	(2) Exception 클래스 : 프로그램에서 제어 가능
 * 			-Exception 클래스의 자식 클래스들은 예외 처리해줘야 함
 * 			-그러나, RuntimeException(실행 오류 예외)은 프로그래머의 실수로 발생하는 예외이므로
 * 			try~catch()로 처리하는 것 보다, 프로그래머의 실수를 수정하는 방법으로 해결하는 것이 더 좋다.
 * 
 * 			-IOException(입출력 예외)의 자식 예외들은 반드시 예외 처리해줘야 함
 * 
 * 							Throwable
 * 								|
 * 						-----------------
 * 						|				|
 * 						|				|
 * 					Error			Exception
 * 										|
 * 								--------------------------------
 * 								|								|
 * 							IOException						RuntimeException
 * 								|								|
 * 						--------------------		----------------------------
 * 						|					|		|							|
 * 				FileNotFoundException			IndexOutofBoundsRuntime
 * 
 * 
 * 
 *  1. 예외처리하는 첫 번째 방법
 *  	try{
 *  		예외가 발생할 가능성이 있는 부분
 *  	} catch(Exception e) {
 *  		예외 처리
 *  	} finally {
 *  		예외발생유무에 관계엇이 무조건 실행되는것
 *  	}
 */
package runtime;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		System.out.println("예외를 각각 처리");
		
		int[] arr = new int[3];
		try {
			arr[3] = 20;
			System.out.println("실행 안됨");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기 벗어남");
		} finally {
			System.out.println("무조건 실행됨");
		}
		System.out.println();
		Object obj = new int[10];
		try {
			String str = (String)obj;
		} catch (ClassCastException e) {
			System.out.println("문자열로 형변환 안됨");
		}
		
		try {
			int[] arr2 = new int[-10];
		} catch (Exception e) {
			System.out.println("음수 배열크기는 불가");
		}
		
		
		System.out.println("실행");

	}

}
