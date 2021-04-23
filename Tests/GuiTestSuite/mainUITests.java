package GuiTestSuite;

import airline.*;
import org.junit.jupiter.api.Test;


public class mainUITests {

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
