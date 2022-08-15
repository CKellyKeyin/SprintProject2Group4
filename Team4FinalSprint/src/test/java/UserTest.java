
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.keyin.entity.Breed;
import com.keyin.entity.Health;
import com.keyin.entity.User;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)


public class UserTest {
    @Mock
    private User userUnderTest = Mockito.mock(User.class);

    @Test
    public void testGetId() {
        User userUnderTest = new User();
        userUnderTest.setId(1);
        assertEquals(1, userUnderTest.getId());


    }

    @Test
    public void testGetEmail() {
        User userUnderTest = new User();
        userUnderTest.setEmail("sampleEmail@Keyin.com");
        assertEquals("sampleEmail@Keyin.com", userUnderTest.getId());


    }

    @Test
    public void testGetUserName() {
        User userUnderTest = new User();
        userUnderTest.setUserName("sampleUser1010");
        assertEquals("sampleUser1010", userUnderTest.getUserName());


    }

    @Test
    public void testGetPassword() {
        User userUnderTest = new User();
        userUnderTest.setPassword("password123");
        assertEquals("password123", userUnderTest.getPassword());


    }




}
