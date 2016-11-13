package practice.mockito.service;

import practice.mockito.dao.UserDAO;
import practice.mockito.model.User;

public class UserService {

    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public int getUserBalance(long userId) {
        return 333;
    }

    public User getUserById(long userId) {
        return userDAO.getUserById(userId);
    }
}
