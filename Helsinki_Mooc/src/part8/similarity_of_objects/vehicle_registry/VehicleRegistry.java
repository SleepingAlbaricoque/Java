package part8.similarity_of_objects.vehicle_registry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
	HashMap<LicensePlate, String> registry;
	
	public VehicleRegistry() {
		registry = new HashMap<>();
	}	
		
	public boolean add(LicensePlate licensePlate, String owner) {
		if(!(registry.containsKey(licensePlate))) {
			registry.put(licensePlate, owner);
			return true;
		}
		
		return false;
	}
	
	public String get(LicensePlate licensePlate) {
		if(registry.containsKey(licensePlate))
			return registry.get(licensePlate);
		
		return null;
	}
	
	public boolean remove(LicensePlate licensePlate) {
		if(registry.containsKey(licensePlate)) {
			registry.remove(licensePlate);
			return true;
		}
		
		return false;
	}
	
	public void printLicensePlates() {
		for(LicensePlate lp : registry.keySet())
			System.out.println(lp);
	}
	
	public void printOwners() {
		Set<String> ownerSet = new HashSet<>();
		
		for(LicensePlate lp : registry.keySet()) {
			String owner = registry.get(lp);
			ownerSet.add(owner);
			if(!(ownerSet.contains(owner))) {
				System.out.println(owner);
			}
		}
	}
}

