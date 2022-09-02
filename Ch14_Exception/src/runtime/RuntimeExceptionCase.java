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
		
		int[] arr0 = new int[3];
		try {
			arr0[3] = 20;
			System.out.println("실행 안됨");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기 벗어남");
		} finally {
			System.out.println("무조건 실행됨");
		}
		System.out.println();
		Object obj0 = new int[10];
		try {
			String str0 = (String)obj0;
		} catch (ClassCastException e) {
			System.out.println("문자열로 형변환 안됨");
		}
		
		try {
			int[] arr2 = new int[-10];
		} catch (Exception e) {
			System.out.println("음수 배열크기는 불가");
		}
		System.out.println();//구분위한 빈줄
		
		try {
			String str2 = null;
			int len = str2.length();//NullPointerException
			
			System.out.println("예외가 발생하면 실행되지 않는 부분");
			
		} catch (Exception e) { //잡아서				
			System.out.println("문자열 객체가 없는 null 상태입니다.");		
		} finally { 
			System.out.println("예외발생유무에 관계없이 무조건 처리");
		}
		
		System.out.println();//구분위한 빈줄
		
		System.out.println("***** 예외를 하나의 try로 묶어서 처리 -1 *****");
		
		int j = 3, size = -10;
		for(int i=1;i<=4;i++) {
			try {
				int[] arr = new int[3];//index 0 1 2 (기본값 0 0 0)
				arr[j] = 20;//ArrayIndexOutOfBoundsException 발생하면
				System.out.println("예외가 발생하면 실행되지 않는 부분");
				
				Object obj = new int[10];//배열객체 -> Object타입으로 자동형변환
				//String str = (String) obj;//ClassCastException
				System.out.println("예외가 발생하면 실행되지 않는 부분");
				
				int[] arr2 = new int[size];//NegativeArraySizeException
				System.out.println("예외가 발생하면 실행되지 않는 부분");
				
				String str2 = null;
				int len = str2.length();//NullPointerException
				System.out.println("예외가 발생하면 실행되지 않는 부분");
				
			} //RuntimeException의 자손들 대표 - 4가지
			  catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 넘어섬");
				j = 0;
				continue; //생략해도 되나 결과가 달라짐 : finally는 무조건 실행하나 [for문의 끝] 실행안됨
			} catch (ClassCastException e) { 			
				System.out.println("문자열로 형변환이 안됩니다.");
				continue; 
			} catch (NegativeArraySizeException e) {	
				System.out.println("배열의 크기를 음수로 할 수 없습니다.");
				size = 10;
				continue; 
			} catch (NullPointerException e) {	
				System.out.println("문자열 객체가 없는 null 상태입니다.");
				continue; 
			} //RuntimeException은 Exception의 자손	
			  catch (RuntimeException e) { //RuntimeException : 위의 4가지 제외한 RuntimeException의 자손들
				System.out.println(e);
				continue; 
			} catch (Exception e) { //가장 아래는 부모인 Exception
				e.printStackTrace();
				continue; 
			} 			
			System.out.println("[for문의 끝-1]");
		}
		
		System.out.println();//구분위한 빈줄
		
		System.out.println("실행");

	}

}
