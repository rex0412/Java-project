
public class Main {

	public static void main(String[] args) {
		Student pilsang = new Student();
		
		pilsang.korScore = 100;
		pilsang.mathScore = 0;
		pilsang.engScore = 50;
		pilsang.scienceScore = 40;
		
		pilsang.scoreProcessing();
		
		System.out.println("���� : "+pilsang.getTotalScore());
		System.out.println("��� : "+pilsang.getAverageScore());
	}
}
