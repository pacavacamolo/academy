package practice.mockito.dao;

import practice.mockito.model.User;

public class UserDAO {

    public int getUserBalance(long userId) {
        int result = 0;
        if (userId == 1) {
            result = 125;
        }
        else if (userId == 2) {
            result = 200;
        }
        else if (userId == 3) {
            result = 350;
        }
        return result;
    }

    public User getUserById(long userId) {
        User user = new User();
        user.setId(userId);

        if (userId == 1) {
            user.setName("Anton");
            user.setEmail("anton@tut.by");
        } else if (userId == 2) {
            user.setName("Vasya");
            user.setEmail("vasya@tut.by");
        }
        return user;
    }
}
