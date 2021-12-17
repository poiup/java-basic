package interaction;

public class Seller {
	private int mango;
	private int apple;
	private int money;
	
	public Seller (int apple, int mango) {
		this.money = 0;
		this.apple = apple;
		this.mango = mango;
	}
	
	public void sellMango(int mango){
		this.mango -= mango;
		this.money = mango * 4000; 			
	}
	
	public void sellApple(int apple) {
		this.apple -= apple;
		this.money += apple * 2000;
	}
	
	public void showSeller() {
		System.out.println();
		System.out.println("상인의 물품 정보");
		System.out.println("사과 : " + this.apple);
		System.out.println("망고 : " + this.mango);
		System.out.println("돈 : " + this.money);
		System.out.println();
	}

	public int getMango() {
		return mango;
	}

	public int getApple() {
		return apple;
	}
	

}
