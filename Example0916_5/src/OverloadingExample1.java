
public class OverloadingExample1 {

	int speed = 0;
	
	void speedUp(String key) {
		if (key == "��ȭ��ǥ") {
			speed = speed + 1;
		}
	}
	
	void speedUp(String key, String key2) {
		if((key == "��ȭ��ǥ")&&(key2 == "��Ʈ��")) {
			speed = speed + 100;
		}
	}
}
