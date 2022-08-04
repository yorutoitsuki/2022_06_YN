package ex04;

abstract class Electronics {
	final String country = "한국";
	String company;
	boolean power;
	
	
	abstract void power();
}






class TV extends Electronics{
	
	int channel;
	
	TV(String company) {
		this.company = company;
	}
	
	
	@Override
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
	}
	void channelDown() {
		channel--;
	}
	
}






class VCR extends Electronics{

	@Override
	void power() {
		power = !power;
		if(power) {
			System.out.println("VCR 전원 ON");
		}
		else {
			System.out.println("VCR 전원 OFF");
		}
	}
	
	void play() {
		System.out.println("VCR, play");
	}
	void stop() {
		System.out.println("VCR, stop");
	}
	
}






public class TVCR extends TV{
	
	private VCR vcr;
	TVCR(String company) {
		super(company);
		vcr = new VCR();
	}
	
	
	
	@Override
	void power() {
		power = !power;
		if(power) {
			System.out.println("TVCR, powering Up");
		}
		else {
			System.out.println("TVCR, shutting Down");
		}
	}

	public void play() {
		vcr.play();
	}
	
	public void stop() {
		vcr.stop();
	}
	
	void showTVCR() {
		System.out.println("만든 나라: " + country + ", 만든 회사: " + company + ", 전원 : " + power + ", 현재 채널: " + channel);
	}
	
	
}
