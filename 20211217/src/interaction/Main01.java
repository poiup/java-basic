package interaction;

public class Main01 {
	public static void main(String[] args) {
		Buyer b1 = new Buyer(100000);
		Seller s1 = new Seller(2,3);
		
		b1.buyMango(5, s1);
		b1.buyApple(5,s1);
		
		b1.showBuyer();
		s1.showSeller();
	}
}
