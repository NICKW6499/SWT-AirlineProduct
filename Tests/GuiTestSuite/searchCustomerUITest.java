package GuiTestSuite;

import airline.Main;
import airline.searchCustomer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class searchCustomerUITest {
    Main main;
    searchCustomer customer;

@BeforeEach
    void setup(){
    main = new Main();
    customer = new searchCustomer();
    searchCustomer.txtcustid.setText("CS001");
}
@Test
    void firstNamePopulates(){
    searchCustomer.jButton4.doClick();
    Assertions.assertEquals("nick", searchCustomer.txtfirstname.getText());
}
    @Test
    void lastNamePopulates(){
        searchCustomer.jButton4.doClick();
        Assertions.assertEquals("wright", searchCustomer.txtlastname.getText());
    }
    @Test
    void nickNumbPopulates(){
        searchCustomer.jButton4.doClick();
        Assertions.assertEquals("123", searchCustomer.txtnic.getText());
    }
    @Test
    void genderPopulates(){
        searchCustomer.jButton4.doClick();
        Assertions.assertEquals("Male", searchCustomer.r1.getText());
    }
    @Test
    void contactPopulates(){
        searchCustomer.jButton4.doClick();
        Assertions.assertEquals("123532", searchCustomer.txtcontact.getText());
    }
    @Test
    void menuItem1Test(){
    Main.jMenu1.doClick();
    Main.jMenuItem1.doClick();
    main.dispose();
    }
    @Test
    void menuItem2Test(){
        Main.jMenu1.doClick();
        Main.jMenuItem2.doClick();
        main.dispose();
    }
    @Test
    void menuItem3Test(){
        Main.jMenu2.doClick();
        Main.jMenuItem3.doClick();
        main.dispose();
    }
    @Test
    void menuItem4Test(){
        Main.jMenu2.doClick();
        Main.jMenuItem4.doClick();
        main.dispose();
    }
    @Test
    void menuItem5Test(){
        Main.jMenu3.doClick();
        Main.jMenuItem5.doClick();
        main.dispose();
    }
    @Test
    void menuItem6Test(){
        Main.jMenu4.doClick();
        Main.jMenuItem6.doClick();
        main.dispose();
    }



}
