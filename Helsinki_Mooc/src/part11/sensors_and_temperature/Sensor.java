package part11.sensors_and_temperature;

public interface Sensor {
	boolean isOn();
	void setOn();
	void setOff();
	int read() throws IllegalStateException;
}
