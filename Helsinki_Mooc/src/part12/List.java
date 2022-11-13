package part12;

public class List<Type> {
	private Type[] values;
	private int firstFreeIndex;
	
	public List() {
		this.values = (Type[]) new Object[10];	
		this.firstFreeIndex = 0;
	}
	
	public void add(Type value) {
		if(firstFreeIndex == values.length)
			grow();
		
		this.values[firstFreeIndex] = value;
		firstFreeIndex++;
	}
	
	private void grow() { // will be used only within this class, hence private
		int newSize = values.length + values.length /2;
		Type[] newValues = (Type[]) new Object[newSize];
		for(int i =0; i < values.length; i++)
			newValues[i] = this.values[i];
		
		values = newValues;
	}
	
	public boolean contains(Type value) {
		return indexOfValue(value) >=0; // returns true if the index value is larger than, or equal to 0
	}
	
	public void remove(Type value) {
		int indexOfValue = indexOfValue(value);
		if(indexOfValue <0)
			return;
		
		moveToTheLeft(indexOfValue);
		firstFreeIndex--;
	/*
	 * If the value sits on the last index of the list,
	 * the value does not get removed after the remove() method gets carries out.
	 * Rather, because the value of firstFreeIndex has been decremented by one, 
	 * the next time the contains() method gets called, it stops the search 
	 * before it gets to the "last"(now "hidden") element.
	 * If you manipulate the contains() method by adding 'firstFreeIndex++' before the loop,
	 * you can actually see the value that was supposed to be removed is still there, just out of reach
	 */
	}
	
	public int indexOfValue(Type value) {
		for(int i =0; i <firstFreeIndex; i++) {
			if(values[i].equals(value))
				return i;
		}
		return -1;
	}
	
	private void moveToTheLeft(int fromIndex) {
		for(int i =fromIndex; i <firstFreeIndex - 1; i++)
			values[i] = values[i+1];
	}
	
	public Type value(int index) {
		if(index <0 || index >= firstFreeIndex) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return values[index];
	}
	
	public int size() {
		return firstFreeIndex;
	}
	
	public static void main(String[] args) {
		List<String> myList = new List<>();
		System.out.println(myList.contains("hello"));
		myList.add("hello");
		System.out.println(myList.contains("hello"));
		int index = myList.indexOfValue("hello");
		System.out.println(index);
		System.out.println(myList.value(index));
		myList.remove("hello");
		System.out.println(myList.contains("hello"));
		myList.add("hello");
		myList.add("world");

		for(int i = 0; i < myList.size(); i++) {
		    System.out.println(myList.value(i));
		}
	}
}
