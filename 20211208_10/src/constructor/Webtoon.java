package constructor;

public class Webtoon {
	// 웹툰은 임의로 여러분들이 정보/속성을 추가해주셔도 됩니다.
	// name(제목), series(회차), painter(작가), complete(완결여부)
	
	// 생성자에는 위 4개 정보를 입력받도록 해주시고
	// complete는 처음 생성시 false, series는 1로 자동으로 입력됩니다.
	
	// 웹툰 정보 안내하기 getInfo() -> "제목은 : name, 회차는 series...."
	// 웹툰업로드하기 uploadWebtoon() -> series를 1증가
	// 웹툰 완결 지식 completeWebton() -> complete변수를 true로 변경
	
	// 위 기능들을 구현해주신 다음 Main03p204에서 실행해주시면 됩니다.
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Webtoon(String n, String p) {
		name = n;
		series = 1;
		painter = p;
		complete = false;
	}
	
	public void getInfo() {
		System.out.println("제목 : " + name + ", 회차 : " + series+ ", 작가 : " + painter + ", 완결여부 : " + complete);
	}
	
	public void uploadWebtoon() {
		series ++;
	}
	
	public void completeWebtoom() {
		complete = true;
	}
}
