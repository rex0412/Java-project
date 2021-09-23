
public class TransportBus {

	final int MAX_PASSENGER = 25;
	private int passengerNumber = MAX_PASSENGER;
	private int money; //수익금
	
	public void takeBus(int i) {
		this.money = money;
		passengerNumber = passengerNumber - 1;
	}

	public void getOffBus() {
		passengerNumber = passengerNumber + 1;
	}
	
	void infoPrintln() {
		System.out.println("탑승 가능 승객 :"+passengerNumber);
		System.out.println("버스의 수익금: "+money);
	}
}
