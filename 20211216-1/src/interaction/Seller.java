package interaction;

public class Seller {
	private int money;
	private int mango;
	
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
	}
	
	public void sellMango(int mango){
		if (mango > this.mango) {
			System.out.println("* 망고가 모자랍니다. 현재 망고 재고 : "+ this.mango + " *" );
			return;
		} else {
			this.mango -= mango;
			this.money = mango * 5000; 			
		}
	}

	public int getMango() {
		return this.mango;
	}
	
	public void showSeller() {
		System.out.println();
		System.out.println("-----------------상인정보--------------");
		System.out.println("소지금 : " + this.money + ", 망고재고 : " + this.mango);
		System.out.println("------------------------------------");
	}
}
