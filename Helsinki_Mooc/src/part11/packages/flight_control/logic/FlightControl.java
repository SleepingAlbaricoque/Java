package part11.packages.flight_control.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import part11.packages.flight_control.domain.Airplane;
import part11.packages.flight_control.domain.Flight;
import part11.packages.flight_control.domain.Place;

public class FlightControl {
	private Map<String, Airplane> airplanes;
	private Map<String, Flight> flights;
	private Map<String, Place> places;
	
	public FlightControl() {
		this.airplanes = new HashMap<>();
		this.flights = new HashMap<>();
		this.places = new HashMap<>();
	}
	
	public void addAirplane(String id, int capacity) {
		Airplane newPlane = new Airplane(id, capacity);
		airplanes.put(id, newPlane);
	}
	
	public void addFlight(Airplane plane, String dept, String target) {
		places.putIfAbsent(dept, new Place(dept));
		places.putIfAbsent(target, new Place(target));
		
		Flight flight = new Flight(plane, places.get(dept), places.get(target));
		flights.put(flight.toString(), flight);
	}
	
	public Collection<Airplane> getAirplanes(){
		return airplanes.values();
	}
	
	public Collection<Flight> getFlights(){
		return flights.values();
	}
	
	public Airplane getAirplane(String id) {
		return airplanes.get(id);
	}
}
