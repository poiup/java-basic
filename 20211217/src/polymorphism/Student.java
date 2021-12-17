package polymorphism;

public class Student extends Person {

	// 학생의 등급인 grade를 선언합니다.
	private int grade;
	
	public Student (String name, int grade, int age) {
		super(name,age);
		this.grade = grade;
	}
	
	public void showPerson() {
		// 부모쪽 showPerson호출
		super.showPerson();
		System.out.println("학생의 성적 : " +grade);
	}
	
	// 신분을 밝히는 코드를 Student에만(Person에는 정의 X) 작성합시다.
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}
}
