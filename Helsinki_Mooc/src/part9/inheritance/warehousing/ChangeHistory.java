package part9.inheritance.warehousing;

import java.util.ArrayList;

public class ChangeHistory {
	ArrayList<Double> log;
	
	public ChangeHistory() {
		this.log = new ArrayList<>();
	}
	
	public void add(double status) {
		log.add(status);
	}
	
	public void clear() {
		log.clear();
	}
	
	public String toString() {
		return log.toString();
	}
	
	public double maxValue() {
		if(log.isEmpty())
			return 0.0;
		else {
			double max =0.0;
			for(double num : log) {
				if(max <= num)
					max = num;
			}
			return max;
		}	
	}
	
	public double minValue() {
		if(log.isEmpty())
			return 0.0;
		else {
			double min =1000.0;
			for(double num : log) {
				if(min >= num)
					min = num;
			}
			return min;
		}	
	}
	
	public double average() {
		if(log.isEmpty())
			return 0.0;
		else {
			double sum =0.0;
			for(double num : log)
				sum += num;
			return sum / log.size();
		}
	}
	
}
