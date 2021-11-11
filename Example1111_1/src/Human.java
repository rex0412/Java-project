
public class Human {
	int hungryGage = 10;
	
	void humanState() {
		System.out.println("¹è°íÇÄ Áö¼ö :"+hungryGage);
	}
	public void eat(Food food) {
		if(food.value > 1)
			--hungryGage;
	}

}
