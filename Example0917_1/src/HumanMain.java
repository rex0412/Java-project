
public class HumanMain {

	public static void main(String[] args) {
		Human human = new Human();
		human.firstName = "��";
		human.secondName = "�ʻ�";
		human.height = 184;
		
		System.out.println(human.firstName);
		System.out.println(human.secondName);
		
		Human human2 = new Human("��", "�ʻ�");
		System.out.println(human2.firstName);
		System.out.println(human2.secondName );
	}
}
