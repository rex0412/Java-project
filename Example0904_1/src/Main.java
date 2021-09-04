
public class Main {
	
	public static void main(String[] args) {
		
		String gender = "남성";
		int height = 180;
		
		System.out.println(gender == "남성"); //ture
		System.out.println(height == 184); //false
		System.out.println(gender == "남성" || height == 184); //false
	}

}
