package polymorphism;

public class M {
	
	static void w(A a) {//A객체와 A자손 객체를 받아들미 (단, B객체, C객체)
		a.a();
		/*
		 * 
		 */
		((B)a).b();
	}
	
	static void w2(A a) {//A객체와 A자손 객체를 받아들미 (단, B객체, C객체)
		if(a instanceof C) {
			C temp = (C)a;
			temp.a();
			temp.b();
			temp.c();
		}
		else if(a instanceof B) {
			B temp = (B)a;
			temp.a();
			temp.b();
		}
		else {
			a.a();
		}
		/*
		 * 
		 */
		
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		w2(a);
		System.out.println();
		w2(b);
		System.out.println();
		w2(c);
		System.out.println();
		/*
		 * 자동 형변환
		 * 1. 자식객체 -> 부모타입으로 자동 형변환됨
		 * (예) w(A a), w2(A a)
		 * 
		 * 강제 형변환
		 * 1. 자식객체 -> 부모타입으로 강제 형변환 가능
		 */
		
		System.out.println("자동 예1");
		B b2 = new C();
		b2.a(); b2.b();
		
		System.out.println("강제 예1");
		((A)b2).a();
		
		System.out.println("강제 예2");
		A a2 = new B();
		a2.a();
		((B)a2).b();
		
		//((C)a2).a();//강제 예2, ((C)a2) 부분에서 ClassCastException 에외 발생(B cannot be cast to C)
		
		if(a2 instanceof C) {
			C temp = ((C)a2);
			temp.a();
			temp.b();
			temp.c();
		}else if(a2 instanceof B) {
			B temp = ((B)a2);
			temp.a();
			temp.b();
		}else {
			a2.a();
		}
		
		System.out.println("강제 예3");
		A a3 = new C();
		a3.a();
		
		((C)a3).b();
		
		if(a3 instanceof C) {
			C temp = ((C)a3);
			System.out.println("cast as C");
			temp.a();
			temp.b();
			temp.c();
		}else if(a3 instanceof B) {
			System.out.println("cast as B");
			B temp = ((B)a3);
			temp.a();
			temp.b();
		}else {
			System.out.println("cast as A");
			a3.a();
		}
	}

}


















