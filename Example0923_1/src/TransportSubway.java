
public class TransportSubway {
	
	final int MAX_PASSENGER = 80;
	private int passengerNumber = MAX_PASSENGER;
	private int money;
	public void takeSubway(int money) {
		this.money = money;
		passengerNumber = passengerNumber - 1;
		
	}
	  void getOffSubway() {
		  passengerNumber = passengerNumber + 1;
		
	}
	  void infoPrintln() {
			System.out.println("ž�� ���� �°� :"+passengerNumber);
			System.out.println("����ö�� ���ͱ�: "+money);
		}

}
