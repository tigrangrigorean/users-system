package impl;

public interface Crud {
	void add(String name, int age);
	void removeById(int id);
	void getById(int id);
	void update(int id, String name, int age);
}
