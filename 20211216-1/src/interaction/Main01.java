package interaction;

public class Main01 {
	public static void main(String[] args) {
		Buyer b1 = new Buyer(10000);
		Seller s1 = new Seller(10);
		
		b1.buyMango(20, s1);
		
		b1.showBuyer();
		s1.showSeller();
	}
}
