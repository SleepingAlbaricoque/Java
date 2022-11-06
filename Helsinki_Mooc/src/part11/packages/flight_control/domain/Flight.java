package part11.packages.flight_control.domain;

public class Flight {
	private Airplane airplane;
	private Place deptAirport;
	private Place targetAirport;
	
	public Flight(Airplane airplane, Place deptAirport, Place targetAirport) {
		this.airplane = airplane;
		this.deptAirport = deptAirport;
		this.targetAirport = targetAirport;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public Place getDeptAirport() {
		return deptAirport;
	}

	public Place getTargetAirport() {
		return targetAirport;
	}
	
	public String toString() {
		return airplane.toString() + " (" + deptAirport + "-" + targetAirport + ")";
	}
}
