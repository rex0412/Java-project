package takeTrans;

public class Main {

	public static void main(String[] args) {
		Student pilsang = new Student("윤필상", 10000);
		Student hyunjun = new Student("윤현준", 5000);
		Student sungjun = new Student("윤성준", 3000);
		
		Bus bus2312 = new Bus(2312);
		
		pilsang.showStudentInfo();
		// 10000원
		pilsang.takeBus(bus2312);
		// 버스에 1000원 내고, 내꺼 1000줄이고

		pilsang.showStudentInfo();
		
		pilsang.takeBus(bus2312);
		
		pilsang.showStudentInfo();
	}
}
