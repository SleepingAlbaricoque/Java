package part12.collections.hash_map;

import part12.collections.List;

public class HashMap<K, V> {
	private List<Pair<K, V>>[] values; // note it's a user made List class, not the one that belongs to the 'util' package
									   // the variable values is an array that has instances of List<Pair<K, V>> as elements
									   // String[] cars means the car array has String as its elements
	private int firstFreeIndex;
	
	public HashMap() {
		this.values = new List[32];
		this.firstFreeIndex = 0;
	}
	
	public V get(K key) {
		int hashValue = Math.abs(key.hashCode() % values.length);
		if(values[hashValue] == null)
			return null;
		
		List<Pair<K, V>> valuesAtIndex = values[hashValue];
		
		for(int i =0; i <valuesAtIndex.size(); i++) {
			if(valuesAtIndex.value(i).getKey().equals(key)) {
				return valuesAtIndex.value(i).getValue();
			}
		}
		return null;
	}
	
	public void add(K key, V value) {
		List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
		int index = getIndexOfKey(valuesAtIndex, key);
		
		if(index <0) {
			valuesAtIndex.add(new Pair<>(key, value));
			firstFreeIndex++;
		}else {
			valuesAtIndex.value(index).setValue(value);
		}
		
		if(1.0 *firstFreeIndex / values.length > 0.75) {
			grow();
		}
	}
	
	private List<Pair<K, V>> getListBasedOnKey(K key){
		int hashValue = Math.abs(key.hashCode() % values.length);
		if(values[hashValue] == null)
			values[hashValue] = new List<>();
		
		return values[hashValue];
	}
	
	private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
		for(int i =0; i <myList.size(); i++) {
			if(myList.value(i).getKey().equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	private void grow() {
		List<Pair<K, V>>[] newValues = new List[values.length *2];
		
		for(int i =0; i <values.length; i++) {
			copy(newValues, i);
		}
		
		values = newValues;
	}
	
	private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
		for(int i =0; i < values[fromIdx].size(); i++) {
			Pair<K, V> value = values[fromIdx].value(i);
			
			int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
			if(newArray[hashValue] == null)
				newArray[hashValue] = new List<>();
			
			newArray[hashValue].add(value);
		}
	}
	
	public V remove(K key) {
		List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
		if(valuesAtIndex.size() == 0) {
			return null;
		}
		
		int index = getIndexOfKey(valuesAtIndex, key);
		if(index <0)
			return null;
		
		Pair<K, V> pair = valuesAtIndex.value(index);
		valuesAtIndex.remove(pair);
		return pair.getValue();
	}
}
