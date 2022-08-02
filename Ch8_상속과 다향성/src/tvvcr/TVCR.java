package tvvcr;

class TV{
	boolean power;//전원
	int channel;//채널
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("TV 전원 ON");
		}
		else {
			System.out.println("TV 전원 OFF");
		}
	}
	
	void channelUp() {
		channel++;
		if(channel > 100) {
			channel = 0;
		}
	}
	
	void channelDown() {
		channel--;
		if(channel < 0) {
			channel = 100;
		}
	}
}

/*
 * 여러 개의 클래스를 하나의 파일에 설게할 때
 * public은 단 1개의 클래스에만 쓸 수 있다.
 * 
 * public 붙은 클래스이름 = 파일이름
 * 
 * main()있는 클래스에 public 붙이고
 * main()있는 클래스 이름 = 파일이름
 */

class VCR {
	boolean power;
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("VCR 전원 ON");
		}
		else {
			System.out.println("VCR 전원 OFF");
		}
	}
	
	void play()	{
		System.out.println("Play");
	}
	void stop()	{
		System.out.println("stop");
	}
	void rewind()	{
		System.out.println("rewind");
	}
	void fast()	{
		System.out.println("fast");
	}
}

public class TVCR extends TV {
	/*
	 * TV(부모)의 멤버(멤버변수, 메서드)만 상속,
	 * 생성자, 초기화블록, private멤버는 상속되지 않는다.
	 */
	
	
	
//	boolean power;//전원
//	int channel;//채널
//	
//	void power() {
//		power = !power;
//		if(power) {
//			System.out.println("TV 전원 ON");
//		}
//		else {
//			System.out.println("TV 전원 OFF");
//		}
//	}
//	
//	void channelUp() {
//		channel++;
//		if(channel > 100) {
//			channel = 0;
//		}
//	}
//	
//	void channelDown() {
//		channel--;
//		if(channel < 0) {
//			channel = 100;
//		}
//	}
	
	
	
	
	
}


//public class TVCRmain {
//	public static void main(String[] args) {
//		
//	}
//}




















