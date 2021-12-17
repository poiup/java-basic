package interaction;
public class Buyer {
	private int money;
	private int mango;
	private int apple;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.apple = 0;
	}
	
	public void buyMango(int mango, Seller seller) {	
		if( seller.getMango() < mango) {
			System.out.println("망고의 재고가 부족하여 현재 망고량인 "+seller.getMango()+" 만큼 구매합니다.");
			mango = seller.getMango();
		} else {
			System.out.println("망고를 " + mango + "개 구매합니다");
		}
		seller.sellMango(mango);
		money -= mango * 4000;
		mango += mango;
	}
	
	public void buyApple(int apple, Seller seller) {	
		if( seller.getApple() < apple) {
			System.out.println("사과의 재고가 부족하여 현재 망고량인 "+seller.getApple()+" 만큼 구매합니다.");
			apple = seller.getApple();
		} else {
			System.out.println("사과를 " + apple + "개 구매합니다");
		}
		seller.sellApple(apple);
		money -= apple * 2000;
		apple += apple;
	}
	
	public void showBuyer() {
		System.out.println();
		System.out.println("-----------------구매자정보--------------");
		System.out.println("소지금 : " + this.money + ", 망고재고 : " + this.mango + ", 사과재고 : " + this.apple);
		System.out.println("------------------------------------");
	}
}
