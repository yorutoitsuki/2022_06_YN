package object.clone;

class Point implements Cloneable {//1.객체를 복제할 수 있는 클래스
	private int x;
	private int y;
	
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void showPosition() {
		System.out.printf("[%d %d]",x,y);
	}
	
	void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void changePosition() {
		int temp = this.x;
		this.x = this.y;
		this.y = temp;
	}
	
	@Override//2. Object로 부터 상속받은 clone() 재정의하여 Point객체를 복제할 수 있도록 재정의함
	protected Object clone() throws CloneNotSupportedException {
		// TODO 자동 생성된 메소드 스텁
		return super.clone();
	}
}//point end

class Rectangle implements Cloneable{
	private Point upperLeft, lowerRight;
	Rectangle(int x1, int y1, int x2, int y2){
		upperLeft = new Point(x1, y2);
		lowerRight = new Point(x2, y2);
	}
	
	void showPosition() {
		System.out.println("사각형의 위치정보");
		System.out.print("좌 상단 : ");upperLeft.showPosition();
		System.out.print("우 하단 : ");lowerRight.showPosition();
		System.out.println();
	}
	
	void setPosition(int x1, int y1, int x2, int y2) {
		upperLeft.setPosition(x1,y1);
		lowerRight.setPosition(x2, y2);
	}
	
	/*
	 * 오버라이딩 할 때 부모 매서드의 반환타입을 '자손 클래스의 타입으로 변경'을 허용한다
	 */
	@Override
	protected Rectangle clone() throws CloneNotSupportedException {
		// TODO 자동 생성된 메소드 스텁
		return (Rectangle)super.clone();
	}
	
}

public class Sallow_Point_Copy {
	public static void main(String[] args) {
		System.out.println("----Point 복제 테스트----");
		Point p = new Point(1,1);
		System.out.println("원본 Point");
		p.showPosition();
		System.out.println();
		
		Point pointCopy = null;
		try {
			if(p instanceof Point) {
				pointCopy= (Point)p.clone();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("복제 Point");
		pointCopy.showPosition();
		System.out.println();
		
		
		
		System.out.println("----원본 Point 정보 변경----");
		p.setPosition(3, 3);
		System.out.println("원본 Point");
		p.showPosition();
		System.out.println();
		System.out.println("복제 Point");
		pointCopy.showPosition();
		
		System.out.println("---------------------------");
		System.out.println("----Rectangle 복제 테스트----");
		Rectangle orgR = new Rectangle(1, 1, 9, 9);
		System.out.print("원본 Rectagle : ");orgR.showPosition();
		
		Rectangle cpyRectangle = null;
		try {
			if(orgR instanceof Rectangle) {
				cpyRectangle = (Rectangle)orgR.clone();
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.print("복제 Rectagle : ");cpyRectangle.showPosition();
		
		cpyRectangle.setPosition(2, 2, 7, 7);
		System.out.println("--위치 변경 후---------");
		System.out.print("원본 Rectagle : ");orgR.showPosition();
		System.out.print("복제 Rectagle : ");cpyRectangle.showPosition();
		
	}

}
