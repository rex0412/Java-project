package takeTrans;

public class Student {

	String studentName;
	int grade;
	int money;
	
	boolean takeState = false;
	
	public Student(String name, int money) {
		studentName = name;
		this.money = money;
	}
	
	void takeBus(Bus bus) {
		if (takeState) {
			System.out.println("���߱����� �̿����Դϴ�.");
		}else {
			bus.take(1000);
			money = money - 1000;
			takeState = true;
		}
	}

	void takeSubway(Subway subway) {
		subway.take(1000);
		money = money - 1000;
	}
	
	void showStudentInfo() {
		System.out.println(studentName + "�л��� ���� ���� "+
							money+"�� �Դϴ�.");
	}
}
