
public class Main {

	public static void main(String[] args) {
		int i = 0;
		
		while (i < 10) {
			System.out.println(i+"번 출력하였습니다.");
			//i 값이 증가되는 코드가 없음.
			i++;
			if(i == 5)break;
		}
		
		System.out.println("반복문 처리 후 i값: "+i);;
	}
}
