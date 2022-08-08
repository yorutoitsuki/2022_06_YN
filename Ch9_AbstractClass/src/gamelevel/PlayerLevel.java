package gamelevel;

public abstract class PlayerLevel {
	abstract void run();
	abstract void jumb();
	abstract void turn();
	abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jumb();
		}
		turn();
	}
}
