package dao;

import java.util.ArrayList;
import java.util.List;

import impl.Crud;
import models.User;

public class UserDao implements Crud{
	
	User user;
	
	public UserDao(User user) {
		this.user = user;
	}
	
	public List<User> users = new ArrayList<User>();
	int id = 0;
	
	@Override
	public void add(String name, int age) {
		
		id++;
		User user = new User(id,name,age);
		users.add(user);
	}
	@Override
	public void removeById(int id) {
		System.out.println("Removed user by id: " + (id));
		users.remove(id-1);
	}
	@Override
	public void getById(int id) {
		
		System.out.println(users.get(id-1));
		
	}
	
	@Override
	public void update(int id, String name, int age) {
		users.remove(id-1);
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		users.add(user);
	}
	
	
}
