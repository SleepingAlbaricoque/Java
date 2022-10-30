package part9.interface_practice.online_shop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
	private Map<String, Integer> prices;
	private Map<String, Integer> stockBalance;
	
	public Warehouse() {
		this.prices = new HashMap<>();
		this.stockBalance = new HashMap<>();
	}
	
	public void addProduct(String product, int price, int stock) {
		prices.put(product, price);
		stockBalance.put(product, stock);
	}
	
	public int price(String product) {
		if(prices.containsKey(product))
			return prices.get(product);
		
		return -99;
	}
	
	public int stock(String product) {
		if(stockBalance.containsKey(product))
			return stockBalance.get(product);
		
		return 0;
	}
	
	public boolean take(String product) {
		if(stockBalance.containsKey(product) && stockBalance.get(product) > 0) {
			stockBalance.put(product, stockBalance.get(product) - 1);
			return true;
		}
		return false;		
	}
	
	public Set<String> products(){
		Set<String> prodNames = new HashSet<>();
		
		for(String product : prices.keySet())
			prodNames.add(product);
		
		return prodNames;
	}
}
