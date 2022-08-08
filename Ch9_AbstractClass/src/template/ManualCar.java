package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("Manual Drive");
		System.out.println("Handle by Human touch");
		
	}

	@Override
	public void wiper() {
		System.out.println("Manual Wipe");
	}
	
	@Override
	public void stop() {
		System.out.println("Step Brake");
	}
	
	

}
