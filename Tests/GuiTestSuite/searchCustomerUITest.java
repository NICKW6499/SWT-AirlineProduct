package GuiTestSuite;

import airline.searchCustomer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class searchCustomerUITest {
searchCustomer customer;

@BeforeEach
    void setup(){
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


}
