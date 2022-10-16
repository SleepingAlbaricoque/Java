package part8.similarity_of_objects.vehicle_registry;

import java.util.ArrayList;
import java.util.HashMap;

/* 날짜 : 2022.10.16
 * 이름 : 조수빈
 * 내용 : equals, hashCode 메서드 실습하기
 */
public class LicensePlate {
	private final String liNumber;
	private final String country;
	
	public LicensePlate(String country, String liNumber) {
		this.liNumber = liNumber;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return country + " " + liNumber;
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object)
			return true;
		
		if(!(object instanceof LicensePlate))
			return false;
		
		LicensePlate li = (LicensePlate) object;
		if(this.liNumber.equals(li.liNumber) && this.country.equals(li.country))
			return true;
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = (int) Math.ceil(Math.random());
		hash = 31 * hash + Integer.valueOf(liNumber.substring(5));
		return hash;
	}
	
	public static void main(String[] args) {
		LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
	}
}
