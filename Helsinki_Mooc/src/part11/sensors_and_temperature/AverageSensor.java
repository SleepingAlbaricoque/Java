package part11.sensors_and_temperature;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
	private List<Sensor> sensors = new ArrayList<>();
	private List<Integer> avgs = new ArrayList<>();
	
	@Override
	public boolean isOn() {
		if(sensors.stream().filter(s -> s.isOn()).count() == sensors.size())
			return true;
		
		return false;
	}

	@Override
	public void setOn() {
		sensors.stream().forEach(sensor -> sensor.setOn());
	}

	@Override
	public void setOff() {
		sensors.stream().forEach(sensor -> sensor.setOff());
	}

	@Override
	public int read() throws IllegalStateException {
		if(sensors.size() == 0 || this.isOn() == false)
			throw new IllegalStateException();
		else {
			int avg = (int) Math.floor(sensors.stream().mapToInt(s -> s.read()).average().getAsDouble());
			avgs.add(avg);
			return avg;
		}
	}

	public void addSensor(Sensor toAdd) {
		sensors.add(toAdd);
	}
	
	public List<Integer> readings(){
		return avgs;
	}
	
	public static void main(String[] args) {
		Sensor kumpula = new TemperatureSensor();
	    Sensor kaisaniemi = new TemperatureSensor();
	    Sensor helsinkiVantaaAirport = new TemperatureSensor();

	    AverageSensor helsinkiRegion = new AverageSensor();
	    helsinkiRegion.addSensor(kumpula);
	    helsinkiRegion.addSensor(kaisaniemi);
	    helsinkiRegion.addSensor(helsinkiVantaaAirport);

	    helsinkiRegion.setOn();
	    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
	    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
	    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

	    System.out.println("readings: " + helsinkiRegion.readings());
	}
}
