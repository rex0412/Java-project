package takeTrans;

public class Main {

	public static void main(String[] args) {
		Student pilsang = new Student("���ʻ�", 10000);
		Student hyunjun = new Student("������", 5000);
		Student sungjun = new Student("������", 3000);
		
		Bus bus2312 = new Bus(2312);
		
		pilsang.showStudentInfo();
		// 10000��
		pilsang.takeBus(bus2312);
		// ������ 1000�� ����, ���� 1000���̰�

		pilsang.showStudentInfo();
		
		pilsang.takeBus(bus2312);
		
		pilsang.showStudentInfo();
	}
}
