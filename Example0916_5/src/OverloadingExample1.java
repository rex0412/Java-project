
public class OverloadingExample1 {

	int speed = 0;
	
	void speedUp(String key) {
		if (key == "위화살표") {
			speed = speed + 1;
		}
	}
	
	void speedUp(String key, String key2) {
		if((key == "위화살표")&&(key2 == "컨트롤")) {
			speed = speed + 100;
		}
	}
}
