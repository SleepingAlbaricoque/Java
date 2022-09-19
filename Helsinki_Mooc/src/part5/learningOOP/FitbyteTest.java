package part5.learningOOP;

/* 날짜 : 2022.09.18
 * 이름 : 조수빈
 * 내용 : Fitbyte 클래스 만들기 실습
 */
class Fitbyte {
	int age;
	int restingHeartRate;
	
	public Fitbyte(int age, int restingHeartRate) {
		this.age = age;
		this.restingHeartRate = restingHeartRate;
	}
	
	public double targetHeartRate(double percentageOfMaximum) {
		double maxHeartRate = 206.3 - (0.711 * age);
		return (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
	}
}

public class FitbyteTest{
	public static void main(String[] args) {
		
		Fitbyte assistant = new Fitbyte(30, 60);
		
		double percentage = 0.5;
		
		while(percentage < 1.0) {
			double target = assistant.targetHeartRate(percentage);
			System.out.println("Target" + (percentage * 100) + "% of maximum: " + target);
			percentage += 0.1;
		}
	}
}
