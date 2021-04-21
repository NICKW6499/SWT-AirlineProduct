package UnitTestsSuite;

import airline.Login;
import airline.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class UnitTestsSuite.LoginTest
 * User class was created to hold user information for the sake of comparing inputs for testing.
 * <p>
 * Equivalence partitioning is used to test instances of valid login inputs, null values, and empty inputs.
 * <p>
 * Block 1: Valid login attempt.
 * Block 2: Null login values.
 * Block 3: Invalid login values.
 **/
class LoginTest {
    Login myLogin;
    User testUser;

    // setup to initialize new login object
    @BeforeEach
    public void setup() {
        myLogin = new Login();
    }

    /**
     * Test Case ID: Test Criteria #1 - Positive Testing
     * Requirement ID/Decription: F1 - The flight booking program shall allow a user to log on using a valid
     * username and password combination.
     * Purpose: Test method compares valid info in the database to user input and grants access if input is valid.
     * Test setup: A new User object is created with username value "john" and password value "123".
     * Test strategy: Equivalence Class Testing
     * -- This test covers the input space of Block 1, valid login attempt.
     * Input: Call Login method with testUser.getUsername() and testUser.getPassword()
     * Expected Output: Returns "validated" after assertion compares testUser with what is registered in
     * the database.
     **/
    @Test
    @DisplayName("Positive testing with correct credentials and data type")
    public void testLoginButtonPositive() {
        testUser = new User("hh", "hh");
        Login.jButton1.doClick();
        myLogin.loginButton(testUser.getUsername(), testUser.getPassword());
        Assertions.assertEquals("validated", myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword()));
    }

    /**
     * Test Case ID: Test Criteria #2 - Negative Testing
     * Requirement ID/Decription: F1 - The flight booking program shall allow a user to log on using a valid
     * username and password combination.
     * Purpose: To test that the program handles a NullPointerException properly given null inputs during
     * a login attempt.
     * Test setup: A new User object is created with username and password value set as null.
     * Test strategy: Equivalence Class Testing
     * -- This test covers the input space of Block 2, null login values.
     * Input: Null username and password values.
     * Expected Output: The NullPointerException should be caught and output the NullPointerException
     * message "null".
     **/
    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative() {
        testUser = new User(null, null);
        Assertions.assertEquals("UserName or Password Blank", myLogin.loginButton(testUser.getUsername(), testUser.getPassword()));

    }
    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative2() {
        testUser = new User(null, "nick");
        Assertions.assertEquals("UserName or Password Blank", myLogin.loginButton(testUser.getUsername(), testUser.getPassword()));

    }

    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative3() {
        testUser = new User("nick", null);
        Assertions.assertEquals("UserName or Password Blank", myLogin.loginButton(testUser.getUsername(), testUser.getPassword()));

    }
    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative4() {
        testUser = new User("nick", "");
        Assertions.assertEquals("UserName or Password Blank", myLogin.loginButton(testUser.getUsername(), testUser.getPassword()));

    }
    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative5() {
        testUser = new User("", "nick");
        Assertions.assertEquals("UserName or Password Blank", myLogin.loginButton(testUser.getUsername(), testUser.getPassword()));

    }

    /**
     * Test Case ID: Testing Criteria #3 - Input validation testing
     * Requirement ID/Decription: F1 - The flight booking program shall allow a user to log on using a valid
     * username and password combination.
     * Purpose: To test a login attempt with unregistered username and password values.
     * Test setup: A new User object is created with username value "fake" and password value "notReal".
     * Test strategy: Equivalence Class Testing
     * -- This test covers the input space of Block 3, invalid login values.
     * Input: Call Login method with testUser.getUsername() and testUser.getPassword()
     * Expected Output: Output string displayed on the GUI “UserName or Password do not Match”.
     **/
    @Test
    @DisplayName("Input validation with correct data type but wrong values")
    public void testLoginButtonInputVal() {
        testUser = new User("fake", "notReal");

        Assertions.assertEquals("UserName or Password do not Match", myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword()));
    }

}