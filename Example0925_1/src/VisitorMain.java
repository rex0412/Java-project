
public class VisitorMain {

	public static void main(String[] args) {
		Visitor visitor1 = new Visitor("���ʻ�", 10000);
		Visitor visitor2 = new Visitor("�谳��", 10000);
		Visitor visitor3 = new Visitor("������", 10000);
		Visitor visitor4 = new Visitor("ȫ����", 10000);
		
		visitor4.visitMarket();//1
		visitor2.visitMarket();//2
		visitor1.visitMarket();//3
		visitor3.visitMarket();//4
		
		visitor1.myStayNumberInfo();
		visitor2.myStayNumberInfo();
		visitor3.myStayNumberInfo();
		visitor4.myStayNumberInfo();
		
	}
}
