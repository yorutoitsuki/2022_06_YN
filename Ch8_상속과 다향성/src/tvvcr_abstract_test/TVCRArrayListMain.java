package tvvcr_abstract_test;



public class TVCRArrayListMain  {
	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		tvcr.power();
		System.out.println("TVCR barcode : " + tvcr.barcode);
		System.out.println("TVCR channer : " + tvcr.channel);
		tvcr.channelUp();
		tvcr.channelUp();
		tvcr.channelUp();
		tvcr.channelUp();
		tvcr.channelUp();
		System.out.println("TVCR channer : " + tvcr.channel);
		tvcr.addVCR();
		tvcr.bootVCR(0);
		tvcr.bootVCR(1);
		tvcr.getPlay(0);
		
	}
}
