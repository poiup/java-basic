package inheritance;

public class Main02P254 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "안재영";
		stu1.age = 15;
		stu1.stuNum = 1;
		
		Salaryman sa1 = new Salaryman();
		sa1.name = "안재영";
		sa1.age = 24;
		sa1.salary = 4000;
		
		stu1.getInfo();
		stu1.getStudentInfo();
		
		sa1.getInfo();
		sa1.getSalaryInfo();
	}
}
