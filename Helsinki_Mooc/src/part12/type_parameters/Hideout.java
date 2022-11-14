package part12.type_parameters;

import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
	private List<T> hidden;
	
	public Hideout() {
		this.hidden = new ArrayList<>();
	}
	
	public void putIntoHideout(T toHide) {
		if(!hidden.isEmpty()) {
			hidden.clear();
			hidden.add(toHide);
		}	
		else hidden.add(toHide);
	}
	
	public T takeFromHideout() {
		if(hidden.isEmpty())
			return null;
		else {
			T value = hidden.get(0);
			hidden.clear();
			return value;
		}
	}
	
	public boolean isInHideout() {
		if(hidden.isEmpty())
			return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Hideout<String> den = new Hideout<>();
		System.out.println(den.isInHideout());
		den.putIntoHideout("peekaboo");
		System.out.println(den.isInHideout());
		System.out.println(den.takeFromHideout());
		System.out.println(den.isInHideout());
		den.putIntoHideout("toodaloo");
		den.putIntoHideout("heelloo");
		System.out.println(den.isInHideout());
		System.out.println(den.takeFromHideout());
		System.out.println(den.isInHideout());	
	}
}
