package UnitTestsSuite;

import airline.Login;
import airline.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class UnitTestsSuite.MainTest
 * This class was created to test that the Main.java class is working properly
 * and that the login.java class was called
 */
class MainTest {
    @Test
    void main() {
        Main main = new Main();
        main.main(null);
        main.dispose();
    }
    @Test
    void loginMain(){
        Login login = new Login();
        login.main(null);
        login.dispose();
    }

}