package ch06.staticex;

public class Student3 {

	private static int CardNum;
	private static int serialNum = 1000;
	int studentID;
	
	public Student3 () {
		serialNum++;
		CardNum = serialNum + 100;	
	}
	
	public int getCardNum() {
		return CardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.CardNum = cardNum;
	}
}
