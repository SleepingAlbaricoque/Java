package part11.class_diagram.saveable_person;

public class Person implements Saveable{
	private String name;
	private String address;
	
	@Override
	public void save() {}
	
	@Override
	public void delete() {}
	
	@Override
	public void load(String address) {}
	
}
