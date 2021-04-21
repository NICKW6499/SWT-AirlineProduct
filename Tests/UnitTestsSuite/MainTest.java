package UnitTestsSuite;

import airline.Login;
import airline.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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