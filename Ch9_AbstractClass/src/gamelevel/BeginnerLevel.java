package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("Run Slow Speed");
	}

	@Override
	void jumb() {
		System.out.println("Can not Jump");
	}

	@Override
	void turn() {
		System.out.println("Can not Roll");
	}

	@Override
	void showLevelMessage() {
		System.out.println("==Beginner Level==");
	}

}
