package views;

import java.awt.Label;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.UserDao;

public class Window extends JFrame{
	
	JFrame info = new JFrame();
	Label label;
	UserDao userDao;
	
	public Window(UserDao userDao) {
		this.userDao = userDao;
		config();
		showInfo();
	}
	
	public void showInfo() {
		
	Label[] labelarray = new Label[userDao.users.size()];
		
	for(int i = 0,j = 10; i<userDao.users.size(); i++, j+=30) {
	labelarray[i] = new Label(userDao.users.get(i).toString());
	labelarray[i].setBounds(200,j,200,30);
	info.add(labelarray[i]);
	}
	}
	public void config() {
		info.setLayout(null);
		info.setVisible(true);
		info.setSize(700,700);
		info.setResizable(false);
	}
	
	
	
}
