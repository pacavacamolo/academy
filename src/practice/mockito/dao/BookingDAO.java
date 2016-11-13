package practice.mockito.dao;

public class BookingDAO {

    public int getNumberOfTicketsForUser(long userId) {
        int result = 0;

        if (userId == 1) {
            result = 4;
        } else if (userId == 2) {
            result = 8;
        }
        return result;
    }
}
