
public class Main {

	public static void main(String[] args) {
		String user = "��";
		String computer = "����";
		
		switch (user) {
		case "����":
			if (computer == "����") {
				System.out.println("�����ϴ�.");
			}else if(computer == "����") {
				System.out.println("�����ϴ�.");
			}else {
				System.out.println("�̰���ϴ�.");
			}
			break;
		case "����":
			if (computer == "����") {
				System.out.println("�̰���ϴ�.");
			}else if(computer == "����") {
				System.out.println("�����ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
			break;
		case "��":
			if (computer == "����") {
				System.out.println("�����ϴ�.");
			}else if(computer == "����") {
				System.out.println("�̰���ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
			break;
		}
	}
}
