package object.finalinze;

public class FinalizeMain {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1; i < 51; i++) {
			counter = new Counter(i);
			counter = null;
			
			/*
			 * GC는 메모리가 부족할때, CPU가 한가할 때 JVM에 의해 자동 실행된다.
			 * gc() 호출해서 쓰레기 수집기(GC)를 가급적 빨리 실행해 달라고 JVM에게 요청
			 */
			System.gc();//gc() 호출하면 재정의된 finalize()가 실행됨
			//결과를 보면 순서대로 소멸하지 않고 무작위로 소멸시키고 전부 소멸되지 않음
			//메모리의 용량 여부를 체크하여 일부만 소멸시킨다
		}
		System.out.println("-------------------------------------------");
		System.runFinalization();//GC에 의해 소멸이 결정된 객체 즉시 소멸
	}

}
