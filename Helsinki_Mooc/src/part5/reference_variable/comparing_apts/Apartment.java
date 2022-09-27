package part5.reference_variable.comparing_apts;

/* 날짜 : 2022.09.27
 * 이름 : 조수빈
 * 내용 : 객체를 변수로 가지는 메서드 작성 실습하기
 */
public class Apartment {
	private int rooms;
	private int squares;
	private int pricePerSquare;
	
	public Apartment(int rooms, int squares, int pricePerSquare) {
		this.rooms = rooms;
		this.squares = squares;
		this.pricePerSquare = pricePerSquare;
	}
	
	public boolean largerThan(Apartment compared) {
		if(this.squares > compared.squares)
			return true;
		else
			return false;
	}
	
	public int priceDifference(Apartment compared) {
		return Math.abs(this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares);
	}
	
	public boolean moreExpensiveThan(Apartment compared) {
		if(this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
		Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
		Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

		System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
		System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
		
		System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
		System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
		
		System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
		System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
	}
}
