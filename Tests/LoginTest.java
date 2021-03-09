import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.awt.*;
import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    Login myLogin;
    User testUser;

    @BeforeEach
    public void setup() {
        myLogin = new Login();
    }

    @Test
    @DisplayName("Positive testing with correct credentials and data type")
    public void testLoginButtonPositive() {
        testUser = new User("hh", "hh");
        myLogin.loginButton(testUser.getUsername(), testUser.getPassword());
    }

    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative() {
        testUser = new User(null, null);

        Exception ex = assertThrows(NullPointerException.class, () -> myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword()));
        assertEquals(null, ex.getMessage());

    }

    @Test
    @DisplayName("Input validation with correct data type but wrong values")
    public void testLoginButtonInputVal() {
        testUser = new User("fake", "notReal");
        myLogin.loginButton(testUser.getUsername(), testUser.getPassword());


    }
}