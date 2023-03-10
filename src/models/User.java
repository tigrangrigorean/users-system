package models;

public class User {
	
	private int id;
	private String name;
	private int age;
	
	/**
	 * Default Constructor
	 */
	public User() {
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " id: " + id + "\n" + "| name: " + name + "\n" + "| age: " + age;
	}
	
	


}
