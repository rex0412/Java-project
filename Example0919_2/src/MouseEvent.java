
public class MouseEvent {

	Frame frame;
	
	public MouseEvent(Frame frame) {
		this.frame = frame;
		println();	
	}

	private void println() {
		frame.a = 10;
		frame.b = 20;
		frame.result = frame.a + frame.b + "";
		System.out.println("���� ���� : "+frame.result);
		
	}

}
