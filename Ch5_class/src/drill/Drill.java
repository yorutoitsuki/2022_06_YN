package drill;

class Drilling{
	private int DrillInt;
	private String DrillString;
	public Drilling(int i, String s) {
		this.setDrillInt(i);
		this.setDrillString(s);
	}
	
	public int getDrillInt() {
		return DrillInt;
	}
	public void setDrillInt(int testInt) {
		this.DrillInt = testInt;
	}
	public String getDrillString() {
		return DrillString;
	}
	public void setDrillString(String testString) {
		this.DrillString = testString;
	}
	public void getEverything() {
		System.out.println("testInt = " + DrillInt);
		System.out.println("testString = " + DrillString);
	}
}

class test{
	private int testInt;
	private String testString;
	public test(int i, String s) {
		this.setTestInt(i);
		this.setTestString(s);
	}
	
	public int getTestInt() {
		return testInt;
	}
	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	public void getEverything() {
		System.out.println("testInt = " + testInt);
		System.out.println("testString = " + testString);
	}
}




public class Drill {
	
	public static void main(String[] args) {
		
		test testing = new test(0, "");
		testing.setTestInt(100);
		testing.setTestString("testing_N01");
		testing.getEverything();
		Drilling drilling = new Drilling(0,"");
		System.out.println(drilling.getDrillInt());
		System.out.println(drilling.getDrillString());
	}
	
	
	
	

}
