import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    Login myLogin;
    User testUser;
    private javax.swing.JButton jButton1;

    //setup to initialize new login object
    @BeforeEach
    public void setup() {
        myLogin = new Login();
    }

    //this test method compares valid info in the database to user input and grants access if valid
    @Test
    @DisplayName("Positive testing with correct credentials and data type")
    public void testLoginButtonPositive() {
        testUser = new User("hh", "hh");
        myLogin.loginButton(testUser.getUsername(), testUser.getPassword());
        assertEquals("validated",  myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword()));
    }

    //this method tests for null characters in a method and compares the output
    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative() {
        testUser = new User(null, null);

        Exception ex = assertThrows(NullPointerException.class, () -> myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword()));
        assertEquals(null, ex.getMessage());

    }

    //This test method uses incorrect data to gain access to the system
    @Test
    @DisplayName("Input validation with correct data type but wrong values")
    public void testLoginButtonInputVal() {
        testUser = new User("fake", "notReal");

        assertEquals("UserName or Password do not Match",  myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword()));


    }
}