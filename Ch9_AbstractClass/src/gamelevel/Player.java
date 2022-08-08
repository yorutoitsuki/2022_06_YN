package gamelevel;

public class Player {
	//PlayerLevel 로 UpCasting된 BeginerLevel
	private PlayerLevel level;
	public Player() {
//		level = new PlayerLevel();
		level = new BeginnerLevel();
	}
	
	public void paly(int count) {
		level.go(count);
	}
	
	public void levelUp() {
		System.out.println("====Level UP!====");
		if(level instanceof SuperLevel) {
			System.out.println("Maximum Level");
		}
		else if(level instanceof AdvancedLevel) {
			level = new SuperLevel();
		}
		else if(level instanceof BeginnerLevel) {
			level = new AdvancedLevel();
		}
		else {
			System.out.println("Error Occured On levelUp method");
		}
	}
}
