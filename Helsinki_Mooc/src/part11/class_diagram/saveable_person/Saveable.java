package part11.class_diagram.saveable_person;

public interface Saveable {
	public void save();
	public void delete();
	public void load(String address);
}
