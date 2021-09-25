
public class Visitor {
	
	static int stayState = 0;
	int money;
	int myStatyNumber;
	String name;
	
	public Visitor(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	void visitMarket() {
		stayState++;
		myStatyNumber = stayState;
	}
	
	void myStayNumberInfo() {
		System.out.println(name + "의 대기번호는 "+"번 입니다.");
	}

}
