import controllers.UserController;
import dao.UserDao;
import models.User;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		User user = new User();
		UserDao userDao = new UserDao(user);
		UserController userController = new UserController(userDao);
	}
	
}
