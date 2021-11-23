package takeTrans;

public class Bus {

	int money;
	int busNumber;
	int passengerCount;
	
	public Bus(int Number) {
		busNumber = Number;
	}
	
	public void take(int money) {
		//¼Õ´ÔÀÌ ³½ µ·À» ¹Ş¾Æ¿Í¼­ ¹ö½º µ·Åë¿¡ ³Ö´Â´Ù
		this.money += money;
		//½Â°´ÀÌ µ·À» ³ÂÀ¸´Ï±ñ 1¸í Áõ°¡
		passengerCount++;
	}
	
	void showInfo() {
		System.out.println("¹ö½º "+busNumber +
				"¹øÀÇ ½Â°´¼ö´Â "+passengerCount+
				"¸í ÀÔ´Ï´Ù.");
	}

}
