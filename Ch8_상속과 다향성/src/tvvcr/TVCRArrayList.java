package tvvcr;

import java.util.ArrayList;

public class TVCRArrayList {

	public static void main(String[] args) {
		ArrayList<Electronics> eList = new ArrayList<Electronics>();
		
		eList.add(new TV());
		eList.add(new VCR());
		eList.add(new TVCR());
		
		System.out.println("각 전자제품의 정보 한꺼번에 출력");
		System.out.println(eList.toString());
		/*
		 * ArrayList클래스에서 toString()을 재정의함
		 * [TV객체 주소, VCR객체 주소, TVCR객체주소]
		 * =[TV객체 주소.toString(), VCR객체 주소.toString(), TVCR객체주소.toString()]
		 */
		System.out.println("각 전자제품의 정보 각각 출력");
		for(int i = 0; i < eList.size(); i++) {
			System.out.println(eList.get(i));
		}
		System.out.println();
		for(Electronics e : eList) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("각 전자제품의 메서드 호출 후 정보 출력");
		for(Electronics e:eList) {
			
			/*
			 * e가 참조하는 객체가 TVCR객체 또는 자식객체이면 true를 반환
			 * 
			 */
//			TVCR tvcr = (TVCR) e;//주의 아무 자식으로 강제 형변환 해도 컴파일에서는 오류가 안남
//			하지만 런타임 오류를 일으킴
//			ClassCastException 오류
//			String s = (String) e;//그러나 자식이 아닌 클래스로 강제 형변환 하면 컴파일 오류 발생
			if(e instanceof TVCR) {
				((TVCR) e).play();
			}
			else if(e instanceof TV) {
				for(int i = 0; i < 5; i++) {
					((TV) e).channelUp();
				}
				System.out.println(e.toString());
			}
			else if(e instanceof VCR){
				((VCR) e).capture();
			}
			System.out.println(e.toString());
			System.out.println("--------------------------------------");
		}
		
	}

}
