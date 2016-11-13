package practice.mockito.service;

import practice.mockito.dao.UserDAO;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public int getUserBalance(long userId) {
        return userDAO.getUserBalance(userId);
    }
}
