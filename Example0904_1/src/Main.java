
public class Main {
	
	public static void main(String[] args) {
		
		String gender = "����";
		int height = 180;
		
		System.out.println(gender == "����"); //ture
		System.out.println(height == 184); //false
		System.out.println(gender == "����" || height == 184); //false
	}

}
