package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("Run Fast Speed");
	}

	@Override
	void jumb() {
		System.out.println("Jump High");
	}

	@Override
	void turn() {
		System.out.println("Can not Roll");
	}

	@Override
	void showLevelMessage() {
		System.out.println("==Advenced Level==");
	}

}
