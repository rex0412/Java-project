
public class Main {
	
	public static void main(String[] args) {
		Human pilsang = new Human();
		Food pizza = new Food();
		pizza.value = 8;
		
		pilsang.humanState();
		pilsang.eat(pizza);
		
		pilsang.humanState();
	}

}
