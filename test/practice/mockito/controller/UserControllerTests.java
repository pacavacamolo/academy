package practice.mockito.controller;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import practice.mockito.model.User;
import practice.mockito.service.BookingService;
import practice.mockito.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTests {

    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;

    @Mock
    BookingService bookingService;

    @Spy
    List<String> testList = new ArrayList<>();

    @Before
    public void setup() {
        //для первого теста
        Mockito.when(userService.getUserBalance(1L)).thenReturn(125);

        User user = new User();
        user.setId(20L);
        user.setEmail("email");
        user.setName("petya");

        //для второго теста
        Mockito.when(bookingService.getNumberOfTicketsForUser(20L)).thenReturn(25);
        Mockito.when(userService.getUserById(20L)).thenReturn(user);

    }

    @Test
    public void test_getUserBalance() {
        int result = userController.getUserBalance(1L);

        Assert.assertEquals(125, result);

        Mockito.verify(userService).getUserBalance(1L);

        Mockito.verify(userService, Mockito.times(1)).getUserBalance(1L);

        Mockito.when(testList.size()).thenReturn(100);
        int size = testList.size();
        Assert.assertEquals(100, testList.size());

    }

    @Test
    public void test_getUser() {
        User result = userController.getUser(20L);

        Assert.assertNotNull(result);
        Assert.assertEquals("email", result.getEmail());
        Assert.assertEquals("petya", result.getName());
        Assert.assertEquals(25, result.getNumberOfTickets());



    }

}
