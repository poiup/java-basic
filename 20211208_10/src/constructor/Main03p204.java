package constructor;

public class Main03p204 {
	public static void main(String[] args) {
		Webtoon w1 = new Webtoon("웹툰임", "김모씨");
		
		w1.getInfo();
		
		w1.uploadWebtoon();
		
		w1.getInfo();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.completeWebtoom();
		w1.getInfo();
	}
}
