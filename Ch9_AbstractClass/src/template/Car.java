package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public void washCar() {}
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("Ignition On");
	}
	
	public void turnOff() {
		System.out.println("Ignition Off");
	}
	
	//자식의 공통된 기능, 템플릿 메서드 : 메서드 실행순서와 시나리오를 정의한 메서드, 설계단계에서 많이 사용
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar(); // ManualCar는 실행되는것이 없고 AICar는 자동세차
	}
	
	
}
