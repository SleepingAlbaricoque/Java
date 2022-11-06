package part11.sensors_and_temperature;

import java.util.Random;

public class TemperatureSensor implements Sensor{
	private boolean status;
	
	public TemperatureSensor() {
		status = false;
	}
	
	@Override
	public boolean isOn() {
		return status;
	}

	@Override
	public void setOn() {
		status = true;
	}

	@Override
	public void setOff() {
		status = false;
	}

	@Override
	public int read() throws IllegalStateException {
		if(status)
			return new Random().nextInt(61) -30;
		else
			throw new IllegalStateException("The sensor is off");
	}

}
