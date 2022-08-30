package part4.objects_in_a_list;

public class Person {

	private String name;
	private int age;
	private int weight;
	private int height;
	
	public Person(String name) {
		this.name = name;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = 0;
		this.height = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void growOlder() {
		age += 1;
	} 
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	public void setWeight(int newWeight) {
		weight = newWeight;
	}
	
	public double bodyMassIndex() {
		double heightDivByHundred = height / 100;
		return weight / (heightDivByHundred * heightDivByHundred);
	}
	
	@Override
	public String toString() {
		return name + ", age" + age + " years";
	
	 } 
}