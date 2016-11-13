package practice.mockito.controller;

import practice.mockito.model.User;
import practice.mockito.service.BookingService;
import practice.mockito.service.UserService;

public class UserController {

    private BookingService bookingService;
    private UserService userService;

    public UserController(BookingService bookingService, UserService userService) {
        this.bookingService = bookingService;
        this.userService = userService;
    }

    public int getUserBalance(long userId) {
        return userService.getUserBalance(userId);
    }

    public User getUser(long userId) {
        User user =  userService.getUserById(userId);
        //int tickets = bookingService.getNumberOfTicketsForUser(userId);
        user.setNumberOfTickets(5);

        return user;
    }
}
