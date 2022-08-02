package tvvcr;

public class TVCRMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.power();
		tv.power();
		System.out.println("----------------------------------");
		TVCR tvcr = new TVCR();
		tvcr.power();
		tvcr.power();
		tvcr.power();
		
		System.out.println("채널 up 전 : " + tvcr.channel);
		
		for(int i = 0; i < 10; i++) {
			tvcr.channelUp();
		}
		TVCR tvcr1 = new TVCR(222);
		TVCR tvcr2 = new TVCR(333);
		TVCR tvcr3 = new TVCR(444);
		System.out.println(tvcr1);
		System.out.println(tvcr2);
		System.out.println(tvcr3);
		
		parents p = new parents();
		child1 ch1 = new child1();
		child1 ch2 = new child1(40);
		p.Iam();
		ch1.Iam();
		ch2.Iam();
	}

}
