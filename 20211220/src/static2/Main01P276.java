package static2;

public class Main01P276 {
	public static void main(String[] args) {
		Asean a1 = new Asean(20, 15, 12); 
		Asean a2 = new Asean(20, 21, 22); 
		Asean a3 = new Asean(13, 30, 28); 
		Asean a4 = new Asean(20, 30, 30); 
		
		System.out.println(Asean.getPresentationScore());
		Asean.showPre();
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
}
