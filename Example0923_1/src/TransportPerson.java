
public class TransportPerson {

	int money ;
	String name;
	private boolean bordingCheck = false;
	
	//��� ������
	public TransportPerson(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	void getOnBus(TransportBus bus) {
		if (bordingCheck == false) {
			bus.takeBus(1000);
			money = money - 1000;
			bordingCheck = true;
		}else {
			System.out.println("���߱����� �̿��ϰ� �ֽ��ϴ�.");
		}
	}
	
	void getOffBus(TransportBus bus) {
		bus.getOffBus();
		bordingCheck = false;
	}
	
	void getOnSubway(TransportSubway subway) {
		if (bordingCheck == false) {
			subway.takeSubway(1700);
			money = money - 1700;
			bordingCheck = true;
		}else {
			System.out.println(name+"�� ���߱����� �̿��ϰ� �ֽ��ϴ�.");
		}
	}
	
	void getOffSubway(TransportSubway Subway) {
		Subway.getOffSubway();
		bordingCheck = false;
	}
	
	void infoPrintln() {
		System.out.println(name+"�� ���� �� : "+money);
		if (bordingCheck) {
			System.out.println("���߱����� �̿��ϰ� �ֽ��ϴ�.");
		}else {
			System.out.println("�ɾ�ٴϰ� �ֽ��ϴ�.");
		}
		
	}

}
