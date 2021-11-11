
public class Student {
	
	String stName;
	int classNumber;
	int stNumber;
	int korScore;
	int engScore;
	int mathScore;
	int scienceScore;
	int totalScore;
	int averageScore;
	
	void scoreProcessing() {
		totalScore = korScore + engScore
				   + mathScore + scienceScore;
		averageScore = totalScore / 4;
	}
	
	int getTotalScore(){
		
		return totalScore;
	    }
	
	int getAverageScore() {
		
		return averageScore;
	}
}
