package drill;

public class Gun {
	String GunName = "gun";
	int Magazine = 0;
	String Bullet = "NATO";
	
	public void shot() {
		if(Magazine == 0) {//잔탄수가 0일시
			System.out.println("재장전!");
			reload();
		}else {
			Magazine--;
			System.out.println(this.GunName + " 발사!" + "잔탄 : " + Magazine);
		}
	}
	public void reload() {
		Magazine = 10;
		System.out.println("장전완료" + "잔탄 : " + Magazine);
	}
	
	public void getName() {
		System.out.println(GunName);
	}
	public void Bullet() {
		System.out.println(Bullet);
	}
}

class k2 extends Gun {
	String GunName = "k2";
	int Magazine = 0;
	String Bullet = "PUNGSAN";
	
	public void shot() {
		if(Magazine == 0) {//잔탄수가 0일시
			System.out.println("재장전!");
			reload();
		}else {
			Magazine--;
			System.out.println(this.GunName + " 발사!" + "잔탄 : " + Magazine);
		}
	}
	
	public void reload() {
		Magazine = 30;
		System.out.println("장전완료" + "잔탄 : " + Magazine);
	}
	
}
