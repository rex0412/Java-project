
public class TransportBus {

	final int MAX_PASSENGER = 25;
	private int passengerNumber = MAX_PASSENGER;
	private int money; //���ͱ�
	
	public void takeBus(int i) {
		this.money = money;
		passengerNumber = passengerNumber - 1;
	}

	public void getOffBus() {
		passengerNumber = passengerNumber + 1;
	}
	
	void infoPrintln() {
		System.out.println("ž�� ���� �°� :"+passengerNumber);
		System.out.println("������ ���ͱ�: "+money);
	}
}
