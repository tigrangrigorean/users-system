package controllers;

import java.util.Scanner;

import dao.UserDao;
import views.Window;

public class UserController {
	
	UserDao userDao;
	
	public UserController(UserDao userDao) {
		this.userDao = userDao;
		startConsole();
	}

	void startConsole() {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose number:");
		System.out.println(" 1. Add \n 2. Remove \n 3. Get By Id \n 4. Show \n 5. Update \n 6. Exit");
		int num = sc.nextInt();
		int number;
		
		switch(num) {
		case 1:
			System.out.println("name: ");
			String name = sc.next();
			System.out.println("age: ");
			int age = sc.nextInt();
			userDao.add(name,age);
			break;
		case 2:
			System.out.println("Enter id for remove by id");
			 number = sc.nextInt();
			userDao.removeById(number);
			break;
		case 3:
			System.out.println("Enter id for get by id");
			 number = sc.nextInt();
			userDao.getById(number);
			break;
		case 4:
			Window window = new Window(userDao);
			break;
		case 5:
			System.out.println("Enter id , name, age");
			int id = sc.nextInt();
			String namee = sc.next();
			int agee = sc.nextInt();
			userDao.update(id, namee, agee);
			break;
		case 6:
			System.exit(0);
			break;
		default: 
			System.out.println("You are entered invalid number");
		}
	}
	}
	
}
