package part11.packages.flight_control.ui;

import java.util.Scanner;

import part11.packages.flight_control.domain.Airplane;
import part11.packages.flight_control.domain.Flight;
import part11.packages.flight_control.logic.FlightControl;

public class TextUI {
	private FlightControl flightControl;
	private Scanner sc = new Scanner(System.in);
	
	public TextUI(FlightControl flightControl) {
		this.flightControl = flightControl;
	}
	
	public void start() {
		startAssessControl();
		System.out.println();
		startFlightControl();
		System.out.println();
	}
	
	private void startAssessControl() {
		System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        assetControl: while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String answer = sc.nextLine();
            
            switch(answer) {
            	case("1"):
            		addAirplane();
            		break;
            	case("2"):
            		addFlight();
            		break;
            	case("x"):
            		break assetControl;
            	default:
            		System.out.println("Invald command. Please try again.");
            }
        }
	}
	
	private void addAirplane() {
		System.out.println("Give the airplane id: ");
		String id = sc.nextLine();
		System.out.println("Give the airplane capacity: ");
		int capacity = Integer.parseInt(sc.nextLine());
		
		flightControl.addAirplane(id, capacity);
	}
	
	private void addFlight() {
		Airplane airplane = askForAirplane();
		System.out.println("Give the departure airport id: ");
		String deptId = sc.nextLine();
		System.out.println("Give the target airport id: ");
		String targetId = sc.nextLine();
		
		flightControl.addFlight(airplane, deptId, targetId);
	}
	
	private void startFlightControl() {
		System.out.println("Flight Control");
		System.out.println("--------------");
		System.out.println();
		
		flightctrl: while(true) {
			System.out.println("Choose an action");
			System.out.println("[1] Print airplanes");
			System.out.println("[2] Print flights");
			System.out.println("[3] Print airplane details");
			System.out.println("[x] Quit");
			
			System.out.println("> ");
			String answer = sc.nextLine();
			
			switch(answer) {
				case("1"):
					printAirplanes();
					break;
				case("2"):
					printFlights();
					break;
				case("3"):
					printAirplaneDetails();
					break;
				case("x"):
					break flightctrl;
				default:
					System.out.println("Invalid command. Please try again.");
			}
		}
	}
	
	private void printAirplanes() {
		for(Airplane plane : flightControl.getAirplanes())
			System.out.println(plane);
	}
	
	private void printFlights() {
		for(Flight flight : flightControl.getFlights())
			System.out.println(flight);
	}
	
	private void printAirplaneDetails() {
		Airplane plane = askForAirplane();
		System.out.println(plane);
	}
	
	private Airplane askForAirplane() {
		Airplane airplane = null;
		while(airplane == null) {
			System.out.println("Give the airplane id: ");
			String id = sc.nextLine();
			airplane = flightControl.getAirplane(id);
			
			if(airplane == null)
				System.out.println("No airplane with the id " + id + ". Please try again.");
		}
		
		return airplane;
	}
}
