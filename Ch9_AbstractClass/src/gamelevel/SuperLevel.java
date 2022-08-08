package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("Run Very Fast Speed");
	}

	@Override
	void jumb() {
		System.out.println("Jump Higher");
	}

	@Override
	void turn() {
		System.out.println("Rolling");
	}

	@Override
	void showLevelMessage() {
		System.out.println("==Super Level==");
	}

}
