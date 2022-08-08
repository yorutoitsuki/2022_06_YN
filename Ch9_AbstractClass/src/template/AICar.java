package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("Automatic Drive");
		System.out.println("Veicle will drive itself");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop itself");
		
	}

	@Override
	public void wiper() {
		System.out.println("Automated Wipe");
		
	}

	@Override
	public void washCar() {
		System.out.println("Automated Wash");
	}
	
}
