package interaction;

public class Buyer {
	private int money;
	private int mango;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
	
	public void buyMango(int mango, Seller seller) {
		if(this.money < mango * 5000) {
			System.out.println("돈이 부족합니다. 현재 소지금 : " + money);
		} else {
			seller.sellMango(mango);
			if(seller.getMango() < mango) {
				return;
			} else {
				this.mango += mango;
				this.money -= mango * 5000;
			}
		}
	}
	

//	public void buyMango(Seller seller, int mango) {
//		// 소지금 부족시
//		if((mango * 4000) > this.money) {
//			System.out.println("돈이 모자랍니다. 소지금 : "+ this.money);
//			return;
//		}
//		// 망고가 적을시
//		if(seller.getMango() < mango) {
//			System.out.println("망고 재고가 부족합니다. 망고 재고 : "+ seller.getMango());
//			return;
//		}
//		this.money -= mango * 4000;
//		this.mango += mango;
//		
//		seller.sellMango(mango)
//	}
	
	public void showBuyer() {
		System.out.println();
		System.out.println("-----------------구매자정보--------------");
		System.out.println("소지금 : " + this.money + ", 망고재고 : " + this.mango);
		System.out.println("------------------------------------");
	}
}
