
public class TransportMain {

	public static void main(String[] args) {
		TransportPerson pilsang = new TransportPerson("���ʻ�", 10000);
		TransportPerson sukho = new TransportPerson("�̼�ȣ", 10000);
		TransportPerson seohyun = new TransportPerson("�̼���", 10000);
		
		TransportBus blueBus = new TransportBus();
		TransportSubway greenSubway = new TransportSubway();
		
		pilsang.infoPrintln();
		blueBus.infoPrintln();
		System.out.println();
		pilsang.getOnBus(blueBus);
		pilsang.infoPrintln();
		blueBus.infoPrintln();
		
		sukho.getOnBus(blueBus);
		System.out.println();
		sukho.infoPrintln();
		blueBus.infoPrintln();
		System.out.println();
		pilsang.getOffBus(blueBus);
		sukho.getOffBus(blueBus);
		blueBus.infoPrintln();
	}
}