package part8.grouping_data_using_hash_maps.storage_facility;

import java.util.ArrayList;
import java.util.HashMap;

/* 날짜 : 2022.10.17
 * 이름 : 조수빈
 * 내용 : list를 값으로 가지는 hashMap 생성 실습하기 
 */
public class StorageFacility {
	private HashMap<String, ArrayList<String>> stock;
	
	public StorageFacility() {
		this.stock = new HashMap<>();
	}
	
	public void add(String unit, String item) {
		stock.putIfAbsent(unit, new ArrayList<>());
		
		stock.get(unit).add(item);
	}
	
	public ArrayList<String> contents(String storageUnit){
		if(!(stock.containsKey(storageUnit)) || stock.get(storageUnit) == null)
			return new ArrayList<>();
		
		return stock.get(storageUnit);
	}
	
	public void remove(String storageUnit, String item) {
		stock.get(storageUnit).remove(stock.get(storageUnit).lastIndexOf(item));
		
		if(stock.get(storageUnit) == null)
			stock.remove(storageUnit);
	}
	
	public ArrayList<String> storageUnits(){
		ArrayList<String> unitList = new ArrayList<>();
		for(String unit : stock.keySet()) {
			if(!(stock.get(unit).isEmpty()))
				unitList.add(unit);
		}
		
		return unitList;
	}
	
	public static void main(String[] args) {
		StorageFacility facility = new StorageFacility();
		facility.add("a14", "ice skates");
		facility.add("a14", "ice hockey stick");
		facility.add("a14", "ice skates");

		facility.add("f156", "rollerblades");
		facility.add("f156", "rollerblades");

		facility.add("g63", "six");
		facility.add("g63", "pi");

		facility.remove("f156", "rollerblades");

		System.out.println(facility.contents("f156"));

		facility.remove("f156", "rollerblades");

		System.out.println(facility.storageUnits());
	}
}
