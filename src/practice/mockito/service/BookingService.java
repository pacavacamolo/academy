package practice.mockito.service;

import practice.mockito.dao.BookingDAO;

public class BookingService {

    private BookingDAO bookingDAO;

    public int getNumberOfTicketsForUser(long userId) {
        return bookingDAO.getNumberOfTicketsForUser(userId);
    }

}
