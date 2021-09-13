
public class Main {

	public static void main(String[] args) {
		int j = 1;
		//´Ü¼ö
		for (int i = 2; i <= 9; i++) {
			// 1~9  2*1 = 2
			while(j <= 9) {
				System.out.println(i+" *"+j+" = "+i*j);
				j++;
			}
			j = 1;
		}
	}
}
