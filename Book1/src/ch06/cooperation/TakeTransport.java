package ch06.cooperation;

public class TakeTransport {
	public static void main(String[] args) {
		
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 50000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	
		Taxi taxi2046 = new Taxi(2046);
		studentEdward.takeTaxi(taxi2046);
		studentEdward.showInfo();
		taxi2046.showInfo();
	}
}

