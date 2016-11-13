package practice.mockito.dao;

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
}
