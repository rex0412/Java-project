
public class Main {

	public static void main(String[] args) {
		
		String trafficLight = "검정불";
		
		switch (trafficLight) {
		case "빨간불":
			System.out.println("정차 하세요.");
			break;
		case "파란불":
			System.out.println("출발 하세요.");
			break;
		case "노란불":
			System.out.println("어... 멈추세요~");
			break;
		
		}
	
		System.out.println("종료되었습니다.");
	}
}
