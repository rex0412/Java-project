public class StringIntMainExample2 {

	public static void main(String[] args) {
		System.out.println(answer("윤필상", 17));
		System.out.println("나의 이름은 윤필상이고, 나이는 17세 이다.");
	}
	
	static String answer(String name, int age) {
		return "나의 이름은" +name+"이고, 나이는 "+age+"세 이다.";
	}
}
