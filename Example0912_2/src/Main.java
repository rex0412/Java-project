import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int inputCheck = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("�̸��� �Է��ϼ��� :");
			System.out.println("���̸� �Է��ϼ��� :");
			System.out.println("�ּҸ� �Է��ϼ��� :");
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(1.yes/2.No) :");
			inputCheck = scanner.nextInt();
		} while (inputCheck == 1);
	}
}
