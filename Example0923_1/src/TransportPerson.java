
public class TransportPerson {

	int money ;
	String name;
	private boolean bordingCheck = false;
	
	//사람 생성자
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
			System.out.println("대중교통을 이용하고 있습니다.");
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
			System.out.println(name+"은 대중교통을 이용하고 있습니다.");
		}
	}
	
	void getOffSubway(TransportSubway Subway) {
		Subway.getOffSubway();
		bordingCheck = false;
	}
	
	void infoPrintln() {
		System.out.println(name+"의 남은 돈 : "+money);
		if (bordingCheck) {
			System.out.println("대중교통을 이용하고 있습니다.");
		}else {
			System.out.println("걸어다니고 있습니다.");
		}
		
	}

}
