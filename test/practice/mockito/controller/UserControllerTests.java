package practice.mockito.controller;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
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

    @Before
    public void setup() {
        Mockito.when(userService.getUserBalance(1L)).thenReturn(125);
    }

    @Test
    public void test_getUserBalance() {
        int result = userController.getUserBalance(1L);

        Assert.assertEquals(125, result);

        Mockito.verify(userService).getUserBalance(1L);

        Mockito.verify(userService, Mockito.times(1)).getUserBalance(1L);

    }
}
