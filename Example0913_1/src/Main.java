
public class Main {

	public static void main(String[] args) {
		String user = "보";
		String computer = "바위";
		
		switch (user) {
		case "가위":
			if (computer == "가위") {
				System.out.println("비겼습니다.");
			}else if(computer == "바위") {
				System.out.println("졌습니다.");
			}else {
				System.out.println("이겼습니다.");
			}
			break;
		case "바위":
			if (computer == "가위") {
				System.out.println("이겼습니다.");
			}else if(computer == "바위") {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("졌습니다.");
			}
			break;
		case "보":
			if (computer == "가위") {
				System.out.println("졌습니다.");
			}else if(computer == "바위") {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
		}
	}
}
