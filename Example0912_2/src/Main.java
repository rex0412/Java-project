import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int inputCheck = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("이름을 입력하세요 :");
			System.out.println("나이를 입력하세요 :");
			System.out.println("주소를 입력하세요 :");
			System.out.println("계속 입력하시겠습니까?(1.yes/2.No) :");
			inputCheck = scanner.nextInt();
		} while (inputCheck == 1);
	}
}
