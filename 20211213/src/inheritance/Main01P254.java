package inheritance;

public class Main01P254 {
	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할수 있습니다.
		
		Student s1 = new Student();
		s1.name = "안재영";
		s1.age = 24;
		s1.stuNum = 001;
				
		s1.getInfo();
		s1.getStudentInfo();
	}	
}
