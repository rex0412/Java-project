
public class Human {
	int hungryGage = 10;
	
	void humanState() {
		System.out.println("����� ���� :"+hungryGage);
	}
	public void eat(Food food) {
		if(food.value > 1)
			--hungryGage;
	}

}
