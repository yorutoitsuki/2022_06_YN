package object.finalinze;

public class Counter {
	private int no;
	
	/*
	 * 	참조하지 않는 배열이나 객체를 GC를 사용해 힙 영역에서 제거시킨다.
	 * 	이러한 기능을 수행하는 메서드가 바로 finalize()이다.
	 * 	자동으로 실행되는 finalize()메서드를 사용자가 원할경우
	 * 	직접 재정의하여 사용할 수 있다.
	 */
	
	public Counter(int no) {
		super();
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();//Object의  finalize()는 텅 비어서 하는 일이 아무것도 없지만 안정성을 고려해서 삽입
		System.out.println(no + " Class's finalize() has run");
		
	}

	
}
