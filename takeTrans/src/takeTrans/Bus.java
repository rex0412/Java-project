package takeTrans;

public class Bus {

	int money;
	int busNumber;
	int passengerCount;
	
	public Bus(int Number) {
		busNumber = Number;
	}
	
	public void take(int money) {
		//�մ��� �� ���� �޾ƿͼ� ���� ���뿡 �ִ´�
		this.money += money;
		//�°��� ���� �����ϱ� 1�� ����
		passengerCount++;
	}
	
	void showInfo() {
		System.out.println("���� "+busNumber +
				"���� �°����� "+passengerCount+
				"�� �Դϴ�.");
	}

}
