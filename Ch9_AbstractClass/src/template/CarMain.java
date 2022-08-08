package template;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("--Hadling by Human Being--");
		ManualCar mcar = new ManualCar();
		mcar.run();
		
		System.out.println("--AI Car--");
		AICar aicar = new AICar();
		aicar.run();
	}

}
