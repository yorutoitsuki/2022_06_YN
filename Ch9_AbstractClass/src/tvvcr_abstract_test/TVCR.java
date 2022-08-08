package tvvcr_abstract_test;

import java.util.ArrayList;

abstract class Electro{
	protected boolean power;
	static final String MAKECOUNTRY = "한국";
	abstract void power();
}

class TV extends Electro{//부모
	//1. 멤버변수(=field) : 속성
	//전원 : on->true,  off->false(기본값)
	//채널(기본값 0)
	
	 //바코드
	int barcode;
	int channel = 1;
	
	@Override
	void power() {
		power = !power;
		if(power) {
			System.out.println("TV, powering up");
		}
		else {
			System.out.println("TV, shutting down");
		}
		
	}
	
	void channelUp() {
		channel++;
		if(channel > 100) {
			channel = 1;
		}
	}
	
	void channelDown() {
		channel--;
		if(channel < 1) {
			channel = 100;
		}
	}

	@Override
	public String toString() {
		return "TV [제조국 = " + MAKECOUNTRY + "barcode=" + barcode + ", channel=" + channel + ", power=" + power + "]";
	}

	
	
	
	
	
	//2. 생성자
	//기본생성자 
	
	
	//바코드를 가진 TV 객체 생성
	
	//3. 메서드 : 기능
	//파워 ON/OFF

	//채널 업
             //채널 다운
	
}	
class VCR extends Electro {

	@Override
	void power() {
		power = !power;
		if(power) {
			System.out.println("VCR, powering up");
		}
		else {
			System.out.println("VCR, shutting down");
		}
		
	}
	
	void play() {
		System.out.println("VCR, Play");
	}
	void stop() {
		System.out.println("VCR, Stop");
	}
	void rewind() {
		System.out.println("VCR, rewind");
	}
	void fast() {
		System.out.println("VCR, fast");
	}
	//포함
	//1. 멤버변수
	//전원

	@Override
	public String toString() {
		return "TV [제조국 = " + MAKECOUNTRY + "]";
	}
	
	//2. 기본생성자
	
	//3. 메서드
	//파워 ON/OFF
	
            //실질적인 기능
            //재생
	//멈춤
	//되감기
	//빨리감기
}

public class TVCR extends TV{

	@Override
	void power() {
		power = !power;
		if(power) {
			System.out.println("TVCR, powering up");
		}
		else {
			System.out.println("TVCR, shutting down");
		}
	}//TVCR(자식)-TV(부모1개):단일상속, VCR(포함관계)
	
	ArrayList<VCR> vcr;
	
	TVCR() {
		this.barcode = 404;
		vcr = new ArrayList<VCR>();
	}
	TVCR(int barcode) {
		this.barcode = barcode;
		vcr = new ArrayList<VCR>();
	}
	
	void addVCR() {
		vcr.add(new VCR());
	}
	
	void capture() {
		System.out.println("Screen captured");
	}
	void bootVCR(int i) {
		if(vcr.size() > i) {
			System.out.print(i + " ");
			vcr.get(i).power();
		}
		else {
			System.out.println("Not availabe Index Number");
		}
		
	}
	void getPlay(int i) {
		if(vcr.size() > i && i >= -1) {
			System.out.print(i + " ");
			vcr.get(i).play();
		}
		else {
			System.out.println("Not availabe Index Number");
		}
	}
	void getStop(int i) {
		if(vcr.size() > i && i >= -1) {
			System.out.print(i + " ");
			vcr.get(i).stop();
		}
		else {
			System.out.println("Not availabe Index Number");
		}
	}
	void getRewind(int i) {
		if(vcr.size() > i && i >= -1) {
			System.out.print(i + " ");
			vcr.get(i).rewind();
		}
		else {
			System.out.println("Not available Index Number");
		}
	}
	void getfast(int i) {
		if(vcr.size() > i && i >= -1) {
			System.out.print(i + " ");
			vcr.get(i).fast();
		}
		else {
			System.out.println("Not availabe Index Number");
		}
	}
	@Override
	public String toString() {
		return "TVCR [제조국 = " + MAKECOUNTRY + "]";
	}
	
	
	
	//1. 멤버변수 : [상황-1] 상속(3)+추가(1),  [상황-2] 상속(3)+추가(2)
            //[상황-1]	로 만들기

            //2.생성자-2개

           //3. 메서드
	//파워 ON/OFF
	

}
