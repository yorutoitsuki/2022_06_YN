/*
 * 일반적으로 클래스의 자료형을 모르는 상태에서 Class 클래스를 활용하여 그 클래스의 정보를 가져오고
 * 이 정보를 활용하여 객체를 생성하거나 메서드를 호출하는 방식을 Reflection 이라고 한다
 * 
 * ----일반적으로 자료형을 알 수 있는 경우에는 사용하지 않음----
 * 
 * Class클래스는 reflect을 위해 아래 매서드를 제공
 * java.lang.reflect 패키지에 소속되어 있음
 * 각각 생성자 배열, 필드 배열, 메서드 배열로 리턴
 * 1. getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods()
 * 		클래스에 선언된 멤버만 가져옴
 * 
 * 2. getConstructors(), getFields(), getMethods()
 * 		클래스에 선언된 멤버 + 상속된 멤버까지 얻어옴(부모의 생성자, private 멤버, 초기화블록은 상속이 안되어서 못 가져옴)
 * 		단, public 멤버만 얻어옴
 */


package classEX.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) {
		Class car = null;
		try {
			car = Class.forName("classEX.reflection.Car");//찾아서 있으면 메모리에 로딩
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		System.out.println("패키지 이름.클래스 이름");
		System.out.println(car.getName());
		
		System.out.println("클래스 이름");
		System.out.println(car.getSimpleName());
		
		System.out.println();
		
		System.out.println("-----------------Car의 생성자 -1---------------------");
		Constructor[] cons = car.getConstructors();//상속 포함하여 Car 필드 가져오기
		for(Constructor con:cons) {
			System.out.println(con);
		}
		
		System.out.println("-----------------Car의 생성자 -2---------------------");
		cons = car.getDeclaredConstructors();
		for(Constructor con:cons) {
			System.out.println(con);
		}
		
		System.out.println("-----------------Car의 필드 -1---------------------");
		Field[] fs = car.getFields();//상속 포함하여 Car 필드 가져오기
		for(Field f:fs) {
			System.out.println(f);
		}
		
		System.out.println("-----------------Car의 필드 -2---------------------");
		fs = car.getDeclaredFields();
		for(Field f:fs) {
			System.out.println(f);
		}
		
		System.out.println("-----------------Car의 메서드 -2---------------------");
		Method[] ms = car.getMethods();
		for(Method m:ms) {
			System.out.println(m);
		}
		System.out.println("-----------------Car의 메서드 -2---------------------");
		ms = car.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m);
		}

	}

}
